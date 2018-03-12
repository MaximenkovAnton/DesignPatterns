package Creational.FactoryMethod;

class Aliance extends Sensable{
    @Override
    Sense Create() {
        return new Alien();
    }
}
