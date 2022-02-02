package facade;

public class Main {
    public static void main(String[] args) {
        // Facade 인터페이스를 사용하지 않을 경우
        /*
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("test.txt");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("test.txt");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();
        */
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "test.txt");
        sftpClient.connect();

        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
    }
}
