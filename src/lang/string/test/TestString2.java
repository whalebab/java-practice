package lang.string.test;

/*
* 문제 설명**
`length()` 를 사용해서 `arr` 배열에 들어있는 모든 문자열의 길이 합을 구해라.
실행 결과에 맞도록 출력하자.
* */

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (String s : arr) {
            System.out.println(s + ":" + s.length());
            sum += s.length();
        }
        System.out.println("sum = " + sum);
    }
}
