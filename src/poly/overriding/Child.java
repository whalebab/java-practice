package poly.overriding;

public class Child extends Parent {

    public String value = "child";

    @Override // (Ctrl + O)
    public void method() {
        System.out.println("Child.method");
    }
}
