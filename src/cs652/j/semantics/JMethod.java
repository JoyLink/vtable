package cs652.j.semantics;

import org.antlr.symbols.MethodSymbol;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by xyz on 4/1/15.
 */
public class JMethod extends MethodSymbol {
    public JMethod(String name, ParserRuleContext tree) {
        super(name, tree);
    }
}
