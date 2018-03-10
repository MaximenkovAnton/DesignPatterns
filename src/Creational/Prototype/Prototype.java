package Creational.Prototype;

abstract class Prototype implements Cloneable {
    @Override
    abstract protected Prototype clone() throws CloneNotSupportedException;
}
