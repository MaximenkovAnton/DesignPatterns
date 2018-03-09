package Behavioral.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Dog dog = new Dog(new PuppyBarking());
        dog.bark();
        dog.setBarkStrategy(new AgressiveBarking());
        dog.bark();
    }
}
