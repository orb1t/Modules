package modules.custom;

import modules.impl.DefaultValue;

/**
 * @author Obicere
 */
public class ReverseValue extends DefaultValue {
    public ReverseValue(final String value) {
        super(value);
    }

    @Override
    public void setValue(final String value) {
        super.setValue(value == null ? null : new StringBuilder(value).reverse().toString());
    }
}
