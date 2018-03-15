package Structural.Decorator;

abstract class Product {
    String description = "Unknown product";

    String getDescription() {
        return description;
    }

    abstract double getPrice();
    @Override
    public String toString() {
        if(getPrice() <= 0) throw new IllegalStateException("Price should be > 0");
        return getDescription() + " $" + getPrice();
    }
}
