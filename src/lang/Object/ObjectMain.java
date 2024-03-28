package lang.Object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString(); // child 객체 대한 정보를 반환(출력)해줌
        System.out.println(string);
    }
}
