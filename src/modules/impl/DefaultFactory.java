package modules.impl;

import modules.spec.Factory;
import modules.spec.Value;

/**
 * @author Obicere
 */
public class DefaultFactory implements Factory {

    @Override
    public Value create(final String value) {
        return new DefaultValue(value);
    }
}
