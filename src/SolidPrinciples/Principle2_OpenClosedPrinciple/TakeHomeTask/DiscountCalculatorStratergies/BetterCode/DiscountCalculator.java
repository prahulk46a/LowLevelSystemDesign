package SolidPrinciples.Principle2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculatorStratergies.BetterCode;

class DiscountCalculator {
    public double calculateDiscount(Product product, DiscountStrategy strategy) {
        return strategy.calculateDiscount(product);
    }
}
