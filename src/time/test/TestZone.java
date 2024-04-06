package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
* 문제5 - 국제 회의 시간
서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구해라.
실행 결과를 참고하자.
`TestZone` 클래스에 문제를 풀어라.

**실행 결과**
```
서울의 회의 시간: 2024-01-01T09:00+09:00[Asia/Seoul]
런던의 회의 시간: 2024-01-01T00:00Z[Europe/London]
뉴욕의 회의 시간: 2023-12-31T19:00-05:00[America/New_York]
* */
public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴욕의 회의 시간: " + nyTime);
    }
}
