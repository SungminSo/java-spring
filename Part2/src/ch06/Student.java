package ch06;

public class Student {
    // 생성자가 구현이 안되어 있을 경우
    // default constructor가 사용됨
    // pre-compile 시, 컴파일러에 의해서 생성됨

    public int number;
    public String name;
    public int grade;

    // 에러 방지를 위한 default constructor
    // 객체 생성을 위한 필수 파라미터가 있을 경우 기본 생성자 사용 불가
    public Student() {}

    // parameter와 함께 사용하는 constructor -> 오버로딩
    public Student(int number, String name, int grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return name + "학생의 학번은 " + number + "이고, " + grade + "학년입니다.";
    }
}
