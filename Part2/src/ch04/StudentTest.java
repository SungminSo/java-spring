package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();  // 여기서 생성되는 객체가 인스턴스

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.setStudentName("Kim");
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();
    }
}
