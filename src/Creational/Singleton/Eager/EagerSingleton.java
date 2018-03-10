package Creational.Singleton.Eager;

class EagerSingleton {
    private static EagerSingleton ourInstance = new EagerSingleton();

    static EagerSingleton getInstance() {
        return ourInstance;
    }

    private EagerSingleton() {
    }

    void doSomething(){
        System.out.println("Operating...");
    }
}
