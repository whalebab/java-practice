package method.ex;

/*
문제 - 평균값 리펙토링
메서드를 잘 이해하고 있는지 확인하기 위해 다음 코드를 메서드를 사용하도록 리펙토링해보자.

**실행 결과**
```
평균값: 2.0
평균값: 25.0
*/
public class MethodEx1 {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균값: " + average);
//        int x = 15;
//        int y = 25;
//        int z = 35;
//        sum = x + y + z;
//        average = sum / 3.0;
//        System.out.println("평균값: " + average);


        System.out.println("평균값: " + average(1,2,3));
        System.out.println("평균값: " + average(15,25,35));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
