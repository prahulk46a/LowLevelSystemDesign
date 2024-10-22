package Principle4_InterfaceSegregationPrinciple.BetterCode;

public class Admin implements ICanApprove,ICanModify,ICanBuy,ICanSell{

    @Override
    public void approve() {
        System.out.println("Admin can approve the product ");
    }

    @Override
    public void buy() {
        System.out.println("Admin can Buy the product ");
    }

    @Override
    public void modify() {
        System.out.println("Admin can modify the product ");
    }

    @Override
    public void sell() {
        System.out.println("Admin can sell the product ");
    }
}
