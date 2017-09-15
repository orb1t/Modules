package modules.impl;

import modules.spec.Builder;
import modules.spec.Reader;
import modules.spec.Value;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author Obicere
 */
public class DefaultReader implements Reader{
    @Override
    public Value read(final DataInputStream stream) throws IOException {
        final Builder builder = new DefaultBuilder();
        builder.setValue(stream.readUTF());
        return builder.build();
    }
}
