package java_medium1.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // new 바깥클래스의 인스턴스 참조.내부클래스()
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
