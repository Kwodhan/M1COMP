/**
 * This class implements all the methods for 3a code generation (NOTE: this
 * class must be coded by the student; the methods indicated here can be seen as
 * a suggestion, but are not actually necessary).
 * 
 * @author MLB
 * 
 */
public class Code3aGenerator {

	// Constructor not needed
	private Code3aGenerator() {

	}

	
	/**
	 * Generate code for a unairy operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genUniOp(Inst3a.TAC op, Operand3a temp, ExpAttribute exp1) {
		Code3a cod = exp1.code;
		cod.append(genVar(temp));
		cod.append(new Inst3a(op, temp, exp1.place));
		return cod;
	}

	public static Code3a genPrimaryTab( Operand3a temp, ExpAttribute exp1,ExpAttribute exp2) {
		Code3a cod = exp1.code;
		cod.append(exp2.code);
		cod.append(new Inst3a(Inst3a.TAC.VARTAB, temp,exp1.place, exp2.place));
		return cod;
	}
	/**
	 * Generate code for a binary operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genBinOp(Inst3a.TAC op, Operand3a temp, ExpAttribute exp1,
			ExpAttribute exp2) {
		Code3a cod = exp1.code;
		cod.append(exp2.code);
		cod.append(genVar(temp));
		cod.append(new Inst3a(op, temp, exp1.place, exp2.place));
		return cod;
	}
	/**
	 * Generates the 3a statement: VAR t
	 **/
	public static Code3a genVar(Operand3a t) {
		Inst3a i = new Inst3a(Inst3a.TAC.VAR, t);
		return new Code3a(i);
	}

	public static Code3a genVarTab(Operand3a t) {
		Inst3a i = new Inst3a(Inst3a.TAC.VAR, t);
		return new Code3a(i);
	}
	/**
	 * Generate code for a aff operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genAff( Operand3a id, ExpAttribute exp1) {
	
			Code3a cod = exp1.code;
			cod.append(new Inst3a(Inst3a.TAC.COPY, id, exp1.place));
			return cod;
		
	}
	/**
	 * Generate code for a aff operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genAffTab( Operand3a id, ExpAttribute exp1,ExpAttribute exp2) {
		Code3a cod = exp1.code;
		cod.append(exp2.code);
		cod.append(new Inst3a(Inst3a.TAC.VARTAB, id,exp1.place, exp2.place));
		return cod;
	}
/**
	 * Generate code for a ifz operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genIfz(Inst3a.TAC op, LabelSymbol ls1, ExpAttribute exp1) {
		Code3a cod = exp1.code;
		cod.append(new Inst3a(op,exp1.place,ls1));
		return cod;
	}

	/**
	 * Generate code for a goto operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genGoto(Inst3a.TAC op, LabelSymbol ls1) {
		Code3a cod = new Code3a(new Inst3a(op, ls1));
		

		return cod;
	}
/**
	 * Generate code for a label operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genLabel( LabelSymbol ls1) {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.LABEL, ls1));
		

		return cod;
	}

	/**
	 * Generate code for a arg operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genArg( LabelSymbol ls1) {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.ARG, ls1));
		

		return cod;
	}

	public static Code3a genArg(ExpAttribute exp1) {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.ARG, exp1.place));
		

		return cod;
	}

     /**
	 * Generate code for a call operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genCall( Operand3a ls1) {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.CALL, null,ls1));
		

		return cod;
	}
	public static Code3a genReturn( ExpAttribute exp1) {
		Code3a cod = exp1.code;
		cod.append(new Code3a(new Inst3a(Inst3a.TAC.RETURN, exp1.place)));
		

		return cod;
	}
	public static Code3a genCall( Operand3a ls1,Operand3a ls2) {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.CALL, ls2,ls1));
		

		return cod;
	}
	public static Code3a genArgument(Inst3a.TAC op, Operand3a ls1,Operand3a ls2) {
		Code3a cod = new Code3a(new Inst3a(op, ls2,ls1));
		

		return cod;
	}
	public static Code3a genRead(Operand3a v1) {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.CALL, v1,SymbDistrib.builtinRead));	

		return cod;
	}

	public static Code3a genReadTab(Operand3a v1,ExpAttribute exp1) {
		VarSymbol temp = SymbDistrib.newTemp();
		Code3a cod = Code3aGenerator.genVar(temp);
		cod.append(new Code3a(new Inst3a(Inst3a.TAC.CALL, temp,SymbDistrib.builtinRead)));
		cod.append(exp1.code);
		cod.append(new Inst3a(Inst3a.TAC.VARTAB, v1,exp1.place, temp));
			

		return cod;
	}

	public static Code3a genEndFunc() {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.ENDFUNC, null));	

		return cod;
	}

	public static Code3a genBeginFunc() {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.BEGINFUNC, null));	

		return cod;
	}

	public static Code3a genPrintText(String texte){
		Data3a data = new Data3a(texte);
	 	Code3a code = Code3aGenerator.genArg(data.getLabel());
		code.append(Code3aGenerator.genCall(SymbDistrib.builtinPrintS));
		code.appendData(data);
		return code;
	}

	public static Code3a genPrintExp(ExpAttribute e1){

			
		Code3a code = e1.code;
		code.append(Code3aGenerator.genArg(e1));
		code.append(Code3aGenerator.genCall(SymbDistrib.builtinPrintN) );
		return code;
		
	}


	public static Code3a genWhile(ExpAttribute e1,Code3a codeSta){
		LabelSymbol l1 = SymbDistrib.newLabel();
		LabelSymbol l2 = SymbDistrib.newLabel();
		Code3a code = Code3aGenerator.genLabel(l1);
		code.append(Code3aGenerator.genIfz(Inst3a.TAC.IFZ,l2,e1)); 
		code.append(codeSta);
		code.append(Code3aGenerator.genGoto(Inst3a.TAC.GOTO, l1));
		code.append(Code3aGenerator.genLabel(l2));
		return code; 
	}


	public static Code3a genDeclaINT(String texte,SymbolTable symTab){
		int i = symTab.getScope();
		VarSymbol op = new VarSymbol(Type.INT,texte,i);
		Code3a cod = Code3aGenerator.genVar(op);
		symTab.insert(texte,op);
		return cod;
	}

	public static Code3a genDeclaTab(String texte,int length,SymbolTable symTab){
		int i = symTab.getScope();
		VarSymbol op = new VarSymbol(new  ArrayType(Type.INT,length),texte,i);
		Code3a cod = Code3aGenerator.genVar(op);
		symTab.insert(texte,op);
		return cod;
	}

	public static Code3a genParam(String texte,SymbolTable symTab,FunctionType ft1){
		int i = symTab.getScope()+1; 
		VarSymbol op = new VarSymbol(Type.INT,texte,i);
		op.setParam();
		ft1.extend(Type.INT);
		Code3a code = Code3aGenerator.genVar(op);
		symTab.insert(texte,op);
			
		return code;
	}

	public static Code3a genTab(String texte,int length,SymbolTable symTab){
		int i = symTab.getScope();
		VarSymbol op = new VarSymbol(new  ArrayType(Type.INT,length),texte,i);
		Code3a cod = Code3aGenerator.genVar(op);
		symTab.insert(texte,op);
		return cod;
	}

	public static Code3a genTabVar(Operand3a temp,Operand3a tab,ExpAttribute exp1){
	Code3a cod = Code3aGenerator.genVar(temp);

	cod.append(exp1.code);
	cod.append(new Code3a(new Inst3a(Inst3a.TAC.TABVAR,temp,tab, exp1.place)));
	return cod;
	}





} // Code3aGenerator ***
