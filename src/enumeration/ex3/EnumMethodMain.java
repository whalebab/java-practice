package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 ENUM 반환 ( array.values() )
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        // ENUM의 값들 반환 ( .name() )
        // ENUM의 순서 반환 ( .ordinal() )
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal=" + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 기능
    }
}
