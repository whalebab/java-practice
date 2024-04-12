package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try { // 하나의 try안에 정상 흐름을 모두 담는다
            client.connect(); // error1 작성 시 예외가 터짐
            client.send(data); // error2 작성 시 예외가 터짐
            client.disconnect(); // -> ???? 얘는 항상 마지막에 실행되어야함 (연결종료 -> 연결이 종료가 되지 않으면 메모리 누수가 발생한다고 가정 / 즉, 서버가 일주일마다 터짐)
        } catch (NetworkClientExceptionV2 e) { // 예외 부분은 catch 블럭에서 해결
            System.out.println("[오류] 코드: " + e.getMessage() + ", 메시지: " + e.getMessage());
        }
    }
}
