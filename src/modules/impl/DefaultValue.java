package modules.impl;

import modules.spec.Value;

/**
 * @author Obicere
 */
public class DefaultValue implements Value {

    private String value;

    public DefaultValue(final String value) {
        setValue(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(final String value) {
        this.value = value;
    }
}
