package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int sum = 0;
        double average = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            numbers.add(n);
        }

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            average = (double) sum / numbers.size();
        }

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
