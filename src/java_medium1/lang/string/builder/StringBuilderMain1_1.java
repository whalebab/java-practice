package java_medium1.lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);
        
        sb.insert(4, "Java"); // 문자열 인덱스 4번 위치에 삽입
        System.out.println("insert = " + sb);

        sb.delete(4,8); // 문자열 인덱스 4~8까지 삭제
        System.out.println("delete = " + sb);

        sb.reverse(); // 문자열 거꾸로 뒤집기
        System.out.println("reverse = " + sb);

        // StringBuilder -> String (가변 -> 불변) 변경
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
