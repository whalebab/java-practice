package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int AddValue) {
        value += AddValue;
        return this; // 자기 자신의 참조값을 반환
    }

    public int getValue() {
        return value;
    }
}
