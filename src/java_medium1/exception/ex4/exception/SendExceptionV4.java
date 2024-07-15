package java_medium1.exception.ex4.exception;


// NetworkClientExceptionV3 상속
// 전송 실패 시 발생하는 예외, 내부에 전송을 시도한 데이터인 sendDate를 보관
public class SendExceptionV4 extends NetworkClientExceptionV4 {

    private final String sendDate;

    public SendExceptionV4(String sendDate, String message) {
        super(message);
        this.sendDate = sendDate;
    }

    public String getSendDate() {
        return sendDate;
    }
}
