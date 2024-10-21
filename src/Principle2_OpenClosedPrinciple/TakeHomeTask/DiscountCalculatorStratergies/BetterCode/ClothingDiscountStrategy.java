package Principle2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculatorStratergies.BetterCode;

class ClothingDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.20; // 20% discount for clothing
    }
}