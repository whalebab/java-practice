package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
* 문제3 - 디데이 구하기
**문제 설명**
시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라. 실행 결과를 참고하자.
남은 기간: x년 x개월 x일 형식으로 출력한다.
디데이: x일 남은 형식으로 출력한다.

**실행 결과**
```
시작 날짜: 2024-01-01
목표 날짜: 2024-11-21
남은 기간: 0년 10개월 20일
디데이: 325일 남음
*/
public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 시간: " + period.getYears() +"년 " + period.getMonths() + "개월 " + period.getDays() + "일 ");
        System.out.println("디데이: " + daysBetween + "일 남음");
    }
}
