package Creational.Factory;

public class IceCreamFactory {
    IceCream getIceCream(String name){
        switch (name) {
            case "FrozenYogurt":
                return new FrozenYogurtIceCream();
            case "Rolled":
                return new RolledIceCream();
            default:
                throw new IllegalArgumentException("Ice-cream not found");
        }
    }
}
