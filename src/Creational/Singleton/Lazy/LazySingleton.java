package Creational.Singleton.Lazy;

class LazySingleton {
    private static LazySingleton ourInstance;

    static LazySingleton getInstance()
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
