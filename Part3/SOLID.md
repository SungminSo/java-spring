# SOLID - 객체지향 설계 5원칙

## SRP(Single Responsibility Principle) : 단일 책임 원칙
- 어떤 클래스를 변경해야 하는 이유는 한가지 뿐 이여야 한다.
- ex: FTP Client를 사용하고 있을때, 그 안에는 Network Connection, File Reader, File Writer 기능이 있음. 각 기능별로 클래스를 구분할 경우 해당 기능에만 집중할 수 있게 됨(해당 부분에 변경사항이 있을 경우 해당 부분만 수정하면 됨)
     
### 응집도와 결합도
- 결합도(coupling)는 낮추고 응집도(cohesion)는 높여야 함
- 결합도: 모듈간의 상호 의존 정도를 나타내는 지표
- 응집도: 하나의 모듈 내부에 존재하는 구성 요소들의 기능적 관련성
- ex: A, B, C 클래스가 각각 있을, A가 B에 의존하고 있고, B가 C에 의존하고 있다면 서로 의존하고 있기 때문에 결합도가 높음. 여기서 C에 변경이 있을 때, B, A도 수정해야함.
    
## OCP(Open Closed Principle) : 개발 폐쇄 원칙 
- 자신의 확장에는 열려있고, 주변의 변화에 대해서는 닫혀 있어야 한다.
- 상위 클래스 또는 인터페이스를 중간에 둠으로써, 자신은 변화에 대해서는 폐쇄적이지만, 인터페이스는 외부의 변화에 대해서 확장을 개방해 줄 수 있다.
- ex: JDBC와 Mybatic, HIbernate 등 JAVA에서의 Stream(Input, Out)에서 찾아볼 수 있음
  - 구체적인 예: JDBC 인터페이스를 application과 각 DB driver 사이에 둠으로 N개의 DB에 대해서 내부적으로는 하나의 통로만 두고 외부적으로는 N개의 방법을 구축한것
   
## LSP(Liskov Subsitution Principle) : 리스코프 치환 원칙
- 서브 타입은 언제나 자신의 기반 타입으로 교체 할 수 있어야 한다.

## ISP(Interface Segregation Principle) : 인터페이스 분리 원칙
- 클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안된다.
- 프로젝트 요구사항과 설계에 따라서 SRP로 갈것인지, ISP로 갈것인지는 선택한다.
- ex: 같은 지도를 사용하지만 자전거 길 안내와 자동차 길 안내는 다르므로 굳이 다른 부분까지 상속받아와 사용할 필요는 없다. 따라서 각각의 인터페이스를 별도로 생성해 해당 부분만 상속받도록 함.
    
## DIP(Dependency Inversino Principle) : 의존 역전 원칙
- 자신보다 변하기 쉬운것에 의존하지 말아야 한다. 
