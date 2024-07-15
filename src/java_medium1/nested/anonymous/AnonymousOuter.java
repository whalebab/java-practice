package java_medium1.nested.anonymous;

import java_medium1.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar); // 매개변수도 지역변수의 한 종류
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };

        printer.print();;
        System.out.println("printer.class= " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
