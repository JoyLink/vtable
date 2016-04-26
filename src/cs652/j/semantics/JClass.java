package cs652.j.semantics;

import org.antlr.symbols.ClassSymbol;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by xyz on 4/1/15.
 */
public class JClass extends ClassSymbol {
    public JClass(String name, ParserRuleContext tree) {
        super(name, tree);
    }
}
