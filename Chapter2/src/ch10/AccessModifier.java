package ch10;

public class AccessModifier {
    // 접근 제어 지시자(access modifier)
    // - private:
    //  - 같은 클래스 내부에서만 접근 가능.
    //  - 외부 클래스, 상속 관계의 클래스에서도 접근 불가
    // - 아무것도 없음(default):
    //  - 같은 패키지 내부에서만 접근 가능
    //  - 상속관계라도 패키지가 다르면 접근 불가
    //  - import를 해서 다른 패키지에서 사용 가능
    // - protected:
    //  - 같은 패키지나 상속 관계의 클래스에서는 접근 가능. 그 외에는 접근 불가
    // - public:
    //  - 클래스의 외부 어디서나 접근 가능
}
