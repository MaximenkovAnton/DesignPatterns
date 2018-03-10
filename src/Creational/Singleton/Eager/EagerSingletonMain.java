package Creational.Singleton.Eager;

public class EagerSingletonMain {
    public static void main(String[] args) {
        EagerSingleton es = EagerSingleton.getInstance();
        es.doSomething();
    }
}
