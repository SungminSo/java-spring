package ch15;

public class Employee {
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    // static 메서드에서는 인스턴스 변수 사용 불가능
    // -> static 메서드는 인스턴스 생성과 무관하게 생성될 수 있기 때문에
    public static int getSerialNum() {
        int i = 0;  // 이거는 지역변수이기 때문에 상관없음
        // employeeName = "asdf";  // 이 변수가 호출될때는 항상 인스턴스가 존재한다는게 보장되지 않기 때문에 에러 발생
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
