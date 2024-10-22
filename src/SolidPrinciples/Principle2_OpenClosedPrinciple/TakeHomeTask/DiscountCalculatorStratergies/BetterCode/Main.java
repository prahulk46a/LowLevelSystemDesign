package SolidPrinciples.Principle2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculatorStratergies.BetterCode;

public class Main {
    public static void main(String[] args) {
        Product electronics = new Product(1000, ProductType.ELECTRONICS);
        Product clothing = new Product(500,ProductType.CLOTHING);

        DiscountCalculator calculator = new DiscountCalculator();

        // Using the appropriate discount strategy
        DiscountStrategy electronicsStrategy = new ElectronicsDiscountStrategy();
        DiscountStrategy clothingStrategy = new ClothingDiscountStrategy();

        System.out.println("Electronics discount: " + calculator.calculateDiscount(electronics, electronicsStrategy));
        System.out.println("Clothing discount: " + calculator.calculateDiscount(clothing, clothingStrategy));
    }
}
