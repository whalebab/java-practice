package java_medium1.lang.string.test;

/*
* 문제 설명**
`startsWith()` 를 사용해서 `url` 이 `https://` 로 시작하는지 확인해라.
* */

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean bool = url.startsWith(url);
        System.out.println(bool);
    }

    public int startsWith(String string) {
        int result = string.indexOf("https://");
        return result;
    }
}
