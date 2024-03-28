package lang.Object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string); // java.lang.Object@2f4d3709
                                    // -- 클래스 정보 -- @ -참조값-
        // object 직접 출력
        System.out.println(object); // java.lang.Object@2f4d3709

    }
}
