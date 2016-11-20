import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        VSLParserLexer lex = new VSLParserLexer(new ANTLRFileStream("/home/kwodhan/Documents/M1-Info/COMP/TP2/TP2-antlr/src/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        VSLParserParser parser = new VSLParserParser(tokens);
        VSLParserParser.s_return r = parser.s();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        VSLTreeParser walker = new VSLTreeParser(nodes);
        try {
            walker.s();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}