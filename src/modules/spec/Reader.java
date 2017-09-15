package modules.spec;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author Obicere
 */
public interface Reader {

    public Value read(final DataInputStream stream) throws IOException;

}
