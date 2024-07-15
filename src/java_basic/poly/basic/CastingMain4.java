package java_basic.poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        // ※ 항상 객체를 생성할 때 본인 객체와 본인 부모의 객체만 생성됨 / 본인의 자식 객체는 생성되지 않음
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가
    }
}
