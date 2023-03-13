package singleton;

public class MultiThreadedMySingleton {
    private static MultiThreadedMySingleton instance = null;

    private MultiThreadedMySingleton() {
    }

    public static MultiThreadedMySingleton getInstance() {
        if (instance == null) {
            synchronized (MultiThreadedMySingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadedMySingleton();
                }
            }
        }
        return instance;
    }
}
