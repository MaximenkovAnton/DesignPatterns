package Creational.Singleton.Lazy;

public class LazySingleton {
    private static LazySingleton ourInstance;

    public static LazySingleton getInstance()
    {
        if(ourInstance == null) ourInstance = new LazySingleton();
        return ourInstance;
    }

    private LazySingleton() {
    }

    void doSomething(){
        System.out.println("Operating...");
    }
}
