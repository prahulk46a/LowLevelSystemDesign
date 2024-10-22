package SolidPrinciples.Principle4_InterfaceSegregationPrinciple.BetterCode;

public class Seller implements ICanModify, ICanBuy, ICanSell{

    //No need of implementing unnecessary interface ICanApprove as seller doesnt have rights
    @Override
    public void buy() {

    }

    @Override
    public void modify() {

    }

    @Override
    public void sell() {

    }
}
