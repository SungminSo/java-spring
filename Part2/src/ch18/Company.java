package ch18;

public class Company {
    // singleton pattern
    // 프로그램에서 인스턴스가 한개만 생성되어야 하는 경우 사용하는 디자인 패턴

    // 유일한 객체는 해당 클래스 내부에서 생성
    private static Company instance = new Company();

    // 외부에서 생성자를 호출할 수 없도록 private로 생성자 선언
    private Company() {}

    // 인스턴스 접근을 위한 public 메소드 생성
    // 외부에서 해당 메소드를 사용하기 위해서 static으로 선언
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
