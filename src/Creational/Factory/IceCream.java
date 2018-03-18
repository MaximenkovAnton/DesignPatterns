package Creational.Factory;

abstract class IceCream {
    String description;
    abstract double getPrice();
    public String toString(){
        return description.concat(" $" + getPrice());
    }
}
