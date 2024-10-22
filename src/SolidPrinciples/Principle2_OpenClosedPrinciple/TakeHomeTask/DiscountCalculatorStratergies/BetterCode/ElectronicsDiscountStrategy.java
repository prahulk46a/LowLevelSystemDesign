package SolidPrinciples.Principle2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculatorStratergies.BetterCode;

public class ElectronicsDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.10; // 10% discount for electronics
    }
}
