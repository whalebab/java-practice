package ref.ex;

/*
`ref.ex.ProductOrderMain2` 클래스 안에 `main()` 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고,
그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자. 이 클래스에서는 다음과 같은 메서드를 포함해야 합니다:
`static ProductOrder createOrder(String productName, int price, int quantity)`
`ProductOrder` 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 `ProductOrder` 를
반환합니다.
`static void printOrders(ProductOrder[] orders)`
배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 상품명, 가격, 수량을 출력합니다.
`static int getTotalAmount(ProductOrder[] orders)`
배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 총 결제 금액을 계산하고, 계산 결과를 반환합니다.

출력 예시**
```
상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000
*/

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        // 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 상품명, 가격, 수량을 출력합니다.
        for (ProductOrder order : orders) {
            //상품명: 콜라, 가격: 1500, 수량: 2
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        // 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 총 결제 금액을 계산하고, 계산 결과를 반환합니다.
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
