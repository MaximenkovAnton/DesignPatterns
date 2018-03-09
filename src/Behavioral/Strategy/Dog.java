package Behavioral.Strategy;

import java.util.Objects;

public class Dog {
    private BarkStrategy barkStrategy;

    void bark(){
        barkStrategy.bark();
    }

    public Dog(BarkStrategy barkStrategy) {
        Objects.requireNonNull(barkStrategy);
        this.barkStrategy = barkStrategy;
    }

    public void setBarkStrategy(BarkStrategy barkStrategy) {
        Objects.requireNonNull(barkStrategy);
        this.barkStrategy = barkStrategy;
    }
}
