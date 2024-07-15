package java_medium1.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE); // Unsupported field: SecondOfMinute : 지원하지 않는 필드
            System.out.println("minute = " + minute);
        }
    }
}
