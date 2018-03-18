package Creational.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        IceCreamFactory iceCreamFactory = new IceCreamFactory();
        IceCream frozen = iceCreamFactory.getIceCream("FrozenYogurt");
        System.out.println(frozen);
        IceCream rolled = iceCreamFactory.getIceCream("Rolled");
        System.out.println(rolled);
    }
}
