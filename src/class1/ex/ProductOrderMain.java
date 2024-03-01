package class1.ex;

/*
요구 사항**
1. `ProductOrder` 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
상품명 ( `productName` )
가격 ( `price` )
주문 수량 ( `quantity` )
2. `ProductOrderMain` 클래스 안에 `main()` 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고, 그
정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
3. 출력 예시와 같도록 출력하면 된다.

**출력 예시**
```
상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000
*/

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}

