package java_start.method;

public class MethodCastint1 {
    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); // double을 int에 대입하므로 컴파일 오류
        // 컴파일 오류 = java: incompatible types: possible lossy conversion from double to int
        printNumber((int)number); // 명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
