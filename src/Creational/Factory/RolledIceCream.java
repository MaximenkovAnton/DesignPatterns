package Creational.Factory;

class RolledIceCream extends IceCream{
    double price = 1.45;

    RolledIceCream() {
        description = "Rolled ice cream";
    }

    @Override
    double getPrice() {
        return price;
    }
}
