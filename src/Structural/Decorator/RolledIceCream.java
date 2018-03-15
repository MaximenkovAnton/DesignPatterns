package Structural.Decorator;

class RolledIceCream extends Product {
    double price = 1.45;

    RolledIceCream() {
        description = "Rolled ice cream";
    }

    @Override
    double getPrice() {
        return price;
    }
}
