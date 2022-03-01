# strategy pattern
- 객체지향의 꽃이라 불리는 전략패턴
- 유사한 행위들을 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아니라 전략만 변경하여 유연하게 호ㅓㅏㄱ장
- SOLID 중에서 개방폐쇄 원칙(OCP)과 의존역전 원칙(DIP)를 따름
- 전략 메서드를 가진 전략 객체, 해당 객체들을 사용하는 컨텍스트, 전략 객체를 생성해 컨텍스트에 주입하는 클라이언트 이렇게 3가지가 반드시 필요함