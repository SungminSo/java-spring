package ch09;

public class Student {
    int studentId;
    // 참조자료형
    // RDB에서 relation 거는거랑 비슷한 개념
    // 사용 시 생성자 호출해서 인스턴스 생성 필요
    // String은 예외
    String studentName;

    Subject korea;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
    }
}
