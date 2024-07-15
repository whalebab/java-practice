package java_medium1.lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        //Class helloClass = Hello.class;
        Class helloClass = Class.forName("java_medium1.lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // 생성자를 선택한후 선택된 생성자를 기반으로 인스턴스를 생성한다.
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
