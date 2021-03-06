package ch05;

public class Instance {
    // 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버변수 값을 가지게 됨.
    // -> 서로 다른 메모리상에 위치하게 됨

    // 힙 메모리
    // - 생성된 인스턴스는 동적 메모리(heap memory)에 할당됨
    // - Java에서는 GC가 주기적으로 사용하지 않는 메모리 수거

    // 참조 변수, 참조 값
    // 참조 변수: 메모리에 생성된 인스턴스를 가리키는 변수
    // 참조 값: 생성된 인스턴스의 메모리 주소 값 (JVM이 주는 가상 주소값)
}
