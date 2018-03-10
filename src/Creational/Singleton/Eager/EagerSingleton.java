package Creational.Singleton.Eager;

public class EagerSingleton {
    private static EagerSingleton ourInstance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return ourInstance;
    }

    private EagerSingleton() {
    }

    void doSomething(){
        System.out.println("Operating...");
    }
}
