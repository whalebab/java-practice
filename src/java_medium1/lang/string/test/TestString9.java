package java_medium1.lang.string.test;

/*
* 문제 설명**
`split()` 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
* */
public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] emails = email.split("@");
        String id = emails[0];
        String Domain = emails[1];
        System.out.println("id = " + id);
        System.out.println("Domain = " + Domain);
    }
}
