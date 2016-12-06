import org.antlr.runtime.tree.CommonTree;
import java.util.List;

/**
 * Type checking operations (NOTE: this class must be implemented by the
 * student; the methods indicated here can be seen as suggestions; note that
 * some minor checks can still be performed directly in VSLTreeParser.g).
 * 
 */
public class TypeCheck {

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
	*teste si l'ident est une variable qui existe
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
	 * 
	 * teste si affectation est conforme
	 * 
	 */
	public static boolean checkIdentAff(Operand3a id,ExpAttribute expAtt,CommonTree ident,String texte) {
		if(id==null){
			Errors.unknownIdentifier(ident,texte,"") ;
			return false;
		}
		
		if(!(id.type == Type.INT)){
			Errors.incompatibleTypes(ident,Type.INT,id.type,"");
			return false;
		}
		if(expAtt == null){ // evite de renvoyer une erreur quand l'analyse se passe mal ultérieurement 
			return false;
		}
		
		if(expAtt.type !=Type.INT && expAtt.type !=Type.I_CONST ){
			Errors.incompatibleTypes(ident,Type.INT,expAtt.type,"");
			return false;
		}

		return true;		
	}
	/**
	 * 
	 * 
	 * test si les arguments sont conforme à la définition de la function 
	 * 
	 * 
	 */ 
	public static boolean checkArgument(Operand3a id,List<Type> types,CommonTree ident,String texte) {

		List<Type> good= ((FunctionType)id.type).getArguments();
		if(good.size() != types.size()){
			Errors.miscError(ident,"proto non réspécter") ;
			return false;
		}
		
		for(int i=0;i<good.size();i++){
			if(!good.get(i).equals(types.get(i))){
				if(good.get(i).equals(Type.POINTER) && types.get(i) instanceof ArrayType ){
					continue;
				}
				Errors.incompatibleTypes(ident,good.get(i),types.get(i),"");
				return false;
			}
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
	public static boolean checkFunctionProto(Operand3a proto,CommonTree ident,FunctionSymbol fs1) {
		FunctionType type= ((FunctionType)fs1.type);
		if(proto==null){
			return true;
		}
		if(!type.isCompatible((proto.type))){
			Errors.miscError(ident,"proto non réspécter") ;
			return false;
		}
	return true;

		
					
	}
	/**
	*teste si la function est déja définit
	*
	**/
	public static boolean checkFunctionDef(Operand3a op,CommonTree ident,String texte) {
		if(op!=null && !((FunctionType)op.type).prototype){
			Errors.redefinedIdentifier(ident,texte,"");
			return false;
		}
		
	return true;

		
					
	}
	
	/**
	*teste si le return renvoie bien un nombre et pas un tableau ou autre 
	*
	**/
	public static boolean checkReturn(ExpAttribute expAtt,CommonTree ident) {
			if(expAtt.type !=Type.INT && expAtt.type !=Type.I_CONST ){
			Errors.incompatibleTypes(ident,Type.INT,expAtt.type,"");
			return false;
		}
		
	return true;

		
					
	}

}
