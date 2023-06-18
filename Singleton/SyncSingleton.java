package Singleton;

public class SyncSingleton {
    private static SyncSingleton instance;

    private SyncSingleton(){}

    public static synchronized SyncSingleton getInstance() {
        if(instance == null) {
            instance = new SyncSingleton();
        }
        return instance;
    }
}
