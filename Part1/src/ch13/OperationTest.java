package ch13;

import java.util.Scanner;

public class OperationTest {
    public static void main(String[] args) {
        // 삼항 연산자
        int max;
        System.out.println("두 수를 입력받아서 더 큰 수를 출력\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 1:");
        int num1 = scanner.nextInt();
        System.out.println("입력 2:");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);

        // 비트 연산자
        num1 = 5;  // 00000101
        num2 = 10; // 00001010

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);  // *2 한것과 같음. 하지만 실제 num1의 값은 변경되지 않는 임시값
        System.out.println(num1);
        System.out.println(num1 <<= 2); // *2 하고 대입한것과 같음.
        System.out.println(num1);
    }
}
