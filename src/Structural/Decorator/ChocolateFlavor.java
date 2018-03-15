package Structural.Decorator;

class ChocolateFlavor extends Flavor{
    double price = .50;

    ChocolateFlavor(Product product) {
        this.product = product;
    }

    @Override
    String getDescription() {
        return product.getDescription() + ", chocolate";
    }

    @Override
    double getPrice() {
        return price + product.getPrice();
    }
}
