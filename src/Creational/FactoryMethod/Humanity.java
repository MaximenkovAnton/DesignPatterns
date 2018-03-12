package Creational.FactoryMethod;

class Humanity extends Sensable {
    @Override
    Human Create() {
        return new Human();
    }
}
