package java_medium1.enumeration.ex3;

import static java_medium1.enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0; // 할인율

        if (classGrade == BASIC) {
            discountPercent = 10;
        } else if (classGrade == GOLD) {
            discountPercent = 20;
        } else if (classGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        // 10000 * (20 / 100) -> 2000원
        return price * discountPercent / 100;
    }
}
