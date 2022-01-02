package ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();

        // default constructor 사용 시 해당 타입의 기본값으로 초기화됨.
        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(123456, "Kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
}
