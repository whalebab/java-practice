package time.test;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
*문제2 - 날짜 간격 반복 출력하기
**문제 설명**
2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.
`TestLoopPlus` 클래스에 문제를 풀어라
**실행 결과**
```
날짜 1: 2024-01-01
날짜 2: 2024-01-15
날짜 3: 2024-01-29
날짜 4: 2024-02-12
날짜 5: 2024-02-26
*/
public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }
    }
}
