package ch04;

public class Student {

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        // System.out.println()안에서 int + string은 '+' 연산자 오버라이드에 의해서 문자열로 처리됨.
        System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
