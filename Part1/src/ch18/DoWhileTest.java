package ch18;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;  // += 연산을 위해서 초기화 반드시 필요

        input = scanner.nextInt();

        while(input != 0) {
            sum += input;
            input = scanner.nextInt();
        }
        System.out.println(sum);

        // do-while로 한다면?
        sum = 0;
        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);
        System.out.println(sum);
    }
}
