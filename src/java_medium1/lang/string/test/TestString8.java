package java_medium1.lang.string.test;

/*
* 문제 설명**
`replace()` 를 사용해서 `java` 라는 단어를 `jvm` 으로 변경해라.
* */
public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        String replace = input.replace("java", "jvm");
        System.out.println("replace = " + replace);
    }
}
