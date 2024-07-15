package java_start.method.ex;

/*
메서드를 사용해서 리펙토링해보자.
    String message = "Hello, world!";
    for (int i = 0; i < 3; i++) {
    System.out.println(message);
    }
    for (int i = 0; i < 5; i++) {
    System.out.println(message);
    }
    for (int i = 0; i < 7; i++) {
    System.out.println(message);
    }

실행 결과**
```
Hello, world!
Hello, world!
... //여러번 반복
*/

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("Hello, world", 3);
        printMessage("Hello, world", 5);
        printMessage("Hello, world", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
