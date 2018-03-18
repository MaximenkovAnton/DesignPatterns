package Creational.Factory;

class FrozenYogurtIceCream extends IceCream{
    double price = 1.30;

    FrozenYogurtIceCream() {
        description = "Frozen Yogurt ice cream";
    }

    @Override
    double getPrice() {
        return price;
    }
}
