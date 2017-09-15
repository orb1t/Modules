package modules.custom;

import modules.spec.Factory;
import modules.spec.Value;

/**
 * @author Obicere
 */
public class ReverseFactory implements Factory{
    @Override
    public Value create(final String value) {
        return new ReverseValue(value);
    }
}
