package Structural.Decorator;

class FrozenYogurtIceCream extends Product {
    double price = 1.30;

    FrozenYogurtIceCream() {
        description = "Frozen Yogurt ice cream";
    }

    @Override
    double getPrice() {
        return price;
    }
}
