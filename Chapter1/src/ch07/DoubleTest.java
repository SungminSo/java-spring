package ch07;

public class DoubleTest {
    public static void main(String[] args) {
        double dnum = 3.14;
        float fnum = 3.14f;  // 실수는 기본적으로 double로 저장되기 때문에 float으로 지정하려면 f 식별자 필요

        System.out.println(dnum);
        System.out.println(fnum);

        // 부동소수점의 오류
        dnum = 1;

        for (int i = 0; i < 10000; i++) {
            dnum = dnum + 0.1;
        }
        System.out.println(dnum);   // result: 1001.000000000159
        // 지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있음
    }
}
