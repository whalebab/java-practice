package staticMethod;

public class DecoUtil2 {

    // 정적 메서드 : 정적 변수처럼 인스턴스(객체)생성 없이 클래스 명을 통해서 바로 호출할 수 있다.
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
