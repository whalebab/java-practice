package java_medium1.lang.string.test;

/*
**문제 설명**
str` 에서 `key` 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
`indexOf()` 를 반복문과 함께 풀면 된다.
* */
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf("hello");
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
