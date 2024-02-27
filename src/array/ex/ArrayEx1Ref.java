package array.ex;

/*
문제 - 배열을 사용하도록 변경
다음 문제를 배열을 사용해서 개선하자.
    int student1 = 90;
    int student2 = 80;
    int student3 = 70;
    int student4 = 60;
    int student5 = 50;
    int total = student1 + student2 + student3 + student4 + student5;
    double average = (double) total / 5;
    System.out.println("점수 총합: " + total);
    System.out.println("점수 평균: " + average);
*/
public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}