package java_medium1.lang.string.test;

/*
* 문제 설명**
`str` 에서 `".txt"` 문자열이 언제부터 시작하는지 위치를 찾아서 출력해라. `indexOf()` 를 사용해라.
* */
public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);
    }
}
