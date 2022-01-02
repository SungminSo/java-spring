package ch09;

public class LocalVariable {
    public static void main(String[] args) {
        // 자바에서는 var 타입으로 선언 가능(Java 10 버전 이상부터 가능)
        // 실제 컴파일러가 판단하는 타입은 대입된 데이터의 타입을 따라감
        var i = 10;
        var j = 10.0;
        var str = "hello";  // <- 문자열이랑 ""로 묶어준것

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        // str = 3;  <- string을 넣었다가 int를 넣을 경우 에러 발생
    }
}
