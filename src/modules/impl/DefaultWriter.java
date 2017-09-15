package modules.impl;

import modules.spec.Value;
import modules.spec.Writer;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author Obicere
 */
public class DefaultWriter implements Writer{
    @Override
    public void write(final Value value, final DataOutputStream stream) throws IOException {
        stream.writeUTF(value.getValue());
    }
}
