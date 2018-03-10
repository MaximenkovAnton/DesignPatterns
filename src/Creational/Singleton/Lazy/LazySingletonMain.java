package Creational.Singleton.Lazy;

public class LazySingletonMain {
    public static void main(String[] args) {
        LazySingleton es = LazySingleton.getInstance();
        es.doSomething();
    }
}
