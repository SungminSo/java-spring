package ch05;

public class VariableTest {
    public  static void main(String[] args) {
        // 자바는 네이밍 컨벤션이 딱히 정해진게 없음
        // 단지 몇가지 통상적으로 쓰이는게 있을 뿐.
        // 1. 패키지 이름은 소문자로 쓴다.
        // 2. 클래스 이름은 대문자로 시작한다.
        // 3. 변수 이름은 영문자랑 숫자 사용. 특수문자 중에서는 $랑 _만 사용.
        // 4. 단, 변수 이름은 숫자로 시작하면 안됨.
        // 5. 이미 Java에서 예약어로 쓰이는것은 사용하면 안됨.
        // 변수 이름은 가독성이 가장 중요.

        byte bnum = -128;  // (+)128일 경우에는 해당 타입의 숫자 범위가 넘어가서 에러
        System.out.println(bnum);

        // int num = 12345678900;  // Integer number too large
        long lnum = 12345678900L;
        // 만약 long 타입으로 선언했지만 뒤에 'L' 또는 'l'을 쓰지 않는다면 자동으로 int로 형변환 됨.
        // long 타입 뒤에는 가급적이면 대문자로 적는게 가독성이 좋음
        // 만약 long 타입보다 더 큰 범위의 숫자를 써야한다면? -> BigInteger 사용
        // https://coding-factory.tistory.com/604
    }
}
