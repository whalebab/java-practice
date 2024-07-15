package java_basic.access.ex;

/*

요구사항**
**접근 제어자를 사용해서 데이터를 캡슐화 하세요.**
**해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.**
장바구니에는 상품을 최대 10개만 담을 수 있다.
10개 초과 등록시: "장바구니가 가득 찼습니다." 출력

*/
public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
