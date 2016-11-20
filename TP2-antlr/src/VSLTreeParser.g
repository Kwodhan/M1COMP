tree grammar VSLTreeParser;

options {
  language     = Java;
  tokenVocab   = VSLParser;
  ASTLabelType = CommonTree;
}



s [SymbolTable symTab] returns [Code3a code]
    : b1=program[symTab] {code = $b1.code;}
    ;

program [SymbolTable symTab] returns [Code3a code]
    : ^(PROG (u=unit[symTab] {code = $u.code;})+)
    ;

unit [SymbolTable symTab] returns [Code3a code]
    : f=function[symTab] {code = $f.code;}
    | p=proto[symTab]{code = $p.code;}
    ;

function [SymbolTable symTab] returns [Code3a code]
    : ^(FUNC_KW t1=type IDENT {
	LabelSymbol l1 = new LabelSymbol($IDENT.text);
	code = Code3aGenerator.genLabel(l1);
	code.append(Code3aGenerator.genBeginFunc());
	FunctionType ft1 = new FunctionType($t1.returnType,false);
	} 
	pl=param_list[symTab,ft1] {
	code.append($pl.code);
	}
	b=body[symTab] {
	code.append($b.code);
	FunctionSymbol fs1 = new FunctionSymbol(l1,ft1);
	symTab.insert($IDENT.text,fs1);
	})
    ;

body [SymbolTable symTab] returns [Code3a code]
	:^(BODY s1=statement[symTab]{
	code=$s1.code;
	code.append(Code3aGenerator.genEndFunc());
	})
	;

proto [SymbolTable symTab] returns [Code3a code]
    : ^(PROTO_KW t1=type IDENT 
	 {
	LabelSymbol l1 = new LabelSymbol($IDENT.text);
	FunctionType ft1 = new FunctionType($t1.returnType);
	/*ajouter param dans ft1*/
	
	
	}
	pl=param_list[symTab,ft1]{
	FunctionSymbol fs1 = new FunctionSymbol(l1,ft1);
	symTab.insert($IDENT.text,fs1);
	})
    ;


type  returns [Type returnType]
    : INT_KW {returnType =Type.INT;}
    | VOID_KW {returnType =Type.VOID;}
    ;

param_list [SymbolTable symTab,FunctionType ft1] returns [Code3a code]
@init { code = new Code3a();}
    :^(PARAM (param[symTab,ft1] {code.append($param.code);})*) // il y en a au moins 1 parametre
    | PARAM	// il n'y a pas de parametre
    ;

param [SymbolTable symTab,FunctionType ft1] returns [Code3a code]
    : IDENT {int i = symTab.getScope()+1; // demande à la prof pour les scopes de function d'une ligne
				VarSymbol op = new VarSymbol(Type.INT,$IDENT.text,i);
				op.setParam();
				ft1.extend(Type.INT);
				Code3a cod = Code3aGenerator.genVar(op);
				symTab.insert($IDENT.text,op);
				code = cod;		
	}
    ;

block [SymbolTable symTab] returns [Code3a code]
@init { symTab.enterScope();}
@after { symTab.leaveScope();}
    :
	 ^(BLOCK d1=declaration[symTab] i1=inst_list[symTab]) { $code = $d1.code; $code.append($i1.code);}
	|^(BLOCK i1=inst_list[symTab]) {$code = $i1.code; }
	;

declaration [SymbolTable symTab] returns [Code3a code]
@init { code = new Code3a();}  :
  ^(DECL (d1=decl_item[symTab] { code.append($d1.code);})+ ) 
	
  ;

decl_item [SymbolTable symTab] returns [Code3a code]
    : IDENT {
			Operand3a id = symTab.lookup($IDENT.text);
			if(id!=null && id.getScope() == symTab.getScope()&& id.isVarInteger()){
				Errors.redefinedIdentifier($IDENT,$IDENT.text,"");
			}
			else{
				int i = symTab.getScope();
				VarSymbol op = new VarSymbol(Type.INT,$IDENT.text,i);
				Code3a cod = Code3aGenerator.genVar(op);
				symTab.insert($IDENT.text,op);
				code = cod;		
			}
			}
	|^(ARDECL IDENT INTEGER{
	Operand3a id = symTab.lookup($IDENT.text);
			if(id!=null && id.getScope() == symTab.getScope() && id.isVarInteger()){
				Errors.redefinedIdentifier($IDENT,$IDENT.text,"");
			}
			else{
				int i = symTab.getScope();
				VarSymbol op = new VarSymbol(Type.INT,$IDENT.text,i);
				Code3a cod = Code3aGenerator.genVar(op);
				symTab.insert($IDENT.text,op);
				code = cod;		
			}	
	}
	)
    ;

