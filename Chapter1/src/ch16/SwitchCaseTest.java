package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        // switch-case
        // if-else if-else보다 가독성 좋게 구현 가능
        // 단, 비교 조건이 특정 값 또는 문자열일때만 사용 가능
        // Java14부터 좀 더 간결한 표현식 지원됨 (break 사용안함)

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        // Java14 이전의 switch문
        int day;
        switch(month) {
            // case 문에서는 중괄호({})를 쓰지 않음
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;  // 이걸 안쓸경우 아래 case도 체크하게 됨.
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");
                day = -1;
        }

        System.out.println(month + "월은 " + day + "일 입니다.");

        // Java14 이후의 switch문
        int day_ = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한 달은 31일입니다.");
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 -> {
                System.out.println("한 달은 28일입니다.");
                yield 28;
            }
            default -> {
                System.out.println("존재하지 않는 달 입니다.");
                yield 0;
            }
        };

        System.out.println(month + "월은 " + day_ + "일입니다.");
    }
}
