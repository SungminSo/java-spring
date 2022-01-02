package ch21;

public class ForTest {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        for(int i = 0; i < 10; i++, count++) {
            sum += count;
        }

        System.out.println(sum);

        int num;
        sum = 0;
        for(num=1; ; num++) {
            sum += num;
            if (sum >= 100)
                break;
        }
        System.out.println(num);
        // for 조건문에 'sum >= 100'이 들어갈 경우, num의 값은 15 -> 증감문을 한번 타고 조건문을 체크하기 때문
        // for 내용에 'if (sum >= 100)'이 들어갈 경우, num의 값은 14
    }
}
