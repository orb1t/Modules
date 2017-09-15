package modules.impl;

import modules.spec.Modeler;
import modules.spec.Value;

import java.io.PrintStream;

/**
 * @author Obicere
 */
public class DefaultModeler implements Modeler {
    @Override
    public void model(final Value value, final PrintStream stream) {
        stream.println(value.getValue());
    }
}
