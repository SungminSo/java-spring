package ch10;

public class ConstantTest {
    public static void main(String[] args) {
        // 바뀌지 않는 값인 상수값은 'final' 예약어를 사용해서 선언
        // 보통 모든 글자를 대문자로 선언
        final int MAX_NUM = 100;  // 상수는 보통 선언과 동시에 초기화
        final int MIN_NUM;        // 초기화를 반드시 선언할 때 할 필요는 없음. 사용 전에만 초기화하면 됨

        // MAX_NUM = 20; <- Cannot assign a value to final variable 'MAX_NUM'

        System.out.println(MAX_NUM);
        // System.out.println(MIN_NUM); <- Variable 'MIN_NUM' might not have been initialized

        MIN_NUM = 10;
        System.out.println(MIN_NUM);

        ////////////////////////////////////////////////////////////////////////

        // literal
        // 프로그램에서 사용하는 숫자, 문자, 논리값
        // ex. int num = 10; <- 여기에서 10이 리터럴
        // 정수 리터럴은 int, 실수 리터럴은 double로 저장
        // 리터럴을 상수 풀(constant pool)에 있음 -> 컴파일 타임에 메모리 영역 중 data 영역에 로드되고, 프로그램에 exit될 때 메모리에서 해제됨

        /////////////////////////////////////////////////////////////////////////

        // type conversion
        // 1. 묵시적 형 변환:
        //   - 바이트 크기가 작은 자료형에서 큰 자료평으로 형 변환은 자동으로 됨
        //   - 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 됨
        //     byte -> short / char -> int -> long -> float -> double
        // 2. 명시적 형 변환:
        //   - 자료가 유실되더라도 강제로 형 변환
        //   - ex.
        //      double dNum = 3.14;
        //      int iNum = (int)dNum;

        // 형변환 순서에 따라 연산값이 달라질 수 있음
        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum + (int)fNum;
        int iNum2 = (int)(dNum + fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
