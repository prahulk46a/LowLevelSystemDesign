package Principle3_LiskovSubstitutionPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;
// Object of child class should be as it is substitutable in the variables of parent class
public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }
    }
}
