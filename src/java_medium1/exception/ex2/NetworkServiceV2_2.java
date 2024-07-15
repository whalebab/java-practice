package java_medium1.exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getMessage() + ", 메시지: " + e.getMessage());
            return; // 연결 실패 했을 시 send 하지 못하도록
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getMessage() + ", 메시지: " + e.getMessage());
            return;
        }

        client.disconnect();
    }
}
