package Behavioral.Strategy;

public class AgressiveBarking extends BarkStrategy{
    @Override
    void bark() {
        System.out.println("Hrrrr... Don't come to me! Bow-wow");
    }
}
