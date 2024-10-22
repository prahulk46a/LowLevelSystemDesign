package SolidPrinciples.Principle4_InterfaceSegregationPrinciple.ProblematicCode;

public class Buyer implements User{
    //Problem=> A class should not be forced to implement methods it doesn’t need. ex. buyer is not able to modify
    //          but still it needs to implement that modify method this is problematic.

    //Solution=> Class should have small, focused interfaces rather than large, monolithic ones.
    //           This helps to avoid unnecessary dependencies and ensures that classes only implement the methods they actually need.
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public void approveProduct() {

    }
}
