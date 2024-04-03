package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); // now() : 현재 시간을 기준으로 생성
        LocalDate ofDate = LocalDate.of(2013, 11, 21); // of(...) 특정 날짜를 기준으로 생성. 년, 월, 일을 입력할 수 있다.
        System.out.println("오늘 날짜= " + nowDate);
        System.out.println("지정 날짜= " + ofDate);

        // 계산(불변)
        ofDate = ofDate.plusDays(10); // plusDays() : 특정 일을 더한다.
        System.out.println("지정 날짜+10d = " + ofDate);

        // ※ 모든 날짜 클래스는 불변
        // 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야 한다.
    }
}
