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
	 * Generates the 3a statement: VAR t
	 **/
	public static Code3a genVar(Operand3a t) {
		Inst3a i = new Inst3a(Inst3a.TAC.VAR, t);
		return new Code3a(i);
	}
	/**
	 * Generate code for a aff operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genAff(Inst3a.TAC op, Operand3a temp, ExpAttribute exp1) {
		Code3a cod = exp1.code;
		cod.append(new Inst3a(op, temp, exp1.place));
		return cod;
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
	public static Code3a genArg(Inst3a.TAC op, LabelSymbol ls1) {
		Code3a cod = new Code3a(new Inst3a(op, ls1));
		

		return cod;
	}

	public static Code3a genArg(Inst3a.TAC op, ExpAttribute exp1) {
		Code3a cod = new Code3a(new Inst3a(op, exp1.place));
		

		return cod;
	}

     /**
	 * Generate code for a call operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genCall(Inst3a.TAC op, Operand3a ls1) {
		Code3a cod = new Code3a(new Inst3a(op, null,ls1));
		

		return cod;
	}
	public static Code3a genCall(Inst3a.TAC op, Operand3a ls1,Operand3a ls2) {
		Code3a cod = new Code3a(new Inst3a(op, ls2,ls1));
		

		return cod;
	}

	public static Code3a genRead(Operand3a v1) {
		Code3a cod = new Code3a(new Inst3a(Inst3a.TAC.CALL, v1,new LabelSymbol("L8")));	

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



} // Code3aGenerator ***
