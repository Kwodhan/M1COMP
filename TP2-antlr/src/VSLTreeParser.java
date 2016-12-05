// $ANTLR 3.5.2 ./src/VSLTreeParser.g 2016-12-05 18:17:15

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VSLTreeParser extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASCII", "ASSIGN_KW", "COM", "COMMENT", 
		"DIGIT", "DIV", "DO_KW", "ELSE_KW", "FI_KW", "FUNC_KW", "IDENT", "IF_KW", 
		"INTEGER", "INT_KW", "LB", "LC", "LETTER", "LP", "MINUS", "MUL", "OD_KW", 
		"PLUS", "PRINT_KW", "PROTO_KW", "RB", "RC", "READ_KW", "RETURN_KW", "RP", 
		"TEXT", "THEN_KW", "VOID_KW", "WHILE_KW", "WS", "ARDECL", "ARELEM", "ARRAY", 
		"BLOCK", "BODY", "DECL", "FCALL", "FCALL_S", "INST", "NEGAT", "PARAM", 
		"PROG"
	};
	public static final int EOF=-1;
	public static final int ASCII=4;
	public static final int ASSIGN_KW=5;
	public static final int COM=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int DIV=9;
	public static final int DO_KW=10;
	public static final int ELSE_KW=11;
	public static final int FI_KW=12;
	public static final int FUNC_KW=13;
	public static final int IDENT=14;
	public static final int IF_KW=15;
	public static final int INTEGER=16;
	public static final int INT_KW=17;
	public static final int LB=18;
	public static final int LC=19;
	public static final int LETTER=20;
	public static final int LP=21;
	public static final int MINUS=22;
	public static final int MUL=23;
	public static final int OD_KW=24;
	public static final int PLUS=25;
	public static final int PRINT_KW=26;
	public static final int PROTO_KW=27;
	public static final int RB=28;
	public static final int RC=29;
	public static final int READ_KW=30;
	public static final int RETURN_KW=31;
	public static final int RP=32;
	public static final int TEXT=33;
	public static final int THEN_KW=34;
	public static final int VOID_KW=35;
	public static final int WHILE_KW=36;
	public static final int WS=37;
	public static final int ARDECL=38;
	public static final int ARELEM=39;
	public static final int ARRAY=40;
	public static final int BLOCK=41;
	public static final int BODY=42;
	public static final int DECL=43;
	public static final int FCALL=44;
	public static final int FCALL_S=45;
	public static final int INST=46;
	public static final int NEGAT=47;
	public static final int PARAM=48;
	public static final int PROG=49;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public VSLTreeParser(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public VSLTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return VSLTreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./src/VSLTreeParser.g"; }



	// $ANTLR start "s"
	// ./src/VSLTreeParser.g:12:1: s[SymbolTable symTab] returns [Code3a code] : b1= program[symTab] ;
	public final Code3a s(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a b1 =null;

		try {
			// ./src/VSLTreeParser.g:13:5: (b1= program[symTab] )
			// ./src/VSLTreeParser.g:13:7: b1= program[symTab]
			{
			pushFollow(FOLLOW_program_in_s66);
			b1=program(symTab);
			state._fsp--;

			code = b1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "s"



	// $ANTLR start "program"
	// ./src/VSLTreeParser.g:16:1: program[SymbolTable symTab] returns [Code3a code] : ^( PROG (u= unit[symTab] )+ ) ;
	public final Code3a program(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a u =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:18:5: ( ^( PROG (u= unit[symTab] )+ ) )
			// ./src/VSLTreeParser.g:18:7: ^( PROG (u= unit[symTab] )+ )
			{
			match(input,PROG,FOLLOW_PROG_in_program98); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:18:14: (u= unit[symTab] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC_KW||LA1_0==PROTO_KW) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./src/VSLTreeParser.g:18:15: u= unit[symTab]
					{
					pushFollow(FOLLOW_unit_in_program103);
					u=unit(symTab);
					state._fsp--;

					code.append(u);
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "program"



	// $ANTLR start "unit"
	// ./src/VSLTreeParser.g:21:1: unit[SymbolTable symTab] returns [Code3a code] : (f= function[symTab] |p= proto[symTab] );
	public final Code3a unit(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a f =null;
		Code3a p =null;

		try {
			// ./src/VSLTreeParser.g:22:5: (f= function[symTab] |p= proto[symTab] )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FUNC_KW) ) {
				alt2=1;
			}
			else if ( (LA2_0==PROTO_KW) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ./src/VSLTreeParser.g:22:7: f= function[symTab]
					{
					pushFollow(FOLLOW_function_in_unit134);
					f=function(symTab);
					state._fsp--;

					code = f;
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:23:7: p= proto[symTab]
					{
					pushFollow(FOLLOW_proto_in_unit147);
					p=proto(symTab);
					state._fsp--;

					code = p;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "unit"



	// $ANTLR start "function"
	// ./src/VSLTreeParser.g:26:1: function[SymbolTable symTab] returns [Code3a code] : ^( FUNC_KW t1= type IDENT pl= param_list[symTab,ft1] b= body[symTab] ) ;
	public final Code3a function(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT1=null;
		Type t1 =null;
		TreeRuleReturnScope pl =null;
		Code3a b =null;

		try {
			// ./src/VSLTreeParser.g:29:5: ( ^( FUNC_KW t1= type IDENT pl= param_list[symTab,ft1] b= body[symTab] ) )
			// ./src/VSLTreeParser.g:29:7: ^( FUNC_KW t1= type IDENT pl= param_list[symTab,ft1] b= body[symTab] )
			{
			match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function175); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_function179);
			t1=type();
			state._fsp--;

			IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function181); 

				Operand3a id = symTab.lookup((IDENT1!=null?IDENT1.getText():null));
				code = new Code3a();
				LabelSymbol l1 = new LabelSymbol((IDENT1!=null?IDENT1.getText():null));
				code.append(Code3aGenerator.genLabel(l1));
				code.append(Code3aGenerator.genBeginFunc());
				FunctionType ft1 = new FunctionType(t1,false);
				symTab.enterScope();
				
			pushFollow(FOLLOW_param_list_in_function189);
			pl=param_list(symTab, ft1);
			state._fsp--;


				symTab.enterScope();
				code.append((pl!=null?((VSLTreeParser.param_list_return)pl).code:null));
				
				
			pushFollow(FOLLOW_body_in_function197);
			b=body(symTab);
			state._fsp--;



					code.append(b);
					symTab.leaveScope();
					FunctionSymbol fs1 = new FunctionSymbol(l1,ft1);
				if(TypeCheck.checkFunctionDef(id,IDENT1,(IDENT1!=null?IDENT1.getText():null)) && TypeCheck.checkFunctionProto(id,IDENT1,fs1) ){
					symTab.insert((IDENT1!=null?IDENT1.getText():null),fs1);
				}else{
					code=new Code3a();
				}
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "function"



	// $ANTLR start "body"
	// ./src/VSLTreeParser.g:56:1: body[SymbolTable symTab] returns [Code3a code] : ^( BODY s1= statement[symTab] ) ;
	public final Code3a body(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a s1 =null;

		try {
			// ./src/VSLTreeParser.g:57:2: ( ^( BODY s1= statement[symTab] ) )
			// ./src/VSLTreeParser.g:57:3: ^( BODY s1= statement[symTab] )
			{
			match(input,BODY,FOLLOW_BODY_in_body221); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_body225);
			s1=statement(symTab);
			state._fsp--;


				code=s1;
				code.append(Code3aGenerator.genEndFunc());
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "body"



	// $ANTLR start "proto"
	// ./src/VSLTreeParser.g:63:1: proto[SymbolTable symTab] returns [Code3a code] : ^( PROTO_KW t1= type IDENT param_list[symTab,ft1] ) ;
	public final Code3a proto(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT2=null;
		Type t1 =null;

		try {
			// ./src/VSLTreeParser.g:65:5: ( ^( PROTO_KW t1= type IDENT param_list[symTab,ft1] ) )
			// ./src/VSLTreeParser.g:65:7: ^( PROTO_KW t1= type IDENT param_list[symTab,ft1] )
			{
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto250); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto254);
			t1=type();
			state._fsp--;

			IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto256); 

				Operand3a id = symTab.lookup((IDENT2!=null?IDENT2.getText():null));
				
				LabelSymbol l1 = new LabelSymbol((IDENT2!=null?IDENT2.getText():null));
				FunctionType ft1 = new FunctionType(t1);
				symTab.enterScope();
				
			pushFollow(FOLLOW_param_list_in_proto264);
			param_list(symTab, ft1);
			state._fsp--;


				
			 	symTab.leaveScope();
				FunctionSymbol fs1 = new FunctionSymbol(l1,ft1);
				if(TypeCheck.checkFunctionDef(id,IDENT2,(IDENT2!=null?IDENT2.getText():null))){
					symTab.insert((IDENT2!=null?IDENT2.getText():null),fs1);
				}else {
					code =new Code3a();	
				}
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "proto"



	// $ANTLR start "type"
	// ./src/VSLTreeParser.g:86:1: type returns [Type returnType] : ( INT_KW | VOID_KW );
	public final Type type() throws RecognitionException {
		Type returnType = null;


		try {
			// ./src/VSLTreeParser.g:87:5: ( INT_KW | VOID_KW )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==INT_KW) ) {
				alt3=1;
			}
			else if ( (LA3_0==VOID_KW) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// ./src/VSLTreeParser.g:87:7: INT_KW
					{
					match(input,INT_KW,FOLLOW_INT_KW_in_type290); 
					returnType =Type.INT;
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:88:7: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type300); 
					returnType =Type.VOID;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return returnType;
	}
	// $ANTLR end "type"


	public static class param_list_return extends TreeRuleReturnScope {
		public Code3a code;
		public int nb;
	};


	// $ANTLR start "param_list"
	// ./src/VSLTreeParser.g:91:1: param_list[SymbolTable symTab,FunctionType ft1] returns [Code3a code,int nb] : ( ^( PARAM ( param[symTab,ft1] )* ) | PARAM );
	public final VSLTreeParser.param_list_return param_list(SymbolTable symTab, FunctionType ft1) throws RecognitionException {
		VSLTreeParser.param_list_return retval = new VSLTreeParser.param_list_return();
		retval.start = input.LT(1);

		Code3a param3 =null;

		 retval.code = new Code3a();retval.nb =0;
		try {
			// ./src/VSLTreeParser.g:93:5: ( ^( PARAM ( param[symTab,ft1] )* ) | PARAM )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==PARAM) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==DOWN) ) {
					alt5=1;
				}
				else if ( (LA5_1==UP||LA5_1==BODY) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ./src/VSLTreeParser.g:93:6: ^( PARAM ( param[symTab,ft1] )* )
					{
					match(input,PARAM,FOLLOW_PARAM_in_param_list330); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// ./src/VSLTreeParser.g:93:14: ( param[symTab,ft1] )*
						loop4:
						while (true) {
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==IDENT||LA4_0==ARRAY) ) {
								alt4=1;
							}

							switch (alt4) {
							case 1 :
								// ./src/VSLTreeParser.g:93:15: param[symTab,ft1]
								{
								pushFollow(FOLLOW_param_in_param_list333);
								param3=param(symTab, ft1);
								state._fsp--;

								retval.code.append(param3);retval.nb++;
								}
								break;

							default :
								break loop4;
							}
						}

						match(input, Token.UP, null); 
					}

					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:94:7: PARAM
					{
					match(input,PARAM,FOLLOW_PARAM_in_param_list348); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list"



	// $ANTLR start "param"
	// ./src/VSLTreeParser.g:97:1: param[SymbolTable symTab,FunctionType ft1] returns [Code3a code] : ( IDENT | ^( ARRAY IDENT ) );
	public final Code3a param(SymbolTable symTab, FunctionType ft1) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT4=null;
		CommonTree IDENT5=null;

		try {
			// ./src/VSLTreeParser.g:98:5: ( IDENT | ^( ARRAY IDENT ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENT) ) {
				alt6=1;
			}
			else if ( (LA6_0==ARRAY) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ./src/VSLTreeParser.g:98:7: IDENT
					{
					IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param372); 

							
							int i = symTab.getScope();
							VarSymbol op = new VarSymbol(Type.INT,(IDENT4!=null?IDENT4.getText():null),i);
							op.setParam();
							ft1.extend(Type.INT);
							Code3a cod = Code3aGenerator.genVar(op);
							symTab.insert((IDENT4!=null?IDENT4.getText():null),op);
							code = cod;		
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:108:3: ^( ARRAY IDENT )
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_param379); 
					match(input, Token.DOWN, null); 
					IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param381); 
					match(input, Token.UP, null); 


							int i = symTab.getScope();
							VarSymbol op = new VarSymbol(Type.POINTER,(IDENT5!=null?IDENT5.getText():null),i);
							op.setParam();
							ft1.extend(Type.POINTER);
							Code3a cod = Code3aGenerator.genVar(op);
							symTab.insert((IDENT5!=null?IDENT5.getText():null),op);
							code = cod;					
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "param"



	// $ANTLR start "block"
	// ./src/VSLTreeParser.g:119:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK d1= declaration[symTab] i1= inst_list[symTab] ) | ^( BLOCK i1= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a d1 =null;
		Code3a i1 =null;

		 symTab.enterScope();
		try {
			// ./src/VSLTreeParser.g:122:5: ( ^( BLOCK d1= declaration[symTab] i1= inst_list[symTab] ) | ^( BLOCK i1= inst_list[symTab] ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==BLOCK) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==DECL) ) {
						alt7=1;
					}
					else if ( (LA7_2==INST) ) {
						alt7=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// ./src/VSLTreeParser.g:123:3: ^( BLOCK d1= declaration[symTab] i1= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block419); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block423);
					d1=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block428);
					i1=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 code = d1; code.append(i1);
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:124:3: ^( BLOCK i1= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block437); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block441);
					i1=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					code = i1; 
					}
					break;

			}
			 symTab.leaveScope();
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "block"



	// $ANTLR start "declaration"
	// ./src/VSLTreeParser.g:127:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (d1= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a d1 =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:128:32: ( ^( DECL (d1= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:129:3: ^( DECL (d1= decl_item[symTab] )+ )
			{
			match(input,DECL,FOLLOW_DECL_in_declaration470); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:129:10: (d1= decl_item[symTab] )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==IDENT||LA8_0==ARDECL) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ./src/VSLTreeParser.g:129:11: d1= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration475);
					d1=decl_item(symTab);
					state._fsp--;

					 code.append(d1);
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "decl_item"
	// ./src/VSLTreeParser.g:133:1: decl_item[SymbolTable symTab] returns [Code3a code] : ( IDENT | ^( ARDECL IDENT INTEGER ) );
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT6=null;
		CommonTree IDENT7=null;
		CommonTree INTEGER8=null;

		try {
			// ./src/VSLTreeParser.g:134:5: ( IDENT | ^( ARDECL IDENT INTEGER ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENT) ) {
				alt9=1;
			}
			else if ( (LA9_0==ARDECL) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// ./src/VSLTreeParser.g:134:7: IDENT
					{
					IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item506); 

							Operand3a id = symTab.lookup((IDENT6!=null?IDENT6.getText():null));
							if(TypeCheck.checkIdentDecla(id,IDENT6,(IDENT6!=null?IDENT6.getText():null),symTab)){
								code = Code3aGenerator.genDeclaINT((IDENT6!=null?IDENT6.getText():null),symTab);
							}else{
								code =new Code3a();
							}
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:142:3: ^( ARDECL IDENT INTEGER )
					{
					match(input,ARDECL,FOLLOW_ARDECL_in_decl_item513); 
					match(input, Token.DOWN, null); 
					IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item515); 
					INTEGER8=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_decl_item517); 

							Operand3a id = symTab.lookup((IDENT7!=null?IDENT7.getText():null));
							if(TypeCheck.checkIdentDecla(id,IDENT7,(IDENT7!=null?IDENT7.getText():null),symTab)){
								code =  Code3aGenerator.genDeclaTab((IDENT7!=null?IDENT7.getText():null),(INTEGER8!=null?Integer.valueOf(INTEGER8.getText()):0),symTab);
							}else{
								code =new Code3a();
							}
								
						
					match(input, Token.UP, null); 

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "decl_item"



	// $ANTLR start "inst_list"
	// ./src/VSLTreeParser.g:154:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (s1= statement[symTab] )+ ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a s1 =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:155:32: ( ^( INST (s1= statement[symTab] )+ ) )
			// ./src/VSLTreeParser.g:156:2: ^( INST (s1= statement[symTab] )+ )
			{
			match(input,INST,FOLLOW_INST_in_inst_list548); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:156:9: (s1= statement[symTab] )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ASSIGN_KW||LA10_0==IF_KW||LA10_0==PRINT_KW||(LA10_0 >= READ_KW && LA10_0 <= RETURN_KW)||LA10_0==WHILE_KW||LA10_0==BLOCK||LA10_0==FCALL_S) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ./src/VSLTreeParser.g:156:10: s1= statement[symTab]
					{
					pushFollow(FOLLOW_statement_in_inst_list553);
					s1=statement(symTab);
					state._fsp--;

					code.append(s1);
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "inst_list"



	// $ANTLR start "affectation"
	// ./src/VSLTreeParser.g:160:1: affectation[ExpAttribute expAtt,SymbolTable symTab] returns [Code3a code] : ( IDENT | (ae= array_elem[symTab] ) ) ;
	public final Code3a affectation(ExpAttribute expAtt, SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT9=null;
		TreeRuleReturnScope ae =null;

		try {
			// ./src/VSLTreeParser.g:161:2: ( ( IDENT | (ae= array_elem[symTab] ) ) )
			// ./src/VSLTreeParser.g:162:3: ( IDENT | (ae= array_elem[symTab] ) )
			{
			// ./src/VSLTreeParser.g:162:3: ( IDENT | (ae= array_elem[symTab] ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IDENT) ) {
				alt11=1;
			}
			else if ( (LA11_0==ARELEM) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// ./src/VSLTreeParser.g:162:4: IDENT
					{
					IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectation581); 
					 Operand3a id = symTab.lookup((IDENT9!=null?IDENT9.getText():null));
								if(TypeCheck.checkIdentAff(id,expAtt,IDENT9,(IDENT9!=null?IDENT9.getText():null)))	
									code = Code3aGenerator.genAff(id,expAtt);	
								else
									code = new Code3a();
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:168:4: (ae= array_elem[symTab] )
					{
					// ./src/VSLTreeParser.g:168:4: (ae= array_elem[symTab] )
					// ./src/VSLTreeParser.g:168:5: ae= array_elem[symTab]
					{
					pushFollow(FOLLOW_array_elem_in_affectation592);
					ae=array_elem(symTab);
					state._fsp--;

					}


						 code = Code3aGenerator.genAffTab((ae!=null?((VSLTreeParser.array_elem_return)ae).id:null),(ae!=null?((VSLTreeParser.array_elem_return)ae).expAtt:null),expAtt);
						
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "affectation"



	// $ANTLR start "statement"
	// ./src/VSLTreeParser.g:173:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e1= expression[symTab] a1= affectation[e1,symTab] ) | ^( IF_KW e1= expression[symTab] st1= statement[symTab] (st2= statement[symTab] )? ) | ^( WHILE_KW e1= expression[symTab] st1= statement[symTab] ) | ^( FCALL_S IDENT (al= argument_list[symTab] )? ) | ^( RETURN_KW e1= expression[symTab] ) | ^( PRINT_KW (p1= print_item[symTab] )+ ) | ^( READ_KW (r1= read_item[symTab] )+ ) |b1= block[symTab] );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT10=null;
		CommonTree RETURN_KW11=null;
		ExpAttribute e1 =null;
		Code3a a1 =null;
		Code3a st1 =null;
		Code3a st2 =null;
		TreeRuleReturnScope al =null;
		Code3a p1 =null;
		Code3a r1 =null;
		Code3a b1 =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:174:31: ( ^( ASSIGN_KW e1= expression[symTab] a1= affectation[e1,symTab] ) | ^( IF_KW e1= expression[symTab] st1= statement[symTab] (st2= statement[symTab] )? ) | ^( WHILE_KW e1= expression[symTab] st1= statement[symTab] ) | ^( FCALL_S IDENT (al= argument_list[symTab] )? ) | ^( RETURN_KW e1= expression[symTab] ) | ^( PRINT_KW (p1= print_item[symTab] )+ ) | ^( READ_KW (r1= read_item[symTab] )+ ) |b1= block[symTab] )
			int alt16=8;
			switch ( input.LA(1) ) {
			case ASSIGN_KW:
				{
				alt16=1;
				}
				break;
			case IF_KW:
				{
				alt16=2;
				}
				break;
			case WHILE_KW:
				{
				alt16=3;
				}
				break;
			case FCALL_S:
				{
				alt16=4;
				}
				break;
			case RETURN_KW:
				{
				alt16=5;
				}
				break;
			case PRINT_KW:
				{
				alt16=6;
				}
				break;
			case READ_KW:
				{
				alt16=7;
				}
				break;
			case BLOCK:
				{
				alt16=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// ./src/VSLTreeParser.g:175:2: ^( ASSIGN_KW e1= expression[symTab] a1= affectation[e1,symTab] )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement620); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement624);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_affectation_in_statement629);
					a1=affectation(e1, symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					code = a1;
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:177:7: ^( IF_KW e1= expression[symTab] st1= statement[symTab] (st2= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement643); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement647);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement652);
					st1=statement(symTab);
					state._fsp--;



							LabelSymbol l1 = SymbDistrib.newLabel();
							code = Code3aGenerator.genIfz(Inst3a.TAC.IFZ,l1,e1);  
							code.append(st1);
							LabelSymbol l2 = SymbDistrib.newLabel();
							code.append(Code3aGenerator.genGoto(Inst3a.TAC.GOTO, l2));
							code.append(Code3aGenerator.genLabel(l1));
							
						
					// ./src/VSLTreeParser.g:188:2: (st2= statement[symTab] )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ASSIGN_KW||LA12_0==IF_KW||LA12_0==PRINT_KW||(LA12_0 >= READ_KW && LA12_0 <= RETURN_KW)||LA12_0==WHILE_KW||LA12_0==BLOCK||LA12_0==FCALL_S) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// ./src/VSLTreeParser.g:188:3: st2= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement664);
							st2=statement(symTab);
							state._fsp--;

							code.append(st2);
							}
							break;

					}


							code.append(Code3aGenerator.genLabel(l2));
						
					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:193:3: ^( WHILE_KW e1= expression[symTab] st1= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement681); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement685);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement690);
					st1=statement(symTab);
					state._fsp--;


							code = Code3aGenerator.genWhile(e1,st1);
						
					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:198:4: ^( FCALL_S IDENT (al= argument_list[symTab] )? )
					{
					match(input,FCALL_S,FOLLOW_FCALL_S_in_statement705); 
					match(input, Token.DOWN, null); 
					IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement707); 

							Operand3a id = symTab.lookup((IDENT10!=null?IDENT10.getText():null));
							Code3a cod = new Code3a();
							List<Type> types = new ArrayList<Type>();
							
						
					// ./src/VSLTreeParser.g:204:2: (al= argument_list[symTab] )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==DIV||LA13_0==IDENT||LA13_0==INTEGER||(LA13_0 >= MINUS && LA13_0 <= MUL)||LA13_0==PLUS||LA13_0==ARELEM||LA13_0==FCALL||LA13_0==NEGAT) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// ./src/VSLTreeParser.g:204:3: al= argument_list[symTab]
							{
							pushFollow(FOLLOW_argument_list_in_statement716);
							al=argument_list(symTab);
							state._fsp--;


									cod.append((al!=null?((VSLTreeParser.argument_list_return)al).code:null));
									types = (al!=null?((VSLTreeParser.argument_list_return)al).types:null);
									
								
							}
							break;

					}


							
							if(TypeCheck.checkArgument(id,types,IDENT10,(IDENT10!=null?IDENT10.getText():null)) && TypeCheck.checkFunction(id,IDENT10,(IDENT10!=null?IDENT10.getText():null))){
								cod.append(Code3aGenerator.genCall(id));
								code=cod;		
							}else{
								code = new Code3a();
							}
								
						
					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:221:4: ^( RETURN_KW e1= expression[symTab] )
					{
					RETURN_KW11=(CommonTree)match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement736); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement740);
					e1=expression(symTab);
					state._fsp--;


								if(TypeCheck.checkReturn(e1,RETURN_KW11))
									code.append(Code3aGenerator.genReturn(e1));
								else{
									code = new Code3a();
								}
								
					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ./src/VSLTreeParser.g:230:4: ^( PRINT_KW (p1= print_item[symTab] )+ )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement759); 
					match(input, Token.DOWN, null); 
					// ./src/VSLTreeParser.g:230:15: (p1= print_item[symTab] )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==DIV||LA14_0==IDENT||LA14_0==INTEGER||(LA14_0 >= MINUS && LA14_0 <= MUL)||LA14_0==PLUS||LA14_0==TEXT||LA14_0==ARELEM||LA14_0==FCALL||LA14_0==NEGAT) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// ./src/VSLTreeParser.g:230:16: p1= print_item[symTab]
							{
							pushFollow(FOLLOW_print_item_in_statement764);
							p1=print_item(symTab);
							state._fsp--;

							 code.append(p1);
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// ./src/VSLTreeParser.g:231:7: ^( READ_KW (r1= read_item[symTab] )+ )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement779); 
					match(input, Token.DOWN, null); 
					// ./src/VSLTreeParser.g:231:17: (r1= read_item[symTab] )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==IDENT||LA15_0==ARELEM) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// ./src/VSLTreeParser.g:231:18: r1= read_item[symTab]
							{
							pushFollow(FOLLOW_read_item_in_statement784);
							r1=read_item(symTab);
							state._fsp--;

							 code.append(r1);
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// ./src/VSLTreeParser.g:232:3: b1= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement797);
					b1=block(symTab);
					state._fsp--;

					 code = b1; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "statement"


	public static class array_elem_return extends TreeRuleReturnScope {
		public Operand3a id;
		public ExpAttribute expAtt;
	};


	// $ANTLR start "array_elem"
	// ./src/VSLTreeParser.g:235:1: array_elem[SymbolTable symTab] returns [Operand3a id,ExpAttribute expAtt] : ^( ARELEM IDENT e1= expression[symTab] ) ;
	public final VSLTreeParser.array_elem_return array_elem(SymbolTable symTab) throws RecognitionException {
		VSLTreeParser.array_elem_return retval = new VSLTreeParser.array_elem_return();
		retval.start = input.LT(1);

		CommonTree IDENT12=null;
		ExpAttribute e1 =null;

		try {
			// ./src/VSLTreeParser.g:236:5: ( ^( ARELEM IDENT e1= expression[symTab] ) )
			// ./src/VSLTreeParser.g:236:7: ^( ARELEM IDENT e1= expression[symTab] )
			{
			match(input,ARELEM,FOLLOW_ARELEM_in_array_elem824); 
			match(input, Token.DOWN, null); 
			IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_array_elem827); 
			pushFollow(FOLLOW_expression_in_array_elem831);
			e1=expression(symTab);
			state._fsp--;

			match(input, Token.UP, null); 


					retval.id = symTab.lookup((IDENT12!=null?IDENT12.getText():null));
					if(TypeCheck.checkTab(retval.id,IDENT12,(IDENT12!=null?IDENT12.getText():null))){
						retval.expAtt =e1;
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_elem"



	// $ANTLR start "print_item"
	// ./src/VSLTreeParser.g:244:1: print_item[SymbolTable symTab] returns [Code3a code] : ( TEXT |e1= expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree TEXT13=null;
		ExpAttribute e1 =null;

		try {
			// ./src/VSLTreeParser.g:245:5: ( TEXT |e1= expression[symTab] )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TEXT) ) {
				alt17=1;
			}
			else if ( (LA17_0==DIV||LA17_0==IDENT||LA17_0==INTEGER||(LA17_0 >= MINUS && LA17_0 <= MUL)||LA17_0==PLUS||LA17_0==ARELEM||LA17_0==FCALL||LA17_0==NEGAT) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// ./src/VSLTreeParser.g:245:7: TEXT
					{
					TEXT13=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item857); 

							code = Code3aGenerator.genPrintText((TEXT13!=null?TEXT13.getText():null));
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:248:7: e1= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item869);
					e1=expression(symTab);
					state._fsp--;


							if(e1!=null){
							code = Code3aGenerator.genPrintExp(e1);
							}else{
							code = new Code3a();
							}
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "print_item"



	// $ANTLR start "read_item"
	// ./src/VSLTreeParser.g:257:1: read_item[SymbolTable symTab] returns [Code3a code] : ( IDENT |ae= array_elem[symTab] );
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT14=null;
		TreeRuleReturnScope ae =null;

		try {
			// ./src/VSLTreeParser.g:258:5: ( IDENT |ae= array_elem[symTab] )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==IDENT) ) {
				alt18=1;
			}
			else if ( (LA18_0==ARELEM) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// ./src/VSLTreeParser.g:258:7: IDENT
					{
					IDENT14=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item894); 

							Operand3a id = symTab.lookup((IDENT14!=null?IDENT14.getText():null));
							if(TypeCheck.checkIdentExp(id,IDENT14,(IDENT14!=null?IDENT14.getText():null)))
					      		code = Code3aGenerator.genRead(id);
					      	else{
								code = new Code3a();
							}
							
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:267:4: ae= array_elem[symTab]
					{
					pushFollow(FOLLOW_array_elem_in_read_item903);
					ae=array_elem(symTab);
					state._fsp--;


							code = Code3aGenerator.genReadTab((ae!=null?((VSLTreeParser.array_elem_return)ae).id:null),(ae!=null?((VSLTreeParser.array_elem_return)ae).expAtt:null));
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "read_item"



	// $ANTLR start "expression"
	// ./src/VSLTreeParser.g:273:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( NEGAT e1= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:274:3: ( ^( NEGAT e1= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] )
			int alt19=6;
			switch ( input.LA(1) ) {
			case NEGAT:
				{
				alt19=1;
				}
				break;
			case MUL:
				{
				alt19=2;
				}
				break;
			case DIV:
				{
				alt19=3;
				}
				break;
			case PLUS:
				{
				alt19=4;
				}
				break;
			case MINUS:
				{
				alt19=5;
				}
				break;
			case IDENT:
			case INTEGER:
			case ARELEM:
			case FCALL:
				{
				alt19=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// ./src/VSLTreeParser.g:275:3: ^( NEGAT e1= expression[symTab] )
					{
					match(input,NEGAT,FOLLOW_NEGAT_in_expression930); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression934);
					e1=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkUniOp(e1.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genUniOp(Inst3a.TAC.NEG,temp,e1);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:283:3: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression951); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression955);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression960);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.MUL, temp, e1, e2);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:290:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression975); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression979);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression984);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.DIV, temp, e1, e2);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:297:4: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression999); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1003);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1008);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.ADD, temp, e1, e2);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:304:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression1023); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1027);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1032);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.SUB, temp, e1, e2);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 6 :
					// ./src/VSLTreeParser.g:311:5: pe= primary_exp[symTab]
					{
					pushFollow(FOLLOW_primary_exp_in_expression1049);
					pe=primary_exp(symTab);
					state._fsp--;

					 expAtt = pe; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expAtt;
	}
	// $ANTLR end "expression"



	// $ANTLR start "primary_exp"
	// ./src/VSLTreeParser.g:318:1: primary_exp[SymbolTable symTab] returns [ExpAttribute expAtt] : ( INTEGER | IDENT | ^( FCALL IDENT (al= argument_list[symTab] )? ) |ae= array_elem[symTab] );
	public final ExpAttribute primary_exp(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree INTEGER15=null;
		CommonTree IDENT16=null;
		CommonTree IDENT17=null;
		TreeRuleReturnScope al =null;
		TreeRuleReturnScope ae =null;

		try {
			// ./src/VSLTreeParser.g:319:3: ( INTEGER | IDENT | ^( FCALL IDENT (al= argument_list[symTab] )? ) |ae= array_elem[symTab] )
			int alt21=4;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt21=1;
				}
				break;
			case IDENT:
				{
				alt21=2;
				}
				break;
			case FCALL:
				{
				alt21=3;
				}
				break;
			case ARELEM:
				{
				alt21=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// ./src/VSLTreeParser.g:319:5: INTEGER
					{
					INTEGER15=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary_exp1079); 


					      ConstSymbol cs = new ConstSymbol(Integer.parseInt((INTEGER15!=null?INTEGER15.getText():null)));
					      expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:325:5: IDENT
					{
					IDENT16=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp1091); 

							Operand3a id = symTab.lookup((IDENT16!=null?IDENT16.getText():null));
							if(TypeCheck.checkIdentExp(id,IDENT16,(IDENT16!=null?IDENT16.getText():null)))
					      		expAtt = new ExpAttribute(id.type, new Code3a(),id);
					      	
								
					    
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:333:4: ^( FCALL IDENT (al= argument_list[symTab] )? )
					{
					match(input,FCALL,FOLLOW_FCALL_in_primary_exp1103); 
					match(input, Token.DOWN, null); 
					IDENT17=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp1105); 

							

							VarSymbol temp = SymbDistrib.newTemp();
							Operand3a id = symTab.lookup((IDENT17!=null?IDENT17.getText():null));
							
							Code3a cod = Code3aGenerator.genVar(temp);
							List<Type> types = new ArrayList<Type>();

						
					// ./src/VSLTreeParser.g:343:2: (al= argument_list[symTab] )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==DIV||LA20_0==IDENT||LA20_0==INTEGER||(LA20_0 >= MINUS && LA20_0 <= MUL)||LA20_0==PLUS||LA20_0==ARELEM||LA20_0==FCALL||LA20_0==NEGAT) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// ./src/VSLTreeParser.g:343:3: al= argument_list[symTab]
							{
							pushFollow(FOLLOW_argument_list_in_primary_exp1114);
							al=argument_list(symTab);
							state._fsp--;


									cod.append((al!=null?((VSLTreeParser.argument_list_return)al).code:null));
									types = (al!=null?((VSLTreeParser.argument_list_return)al).types:null);

								
							}
							break;

					}

						
							if(TypeCheck.checkFunctionInt(id,IDENT17,(IDENT17!=null?IDENT17.getText():null)) && TypeCheck.checkArgument(id,types,IDENT17,(IDENT17!=null?IDENT17.getText():null)) ){
								cod.append(Code3aGenerator.genCall(id,temp));
								expAtt = new ExpAttribute(Type.INT, cod, temp);		
							}
							
							
								
						
					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:359:4: ae= array_elem[symTab]
					{
					pushFollow(FOLLOW_array_elem_in_primary_exp1135);
					ae=array_elem(symTab);
					state._fsp--;



					      		VarSymbol temp = SymbDistrib.newTemp();
					     	 	Code3a cod = Code3aGenerator.genTabVar( temp, (ae!=null?((VSLTreeParser.array_elem_return)ae).id:null), (ae!=null?((VSLTreeParser.array_elem_return)ae).expAtt:null));
					      		expAtt = new ExpAttribute(Type.INT, cod, temp);
					    
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expAtt;
	}
	// $ANTLR end "primary_exp"


	public static class argument_list_return extends TreeRuleReturnScope {
		public Code3a code;
		public List<Type> types;
	};


	// $ANTLR start "argument_list"
	// ./src/VSLTreeParser.g:368:1: argument_list[SymbolTable symTab] returns [Code3a code,List<Type> types] : e1= expression[symTab] (e2= expression[symTab] )* ;
	public final VSLTreeParser.argument_list_return argument_list(SymbolTable symTab) throws RecognitionException {
		VSLTreeParser.argument_list_return retval = new VSLTreeParser.argument_list_return();
		retval.start = input.LT(1);

		ExpAttribute e1 =null;
		ExpAttribute e2 =null;

		try {
			// ./src/VSLTreeParser.g:369:2: (e1= expression[symTab] (e2= expression[symTab] )* )
			// ./src/VSLTreeParser.g:370:2: e1= expression[symTab] (e2= expression[symTab] )*
			{
			pushFollow(FOLLOW_expression_in_argument_list1158);
			e1=expression(symTab);
			state._fsp--;


					retval.types = new ArrayList<Type>();
					retval.code = e1.code;
					retval.types.add(e1.type);
					retval.code.append(Code3aGenerator.genArg(e1));

					
			// ./src/VSLTreeParser.g:377:2: (e2= expression[symTab] )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==DIV||LA22_0==IDENT||LA22_0==INTEGER||(LA22_0 >= MINUS && LA22_0 <= MUL)||LA22_0==PLUS||LA22_0==ARELEM||LA22_0==FCALL||LA22_0==NEGAT) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// ./src/VSLTreeParser.g:377:3: e2= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_argument_list1168);
					e2=expression(symTab);
					state._fsp--;


							retval.code.append(e2.code);
							retval.types.add(e2.type);
							retval.code.append(Code3aGenerator.genArg(e2));
							
					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argument_list"

	// Delegated rules



	public static final BitSet FOLLOW_program_in_s66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROG_in_program98 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unit_in_program103 = new BitSet(new long[]{0x0000000008002008L});
	public static final BitSet FOLLOW_function_in_unit134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proto_in_unit147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_KW_in_function175 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_function179 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_function181 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_param_list_in_function189 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_body_in_function197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BODY_in_body221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_body225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROTO_KW_in_proto250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_proto254 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_proto256 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_param_list_in_proto264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_KW_in_type290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list333 = new BitSet(new long[]{0x0000010000004008L});
	public static final BitSet FOLLOW_PARAM_in_param_list348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_param372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_param379 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_param381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block419 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block423 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block437 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_declaration470 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration475 = new BitSet(new long[]{0x0000004000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARDECL_in_decl_item513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_decl_item515 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_INTEGER_in_decl_item517 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INST_in_inst_list548 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list553 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_IDENT_in_affectation581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_elem_in_affectation592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement620 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement624 = new BitSet(new long[]{0x0000008000004000L});
	public static final BitSet FOLLOW_affectation_in_statement629 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_KW_in_statement643 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement647 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement652 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_statement_in_statement664 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement685 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FCALL_S_in_statement705 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement707 = new BitSet(new long[]{0x0000908002C14208L});
	public static final BitSet FOLLOW_argument_list_in_statement716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_KW_in_statement736 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement740 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement759 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_item_in_statement764 = new BitSet(new long[]{0x0000908202C14208L});
	public static final BitSet FOLLOW_READ_KW_in_statement779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_item_in_statement784 = new BitSet(new long[]{0x0000008000004008L});
	public static final BitSet FOLLOW_block_in_statement797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARELEM_in_array_elem824 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_array_elem827 = new BitSet(new long[]{0x0000908002C14200L});
	public static final BitSet FOLLOW_expression_in_array_elem831 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TEXT_in_print_item857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_read_item894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_elem_in_read_item903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGAT_in_expression930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression955 = new BitSet(new long[]{0x0000908002C14200L});
	public static final BitSet FOLLOW_expression_in_expression960 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression979 = new BitSet(new long[]{0x0000908002C14200L});
	public static final BitSet FOLLOW_expression_in_expression984 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1003 = new BitSet(new long[]{0x0000908002C14200L});
	public static final BitSet FOLLOW_expression_in_expression1008 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression1023 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1027 = new BitSet(new long[]{0x0000908002C14200L});
	public static final BitSet FOLLOW_expression_in_expression1032 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_exp_in_expression1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary_exp1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FCALL_in_primary_exp1103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp1105 = new BitSet(new long[]{0x0000908002C14208L});
	public static final BitSet FOLLOW_argument_list_in_primary_exp1114 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_array_elem_in_primary_exp1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_argument_list1158 = new BitSet(new long[]{0x0000908002C14202L});
	public static final BitSet FOLLOW_expression_in_argument_list1168 = new BitSet(new long[]{0x0000908002C14202L});
}
