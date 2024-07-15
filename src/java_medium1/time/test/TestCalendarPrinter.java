package java_medium1.time.test;

/*
* 문제와 풀이2
문제6 - 달력 출력하기
실행 결과를 참고해서 달력을 출력해라.
입력 조건: 년도, 월
실행시 날짜의 간격에는 신경을 쓰지 않아도 된다. 간격을 맞추는 부분은 정답을 참고하자.
**실행 결과**
```
년도를 입력하세요: 2024
월을 입력하세요: 1
Su Mo Tu We Th Fr Sa
1 2 3 4 5 6
7 8 9 10 11 12 13
14 15 16 17 18 19 20
21 22 23 24 25 26 27
28 29 30 31
```
```
년도를 입력하세요: 2025
월을 입력하세요: 1
Su Mo Tu We Th Fr Sa
1 2 3 4
5 6 7 8 9 10 11
12 13 14 15 16 17 18
19 20 21 22 23 24 25
26 27 28 29 30 31
* */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfWeek = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfWeek.plusMonths(1);

        // 월요일=1 (1%7=1), ... 일요일=7 (7%7=0)
        int offsetWeekDays = firstDayOfWeek.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfWeek;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
