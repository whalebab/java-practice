package java_medium1.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();

        // 중첩 클래스는 바깥클래스.중첩클래스로 접근할 수 있다.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass()); // 클래스 정보 출력
    }
}
