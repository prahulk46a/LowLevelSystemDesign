package SolidPrinciples.Principle2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculatorStratergies.BetterCode;


class Product {
    ProductType type;
    double price;

    public Product(double price, ProductType type) {
        this.price = price;
        this.type = type;
    }

    double getPrice() {
        return price;
    }

    ProductType getType() {
        return type;
    }
}
