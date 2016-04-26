package cs652.j.semantics;

import org.antlr.symbols.FieldSymbol;
import org.antlr.symbols.Scope;

/**
 * Created by xyz on 4/1/15.
 */
public class JField extends FieldSymbol {
    public JField(Scope scope, String name) {
        super(scope, name);
    }
}
