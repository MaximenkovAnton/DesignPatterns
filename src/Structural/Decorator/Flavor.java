package Structural.Decorator;

abstract class Flavor extends Product{
    Product product;
    @Override
    abstract String getDescription();
}
