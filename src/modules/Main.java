package modules;

import modules.custom.ReverseFactory;
import modules.group.Group;
import modules.spec.Value;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Obicere
 */
public class Main {

    public static void main(final String[] args) {
        System.out.println("Default: ");
        exercise();

        Group.setFactory(new ReverseFactory());
        System.out.println("Custom (Reverse): ");
        exercise();
    }

    private static void exercise() {
        byte[] inputData = new byte[]{0, 3, 0x41, 0x42, 0x43};

        final DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(inputData));
        final ByteArrayOutputStream outputBytes = new ByteArrayOutputStream();
        final DataOutputStream outputStream = new DataOutputStream(outputBytes);

        try {
            final Value value = Group.getReader().read(inputStream);

            Group.getModeler().model(value, System.out);

            Group.getWriter().write(value, outputStream);

            System.out.println(Arrays.toString(outputBytes.toByteArray()));
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
