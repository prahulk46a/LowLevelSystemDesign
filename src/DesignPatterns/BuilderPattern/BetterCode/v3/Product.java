package DesignPatterns.BuilderPattern.BetterCode.v3;

import java.util.List;
/*
Problem with v3*
- Tightly couple
- User need to know about builder
- SomeBody can pass null so that should not be the case.
-
 */

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Product(Builder b) {
        if(b.getPrice() > 0) {
            this.price = b.getPrice();
        }
        this.name = b.getName();
        // ...
    }
}
