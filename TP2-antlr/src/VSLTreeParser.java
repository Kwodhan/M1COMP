// $ANTLR 3.5.2 ./src/VSLTreeParser.g 2016-11-19 18:09:35

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
	// ./src/VSLTreeParser.g:11:1: s[SymbolTable symTab] returns [Code3a code] : b1= program[symTab] ;
	public final Code3a s(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a b1 =null;

		try {
			// ./src/VSLTreeParser.g:12:5: (b1= program[symTab] )
			// ./src/VSLTreeParser.g:12:7: b1= program[symTab]
			{
			pushFollow(FOLLOW_program_in_s64);
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
	// ./src/VSLTreeParser.g:15:1: program[SymbolTable symTab] returns [Code3a code] : ^( PROG (u= unit[symTab] )+ ) ;
	public final Code3a program(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a u =null;

		try {
			// ./src/VSLTreeParser.g:16:5: ( ^( PROG (u= unit[symTab] )+ ) )
			// ./src/VSLTreeParser.g:16:7: ^( PROG (u= unit[symTab] )+ )
			{
			match(input,PROG,FOLLOW_PROG_in_program91); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:16:14: (u= unit[symTab] )+
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
					// ./src/VSLTreeParser.g:16:15: u= unit[symTab]
					{
					pushFollow(FOLLOW_unit_in_program96);
					u=unit(symTab);
					state._fsp--;

					code = u;
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
	// ./src/VSLTreeParser.g:19:1: unit[SymbolTable symTab] returns [Code3a code] : (f= function[symTab] |p= proto[symTab] );
	public final Code3a unit(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a f =null;
		Code3a p =null;

		try {
			// ./src/VSLTreeParser.g:20:5: (f= function[symTab] |p= proto[symTab] )
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
					// ./src/VSLTreeParser.g:20:7: f= function[symTab]
					{
					pushFollow(FOLLOW_function_in_unit127);
					f=function(symTab);
					state._fsp--;

					code = f;
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:21:7: p= proto[symTab]
					{
					pushFollow(FOLLOW_proto_in_unit140);
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
	// ./src/VSLTreeParser.g:24:1: function[SymbolTable symTab] returns [Code3a code] : ^( FUNC_KW t1= type IDENT pl= param_list[symTab,ft1] b= body[symTab] ) ;
	public final Code3a function(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT1=null;
		Type t1 =null;
		Code3a pl =null;
		Code3a b =null;

		try {
			// ./src/VSLTreeParser.g:25:5: ( ^( FUNC_KW t1= type IDENT pl= param_list[symTab,ft1] b= body[symTab] ) )
			// ./src/VSLTreeParser.g:25:7: ^( FUNC_KW t1= type IDENT pl= param_list[symTab,ft1] b= body[symTab] )
			{
			match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function166); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_function170);
			t1=type();
			state._fsp--;

			IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function172); 

				LabelSymbol l1 = new LabelSymbol((IDENT1!=null?IDENT1.getText():null));
				code = Code3aGenerator.genLabel(l1);
				code.append(Code3aGenerator.genBeginFunc());
				FunctionType ft1 = new FunctionType(t1,false);
				
			pushFollow(FOLLOW_param_list_in_function180);
			pl=param_list(symTab, ft1);
			state._fsp--;


				code.append(pl);
				
			pushFollow(FOLLOW_body_in_function188);
			b=body(symTab);
			state._fsp--;


				code.append(b);
				FunctionSymbol fs1 = new FunctionSymbol(l1,ft1);
				symTab.insert((IDENT1!=null?IDENT1.getText():null),fs1);
				
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
	// ./src/VSLTreeParser.g:41:1: body[SymbolTable symTab] returns [Code3a code] : ^( BODY s1= statement[symTab] ) ;
	public final Code3a body(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a s1 =null;

		try {
			// ./src/VSLTreeParser.g:42:2: ( ^( BODY s1= statement[symTab] ) )
			// ./src/VSLTreeParser.g:42:3: ^( BODY s1= statement[symTab] )
			{
			match(input,BODY,FOLLOW_BODY_in_body212); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_body216);
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
	// ./src/VSLTreeParser.g:48:1: proto[SymbolTable symTab] returns [Code3a code] : ^( PROTO_KW t1= type IDENT pl= param_list[symTab,ft1] ) ;
	public final Code3a proto(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT2=null;
		Type t1 =null;
		Code3a pl =null;

		try {
			// ./src/VSLTreeParser.g:49:5: ( ^( PROTO_KW t1= type IDENT pl= param_list[symTab,ft1] ) )
			// ./src/VSLTreeParser.g:49:7: ^( PROTO_KW t1= type IDENT pl= param_list[symTab,ft1] )
			{
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto240); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto244);
			t1=type();
			state._fsp--;

			IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto246); 

				LabelSymbol l1 = new LabelSymbol((IDENT2!=null?IDENT2.getText():null));
				FunctionType ft1 = new FunctionType(t1);
				/*ajouter param dans ft1*/
				
				
				
			pushFollow(FOLLOW_param_list_in_proto256);
			pl=param_list(symTab, ft1);
			state._fsp--;


				FunctionSymbol fs1 = new FunctionSymbol(l1,ft1);
				symTab.insert((IDENT2!=null?IDENT2.getText():null),fs1);
				
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
	// ./src/VSLTreeParser.g:64:1: type returns [Type returnType] : ( INT_KW | VOID_KW );
	public final Type type() throws RecognitionException {
		Type returnType = null;


		try {
			// ./src/VSLTreeParser.g:65:5: ( INT_KW | VOID_KW )
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
					// ./src/VSLTreeParser.g:65:7: INT_KW
					{
					match(input,INT_KW,FOLLOW_INT_KW_in_type282); 
					returnType =Type.INT;
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:66:7: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type292); 
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



	// $ANTLR start "param_list"
	// ./src/VSLTreeParser.g:69:1: param_list[SymbolTable symTab,FunctionType ft1] returns [Code3a code] : ( ^( PARAM ( param[symTab,ft1] )* ) | PARAM );
	public final Code3a param_list(SymbolTable symTab, FunctionType ft1) throws RecognitionException {
		Code3a code = null;


		Code3a param3 =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:71:5: ( ^( PARAM ( param[symTab,ft1] )* ) | PARAM )
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
					// ./src/VSLTreeParser.g:71:6: ^( PARAM ( param[symTab,ft1] )* )
					{
					match(input,PARAM,FOLLOW_PARAM_in_param_list322); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// ./src/VSLTreeParser.g:71:14: ( param[symTab,ft1] )*
						loop4:
						while (true) {
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==IDENT) ) {
								alt4=1;
							}

							switch (alt4) {
							case 1 :
								// ./src/VSLTreeParser.g:71:15: param[symTab,ft1]
								{
								pushFollow(FOLLOW_param_in_param_list325);
								param3=param(symTab, ft1);
								state._fsp--;

								code.append(param3);
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
					// ./src/VSLTreeParser.g:72:7: PARAM
					{
					match(input,PARAM,FOLLOW_PARAM_in_param_list340); 
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
	// $ANTLR end "param_list"



	// $ANTLR start "param"
	// ./src/VSLTreeParser.g:75:1: param[SymbolTable symTab,FunctionType ft1] returns [Code3a code] : IDENT ;
	public final Code3a param(SymbolTable symTab, FunctionType ft1) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT4=null;

		try {
			// ./src/VSLTreeParser.g:76:5: ( IDENT )
			// ./src/VSLTreeParser.g:76:7: IDENT
			{
			IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param364); 
			int i = symTab.getScope()+1; // demande à la prof pour les scopes de function d'une ligne
							VarSymbol op = new VarSymbol(Type.INT,(IDENT4!=null?IDENT4.getText():null),i);
							op.setParam();
							ft1.extend(Type.INT);
							System.out.println(ft1);
							Code3a cod = Code3aGenerator.genVar(op);
							symTab.insert((IDENT4!=null?IDENT4.getText():null),op);
							code = cod;		
				
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
	// ./src/VSLTreeParser.g:87:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK d1= declaration[symTab] i1= inst_list[symTab] ) | ^( BLOCK i1= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a d1 =null;
		Code3a i1 =null;

		 symTab.enterScope();
		try {
			// ./src/VSLTreeParser.g:90:5: ( ^( BLOCK d1= declaration[symTab] i1= inst_list[symTab] ) | ^( BLOCK i1= inst_list[symTab] ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BLOCK) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==DOWN) ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2==DECL) ) {
						alt6=1;
					}
					else if ( (LA6_2==INST) ) {
						alt6=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
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
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ./src/VSLTreeParser.g:91:3: ^( BLOCK d1= declaration[symTab] i1= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block402); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block406);
					d1=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block411);
					i1=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 code = d1; code.append(i1);
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:92:3: ^( BLOCK i1= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block420); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block424);
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
	// ./src/VSLTreeParser.g:95:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (d1= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a d1 =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:96:32: ( ^( DECL (d1= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:97:3: ^( DECL (d1= decl_item[symTab] )+ )
			{
			match(input,DECL,FOLLOW_DECL_in_declaration453); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:97:10: (d1= decl_item[symTab] )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDENT||LA7_0==ARDECL) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ./src/VSLTreeParser.g:97:11: d1= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration458);
					d1=decl_item(symTab);
					state._fsp--;

					 code.append(d1);
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
	// ./src/VSLTreeParser.g:101:1: decl_item[SymbolTable symTab] returns [Code3a code] : ( IDENT | ^( ARDECL IDENT INTEGER ) );
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT5=null;
		CommonTree IDENT6=null;

		try {
			// ./src/VSLTreeParser.g:102:5: ( IDENT | ^( ARDECL IDENT INTEGER ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDENT) ) {
				alt8=1;
			}
			else if ( (LA8_0==ARDECL) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// ./src/VSLTreeParser.g:102:7: IDENT
					{
					IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item489); 

								Operand3a id = symTab.lookup((IDENT5!=null?IDENT5.getText():null));
								if(id!=null && id.getScope() == symTab.getScope()&& id.isVarInteger()){
									Errors.redefinedIdentifier(IDENT5,(IDENT5!=null?IDENT5.getText():null),"");
								}
								else{
									int i = symTab.getScope();
									VarSymbol op = new VarSymbol(Type.INT,(IDENT5!=null?IDENT5.getText():null),i);
									Code3a cod = Code3aGenerator.genVar(op);
									symTab.insert((IDENT5!=null?IDENT5.getText():null),op);
									code = cod;		
								}
								
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:115:3: ^( ARDECL IDENT INTEGER )
					{
					match(input,ARDECL,FOLLOW_ARDECL_in_decl_item496); 
					match(input, Token.DOWN, null); 
					IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item498); 
					match(input,INTEGER,FOLLOW_INTEGER_in_decl_item500); 

						Operand3a id = symTab.lookup((IDENT6!=null?IDENT6.getText():null));
								if(id!=null && id.getScope() == symTab.getScope() && id.isVarInteger()){
									Errors.redefinedIdentifier(IDENT6,(IDENT6!=null?IDENT6.getText():null),"");
								}
								else{
									int i = symTab.getScope();
									VarSymbol op = new VarSymbol(Type.INT,(IDENT6!=null?IDENT6.getText():null),i);
									Code3a cod = Code3aGenerator.genVar(op);
									symTab.insert((IDENT6!=null?IDENT6.getText():null),op);
									code = cod;		
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
	// ./src/VSLTreeParser.g:131:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (s1= statement[symTab] )+ ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a s1 =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:132:32: ( ^( INST (s1= statement[symTab] )+ ) )
			// ./src/VSLTreeParser.g:133:2: ^( INST (s1= statement[symTab] )+ )
			{
			match(input,INST,FOLLOW_INST_in_inst_list531); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:133:9: (s1= statement[symTab] )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ASSIGN_KW||LA9_0==IF_KW||LA9_0==PRINT_KW||LA9_0==READ_KW||LA9_0==WHILE_KW||LA9_0==BLOCK) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./src/VSLTreeParser.g:133:10: s1= statement[symTab]
					{
					pushFollow(FOLLOW_statement_in_inst_list536);
					s1=statement(symTab);
					state._fsp--;

					code.append(s1);
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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



	// $ANTLR start "statement"
	// ./src/VSLTreeParser.g:136:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e1= expression[symTab] IDENT ) |b1= block[symTab] | ^( IF_KW e1= expression[symTab] st1= statement[symTab] (st2= statement[symTab] )? ) | ^( WHILE_KW e1= expression[symTab] st1= statement[symTab] ) | ^( PRINT_KW (p1= print_item[symTab] )+ ) | ^( READ_KW (r1= read_item[symTab] )+ ) );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT7=null;
		ExpAttribute e1 =null;
		Code3a b1 =null;
		Code3a st1 =null;
		Code3a st2 =null;
		Code3a p1 =null;
		Code3a r1 =null;

		 code = new Code3a();
		try {
			// ./src/VSLTreeParser.g:138:5: ( ^( ASSIGN_KW e1= expression[symTab] IDENT ) |b1= block[symTab] | ^( IF_KW e1= expression[symTab] st1= statement[symTab] (st2= statement[symTab] )? ) | ^( WHILE_KW e1= expression[symTab] st1= statement[symTab] ) | ^( PRINT_KW (p1= print_item[symTab] )+ ) | ^( READ_KW (r1= read_item[symTab] )+ ) )
			int alt13=6;
			switch ( input.LA(1) ) {
			case ASSIGN_KW:
				{
				alt13=1;
				}
				break;
			case BLOCK:
				{
				alt13=2;
				}
				break;
			case IF_KW:
				{
				alt13=3;
				}
				break;
			case WHILE_KW:
				{
				alt13=4;
				}
				break;
			case PRINT_KW:
				{
				alt13=5;
				}
				break;
			case READ_KW:
				{
				alt13=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// ./src/VSLTreeParser.g:139:2: ^( ASSIGN_KW e1= expression[symTab] IDENT )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement570); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement574);
					e1=expression(symTab);
					state._fsp--;

					IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement577); 
					match(input, Token.UP, null); 


							// verif si variable  existe
							Operand3a id = symTab.lookup((IDENT7!=null?IDENT7.getText():null));
							if(id!=null && id.isVarInteger())
					      		code = Code3aGenerator.genAff(Inst3a.TAC.COPY,id,e1);
							else 
								Errors.unknownIdentifier(IDENT7,(IDENT7!=null?IDENT7.getText():null),"");
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:147:3: b1= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement585);
					b1=block(symTab);
					state._fsp--;

					 code = b1; 
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:148:7: ^( IF_KW e1= expression[symTab] st1= statement[symTab] (st2= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement597); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement601);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement606);
					st1=statement(symTab);
					state._fsp--;



							LabelSymbol l1 = SymbDistrib.newLabel();
							code = Code3aGenerator.genIfz(Inst3a.TAC.IFZ,l1,e1);  
							code.append(st1);
							LabelSymbol l2 = SymbDistrib.newLabel();
							code.append(Code3aGenerator.genGoto(Inst3a.TAC.GOTO, l2));
							code.append(Code3aGenerator.genLabel(l1));
						
					// ./src/VSLTreeParser.g:158:2: (st2= statement[symTab] )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ASSIGN_KW||LA10_0==IF_KW||LA10_0==PRINT_KW||LA10_0==READ_KW||LA10_0==WHILE_KW||LA10_0==BLOCK) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// ./src/VSLTreeParser.g:158:3: st2= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement618);
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
				case 4 :
					// ./src/VSLTreeParser.g:163:3: ^( WHILE_KW e1= expression[symTab] st1= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement635); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement639);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement644);
					st1=statement(symTab);
					state._fsp--;


						LabelSymbol l1 = SymbDistrib.newLabel();
						LabelSymbol l2 = SymbDistrib.newLabel();
						code = Code3aGenerator.genLabel(l1);
						code.append(Code3aGenerator.genIfz(Inst3a.TAC.IFZ,l2,e1)); 
						code.append(st1);
						code.append(Code3aGenerator.genGoto(Inst3a.TAC.GOTO, l1));
						code.append(Code3aGenerator.genLabel(l2));
						
					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:174:4: ^( PRINT_KW (p1= print_item[symTab] )+ )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement659); 
					match(input, Token.DOWN, null); 
					// ./src/VSLTreeParser.g:174:15: (p1= print_item[symTab] )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==DIV||LA11_0==IDENT||LA11_0==INTEGER||(LA11_0 >= MINUS && LA11_0 <= MUL)||LA11_0==PLUS||LA11_0==TEXT||LA11_0==NEGAT) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// ./src/VSLTreeParser.g:174:16: p1= print_item[symTab]
							{
							pushFollow(FOLLOW_print_item_in_statement664);
							p1=print_item(symTab);
							state._fsp--;

							 code.append(p1);
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ./src/VSLTreeParser.g:175:7: ^( READ_KW (r1= read_item[symTab] )+ )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement679); 
					match(input, Token.DOWN, null); 
					// ./src/VSLTreeParser.g:175:17: (r1= read_item[symTab] )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==IDENT) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// ./src/VSLTreeParser.g:175:18: r1= read_item[symTab]
							{
							pushFollow(FOLLOW_read_item_in_statement684);
							r1=read_item(symTab);
							state._fsp--;

							 code.append(r1);
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
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
	// $ANTLR end "statement"



	// $ANTLR start "print_item"
	// ./src/VSLTreeParser.g:178:1: print_item[SymbolTable symTab] returns [Code3a code] : ( TEXT |e1= expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree TEXT8=null;
		ExpAttribute e1 =null;

		try {
			// ./src/VSLTreeParser.g:179:5: ( TEXT |e1= expression[symTab] )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TEXT) ) {
				alt14=1;
			}
			else if ( (LA14_0==DIV||LA14_0==IDENT||LA14_0==INTEGER||(LA14_0 >= MINUS && LA14_0 <= MUL)||LA14_0==PLUS||LA14_0==NEGAT) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// ./src/VSLTreeParser.g:179:7: TEXT
					{
					TEXT8=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item714); 

						Data3a data = new Data3a((TEXT8!=null?TEXT8.getText():null));
					 	code = Code3aGenerator.genArg(Inst3a.TAC.ARG,data.getLabel());
						code.append(Code3aGenerator.genCall(Inst3a.TAC.CALL,new LabelSymbol("L4")));
						code.appendData(data);
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:185:7: e1= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item726);
					e1=expression(symTab);
					state._fsp--;



						code = Code3aGenerator.genArg(Inst3a.TAC.ARG,e1);
						code.append(Code3aGenerator.genCall(Inst3a.TAC.CALL,new LabelSymbol("L2")) );
						
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
	// ./src/VSLTreeParser.g:192:1: read_item[SymbolTable symTab] returns [Code3a code] : IDENT ;
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT9=null;

		try {
			// ./src/VSLTreeParser.g:193:5: ( IDENT )
			// ./src/VSLTreeParser.g:193:7: IDENT
			{
			IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item751); 

					Operand3a id = symTab.lookup((IDENT9!=null?IDENT9.getText():null));
					if(id!=null && id.isVarInteger())
			      		code = Code3aGenerator.genRead(id);
					else 
						Errors.unknownIdentifier(IDENT9,(IDENT9!=null?IDENT9.getText():null),"");
				
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
	// ./src/VSLTreeParser.g:204:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( NEGAT e1= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:205:3: ( ^( NEGAT e1= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] )
			int alt15=6;
			switch ( input.LA(1) ) {
			case NEGAT:
				{
				alt15=1;
				}
				break;
			case MUL:
				{
				alt15=2;
				}
				break;
			case DIV:
				{
				alt15=3;
				}
				break;
			case PLUS:
				{
				alt15=4;
				}
				break;
			case MINUS:
				{
				alt15=5;
				}
				break;
			case IDENT:
			case INTEGER:
				{
				alt15=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// ./src/VSLTreeParser.g:206:3: ^( NEGAT e1= expression[symTab] )
					{
					match(input,NEGAT,FOLLOW_NEGAT_in_expression779); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression783);
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
					// ./src/VSLTreeParser.g:214:3: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression800); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression804);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression809);
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
					// ./src/VSLTreeParser.g:221:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression824); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression828);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression833);
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
					// ./src/VSLTreeParser.g:228:4: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression848); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression852);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression857);
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
					// ./src/VSLTreeParser.g:235:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression872); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression876);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression881);
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
					// ./src/VSLTreeParser.g:242:5: pe= primary_exp[symTab]
					{
					pushFollow(FOLLOW_primary_exp_in_expression898);
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
	// ./src/VSLTreeParser.g:249:1: primary_exp[SymbolTable symTab] returns [ExpAttribute expAtt] : ( INTEGER | IDENT );
	public final ExpAttribute primary_exp(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree INTEGER10=null;
		CommonTree IDENT11=null;

		try {
			// ./src/VSLTreeParser.g:250:3: ( INTEGER | IDENT )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==INTEGER) ) {
				alt16=1;
			}
			else if ( (LA16_0==IDENT) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// ./src/VSLTreeParser.g:250:5: INTEGER
					{
					INTEGER10=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary_exp928); 

					      ConstSymbol cs = new ConstSymbol(Integer.parseInt((INTEGER10!=null?INTEGER10.getText():null)));
					      expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:255:5: IDENT
					{
					IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp940); 

						  // verif si existe
							Operand3a id = symTab.lookup((IDENT11!=null?IDENT11.getText():null));
							if(id!=null && id.isVarInteger())
					      		expAtt = new ExpAttribute(id.type, new Code3a(), symTab.lookup((IDENT11!=null?IDENT11.getText():null)));
							else 
								Errors.unknownIdentifier(IDENT11,(IDENT11!=null?IDENT11.getText():null),"") ;
					    
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

	// Delegated rules



	public static final BitSet FOLLOW_program_in_s64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROG_in_program91 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unit_in_program96 = new BitSet(new long[]{0x0000000008002008L});
	public static final BitSet FOLLOW_function_in_unit127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proto_in_unit140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_KW_in_function166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_function170 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_function172 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_param_list_in_function180 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_body_in_function188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BODY_in_body212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_body216 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROTO_KW_in_proto240 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_proto244 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_proto246 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_param_list_in_proto256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_KW_in_type282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list325 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_PARAM_in_param_list340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_param364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block406 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block411 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block424 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_declaration453 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration458 = new BitSet(new long[]{0x0000004000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARDECL_in_decl_item496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_decl_item498 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_INTEGER_in_decl_item500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INST_in_inst_list531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list536 = new BitSet(new long[]{0x0000021044008028L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement570 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement574 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_statement577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_KW_in_statement597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement601 = new BitSet(new long[]{0x0000021044008020L});
	public static final BitSet FOLLOW_statement_in_statement606 = new BitSet(new long[]{0x0000021044008028L});
	public static final BitSet FOLLOW_statement_in_statement618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement639 = new BitSet(new long[]{0x0000021044008020L});
	public static final BitSet FOLLOW_statement_in_statement644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_item_in_statement664 = new BitSet(new long[]{0x0000800202C14208L});
	public static final BitSet FOLLOW_READ_KW_in_statement679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_item_in_statement684 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_TEXT_in_print_item714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_read_item751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGAT_in_expression779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression783 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression800 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression804 = new BitSet(new long[]{0x0000800002C14200L});
	public static final BitSet FOLLOW_expression_in_expression809 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression824 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression828 = new BitSet(new long[]{0x0000800002C14200L});
	public static final BitSet FOLLOW_expression_in_expression833 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression848 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression852 = new BitSet(new long[]{0x0000800002C14200L});
	public static final BitSet FOLLOW_expression_in_expression857 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression872 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression876 = new BitSet(new long[]{0x0000800002C14200L});
	public static final BitSet FOLLOW_expression_in_expression881 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_exp_in_expression898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary_exp928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp940 = new BitSet(new long[]{0x0000000000000002L});
}
