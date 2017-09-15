package modules.impl;

import modules.group.Group;
import modules.spec.Builder;
import modules.spec.Value;

/**
 * @author Obicere
 */
public class DefaultBuilder implements Builder {

    private String text = "default value";

    @Override
    public DefaultBuilder setValue(final String text) {
        this.text = text;
        return this;
    }

    @Override
    public Value build() {
        return Group.getFactory().create(text);
    }
}
