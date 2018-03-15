package Behavioral.Observer.FullImpl;

abstract class Forcast {
    abstract void registerObserver(Observer observer);
    abstract void removeObserver(Observer observer);
    abstract void notifyObservers();
}
