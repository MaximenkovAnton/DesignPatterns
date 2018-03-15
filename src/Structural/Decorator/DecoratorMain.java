package Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Product frozenYogurt = new FrozenYogurtIceCream();
        System.out.println(frozenYogurt);
        frozenYogurt = new ChocolateFlavor(frozenYogurt);
        System.out.println(frozenYogurt);
        frozenYogurt = new NutsFlavor(frozenYogurt);
        System.out.println(frozenYogurt);
        System.out.println();
        Product rolledIceCream = new RolledIceCream();
        System.out.println(rolledIceCream);
        rolledIceCream = new NutsFlavor(rolledIceCream);
        System.out.println(rolledIceCream);
        rolledIceCream = new NutsFlavor(rolledIceCream);
        rolledIceCream = new ChocolateFlavor(rolledIceCream);
        System.out.println(rolledIceCream);
    }
}
