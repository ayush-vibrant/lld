package abstractFactory;

import abstractFactory.simpleFactory.MacOsFactory;
import abstractFactory.simpleFactory.OsFactory;
import abstractFactory.simpleFactory.WindowsOsFactory;

public class GUIAbstractFactory {
    // Abstract factory would return factory. Once you have factory, you can create concrete objects from that factory.
    static OsFactory osFactory;

    public static OsFactory createFactory(String os) {
        switch(os) {
            case "Mac":
                osFactory = new MacOsFactory();
                break;
            case "Windows":
                osFactory = new WindowsOsFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid operating system: " + os);
        }
        return osFactory;
    }
}

