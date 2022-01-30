package singleton;

public class SocketClient {
    // singleton은 자기자신을 객체로 가지고 있음
    private static SocketClient socketClient = null;

    // 기본생성자를 private으로 막아야 함
    private SocketClient() {}

    public static SocketClient getInstance() {
        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
