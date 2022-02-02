package adaptor;

public class Main {
    // 콘센트
    public static void connect(Electronic110V electronic110v) {
        electronic110v.powerOn();
    }

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        // 어댑터 패턴 활용
        // 인터페이스가 다른 Cleaner를 SocketAdaptor 클래스를 통해서 Elecetronic110v처럼 사용 가능하도록 함
        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdaptor(cleaner);
        connect(adapter);

        Airconditioner airConditioner = new Airconditioner();
        Electronic110V airAdaptor = new SocketAdaptor(airConditioner);
        connect(airAdaptor);
    }
}
