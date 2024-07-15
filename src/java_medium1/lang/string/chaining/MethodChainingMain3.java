package java_medium1.lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        //int result = x001.add(1).add(2).add(3).getValue();
        //int result = x001.add(2).add(3).getValue();
        //int result = x001.add(3).getValue();
        //int result = x001.getValue();
        System.out.println("result = " + result);
    }
}
