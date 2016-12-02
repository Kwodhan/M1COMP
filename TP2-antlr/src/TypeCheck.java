import org.antlr.runtime.tree.CommonTree;

/**
 * Type checking operations (NOTE: this class must be implemented by the
 * student; the methods indicated here can be seen as suggestions; note that
 * some minor checks can still be performed directly in VSLTreeParser.g).
 * 
 */
public class TypeCheck {

	// an Example
	/**
	 * Type checking for a binary operation - in VSL+: integer operations only!
	 */
	public static Type checkBinOp(Type t1, Type t2) {
		if (t1 == Type.INT && t2 == Type.INT)
			return Type.INT;
		else {
			return Type.ERROR;
		}
	}

	public static Type checkUniOp(Type t1) {
		if (t1 == Type.INT)
			return Type.INT;
		else {
			return Type.ERROR;
		}
	}
	/**
	*teste si l'ident est un tableau
	*
	**/
	public static boolean checkTab(Operand3a op,CommonTree ident,String texte) {
		if(op==null){
			Errors.unknownIdentifier(ident,texte,"") ;
			return false;
		}
		if( !(op.type instanceof ArrayType) && op.type != Type.POINTER ){
			Errors.incompatibleTypes(ident,Type.POINTER,op.type,"tableau attendu");
			return false;
			
		}
		

		return true;		
	}
	/**
	*teste si l'ident est une function
	*
	**/
	public static boolean checkFunction(Operand3a op,CommonTree ident,String texte) {
		if(op==null){
			Errors.unknownIdentifier(ident,texte,"") ;
			return false;
		}
		if( !(op.type instanceof FunctionType)){
			Errors.incompatibleTypes(ident,Type.VOID,op.type,"Fonction attendu");
			return false;
			
		}
		

		return true;		
	}
	/**
	*teste si l'ident est une function qui retourne un int
	*
	**/
	public static boolean checkFunctionInt(Operand3a op,CommonTree ident,String texte) {
		if(op==null){
			Errors.unknownIdentifier(ident,texte,"") ;
			return false;
		}
		if( !(op.type instanceof FunctionType)){
			Errors.incompatibleTypes(ident,Type.INT,op.type,"Fonction attendu");
			return false;
			
		}
		if(!(((FunctionType)op.type).getReturnType() == Type.INT)){
			Errors.incompatibleTypes(ident,Type.INT,((FunctionType)op.type).getReturnType(),"Fonction "+texte+" doit retourner un INT");
			return false;
		}

		return true;		
	}
	/**
	*teste si l'ident est une variable int
	*
	**/
	public static boolean checkIdentExp(Operand3a id,CommonTree ident,String texte) {
		if(id==null){
			Errors.unknownIdentifier(ident,texte,"") ;
			return false;
		}

		return true;		
	}
	/**
	*teste si la déclaration d'une variable int n'est pas déja défini
	*
	**/
	public static boolean checkIdentDecla(Operand3a id,CommonTree ident,String texte,SymbolTable symTab) {
		
		if(id!=null && id.getScope() == symTab.getScope() ){
			Errors.redefinedIdentifier(ident,texte,"");
			return false;
		}
		
			
			return true;
					
	}

	/**
	*teste si la function est comforme avec son proto
	*
	**/
	public static boolean checkFunctionProto(Operand3a op,CommonTree ident,int nb) {
		if(op==null){
			
			return true;
		}
		if(((FunctionType) op.type).getArguments().size()!=nb){
			Errors.miscError(ident,"Pas le bon nombre d'argument") ;
			return false;
		}
	return true;

		
					
	}

}
