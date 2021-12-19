package ch10;

import javax.xml.stream.FactoryConfigurationError;

public class BirthDay {

    // private 사용
    // public과의 차이는 클래스 밖에서 해당 변수에 값을 직접적으로 넣을 수 없음
    // => getter/setter를 사용하게 됨
    // => 객체를 사용할 떄 오류를 막을 수 있음(validation 등)
    private int day;
    private int month;
    private int year;

    private boolean isValid;  // default값은 False

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        }
        else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        }
        else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
