package modules.group;

import modules.impl.DefaultFactory;
import modules.impl.DefaultModeler;
import modules.impl.DefaultReader;
import modules.impl.DefaultWriter;
import modules.spec.Factory;
import modules.spec.Modeler;
import modules.spec.Reader;
import modules.spec.Writer;

/**
 * @author Obicere
 */
public class Group {

    private static Factory factory;

    private static Modeler modeler;

    private static Reader reader;

    private static Writer writer;

    static {
        factory = new DefaultFactory();
        modeler = new DefaultModeler();
        reader = new DefaultReader();
        writer = new DefaultWriter();
    }

    public static Factory getFactory() {
        return factory;
    }

    public static void setFactory(final Factory factory) {
        Group.factory = factory;
    }

    public static Modeler getModeler() {
        return modeler;
    }

    public static void setModeler(final Modeler modeler) {
        Group.modeler = modeler;
    }

    public static Reader getReader() {
        return reader;
    }

    public static void setReader(final Reader reader) {
        Group.reader = reader;
    }

    public static Writer getWriter() {
        return writer;
    }

    public static void setWriter(final Writer writer) {
        Group.writer = writer;
    }
}
