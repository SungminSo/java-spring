# singleton pattern
- 어떤 클래스가 유일하게 1개만 존재해야 할때 사용.
- 실제 프로그래밍 에서는 TCP Socket 통신에서 서버와 연결된 connection 객체에 주로 사용

## 패턴 사용방법
1. class default 생성자를 private로 정의 
2. get 메소드를 통해서 생성되어 있는 인스턴스를 받게끔 구현(객체가 없는 경우는 생성해서 반환)
