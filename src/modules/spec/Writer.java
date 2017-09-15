package modules.spec;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author Obicere
 */
public interface Writer {

    public void write(final Value value, final DataOutputStream stream) throws IOException;

}
