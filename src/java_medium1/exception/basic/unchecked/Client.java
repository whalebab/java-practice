package java_medium1.exception.basic.unchecked;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