inst_list [SymbolTable symTab] returns [Code3a code]
@init { code = new Code3a();}  :
	^(INST (s1=statement[symTab] {code.append($s1.code);} )+)
	;

statement [SymbolTable symTab] returns [Code3a code]
@init { code = new Code3a();}
    :
	^(ASSIGN_KW e1=expression[symTab] IDENT){
		// verif si variable  existe
		Operand3a id = symTab.lookup($IDENT.text);
		if(id!=null && id.isVarInteger())
      		code = Code3aGenerator.genAff(Inst3a.TAC.COPY,id,$e1.expAtt);
		else 
			Errors.unknownIdentifier($IDENT,$IDENT.text,"");
	}
	|b1=block[symTab] { code = $b1.code; }
    | ^(IF_KW e1=expression[symTab] st1=statement[symTab] {

		LabelSymbol l1 = SymbDistrib.newLabel();
		code = Code3aGenerator.genIfz(Inst3a.TAC.IFZ,l1,e1);  
		code.append($st1.code);
		LabelSymbol l2 = SymbDistrib.newLabel();
		code.append(Code3aGenerator.genGoto(Inst3a.TAC.GOTO, l2));
		code.append(Code3aGenerator.genLabel(l1));
	}  

	(st2=statement[symTab] {code.append($st2.code);})? 
	{
		code.append(Code3aGenerator.genLabel(l2));
	}
	)
	|^(WHILE_KW e1=expression[symTab] st1=statement[symTab] 
	{
	LabelSymbol l1 = SymbDistrib.newLabel();
	LabelSymbol l2 = SymbDistrib.newLabel();
	code = Code3aGenerator.genLabel(l1);
	code.append(Code3aGenerator.genIfz(Inst3a.TAC.IFZ,l2,e1)); 
	code.append($st1.code);
	code.append(Code3aGenerator.genGoto(Inst3a.TAC.GOTO, l1));
	code.append(Code3aGenerator.genLabel(l2));
	} 
	)
	| ^(PRINT_KW (p1=print_item[symTab] { code.append($p1.code);})+)
    | ^(READ_KW (r1=read_item[symTab]  { code.append($r1.code);})+)
    ;

print_item [SymbolTable symTab] returns [Code3a code]
    : TEXT {
	Data3a data = new Data3a($TEXT.text);
 	code = Code3aGenerator.genArg(Inst3a.TAC.ARG,data.getLabel());
	code.append(Code3aGenerator.genCall(Inst3a.TAC.CALL,new LabelSymbol("L4")));
	code.appendData(data);
	}
    | e1=expression[symTab]{

	code = Code3aGenerator.genArg(Inst3a.TAC.ARG,e1);
	code.append(Code3aGenerator.genCall(Inst3a.TAC.CALL,new LabelSymbol("L2")) );
	}
    ;

read_item [SymbolTable symTab] returns [Code3a code]
    : IDENT {
		Operand3a id = symTab.lookup($IDENT.text);
		if(id!=null && id.isVarInteger())
      		code = Code3aGenerator.genRead(id);
		else 
			Errors.unknownIdentifier($IDENT,$IDENT.text,"");
	}

    ;


expression [SymbolTable symTab] returns [ExpAttribute expAtt]
  :
  ^(NEGAT e1=expression[symTab])
    { 
      Type ty = TypeCheck.checkUniOp(e1.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genUniOp(Inst3a.TAC.NEG,temp,e1);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  |
  ^(MUL e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.MUL, temp, e1, e2);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  |^(DIV e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.DIV, temp, e1, e2);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  |^(PLUS e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.ADD, temp, e1, e2);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  |^(MINUS e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.SUB, temp, e1, e2);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  | pe=primary_exp[symTab] 
    { expAtt = pe; }
  ;




primary_exp [SymbolTable symTab] returns [ExpAttribute expAtt]
  : INTEGER
    {
      ConstSymbol cs = new ConstSymbol(Integer.parseInt($INTEGER.text));
      expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
    }
  | IDENT
    {
	  // verif si existe
		Operand3a id = symTab.lookup($IDENT.text);
		if(id!=null && id.isVarInteger())
      		expAtt = new ExpAttribute(id.type, new Code3a(), symTab.lookup($IDENT.text));
		else 
			Errors.unknownIdentifier($IDENT,$IDENT.text,"") ;
    }
  ;
