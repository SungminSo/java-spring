package ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        // JVM이 할당해준 가상의 주소 출력
        System.out.println(company1);
        System.out.println(company2);

        // 응용
        Calendar calender = Calendar.getInstance();
    }
}
