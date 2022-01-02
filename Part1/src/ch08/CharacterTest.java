package ch08;

public class CharacterTest {
    public static void main(String[] args) {
        // 자바에서는 기본적으로 UNICODE 사용
        // utf-8과 utf-16의 차이: utf-16은 모든 문자열을 2바이트로 표시, utf-8은 1~4바이트 유동적으로 사용
        // utf-8이 조금 더 유동성있고 자주 쓰임

        // single-quote -> char(2바이트 문자)
        // double-quote -> string(문자열)

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);    // 타입이 char이기 때문에 char로 인식됨
        System.out.println((char)ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        // char ch = -66; -> 음수는 사용 불가능
        char han = '한';
        char ch = '\uD55C';    // UNICODE
        System.out.println(han);
        System.out.println(ch);
    }
}
