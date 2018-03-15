package Structural.Decorator;

class NutsFlavor extends Flavor{
    double price = .30;

    NutsFlavor(Product product) {
        this.product = product;
    }

    @Override
    String getDescription() {
        return product.getDescription() + ", nuts";
    }

    @Override
    double getPrice() {
        return price + product.getPrice();
    }
}
