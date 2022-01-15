# POJO JAVA
- Plain Old Java Object

1. 특정 규약에 종속되지 않음
    - 외부에 의존성을 두지 않고, 순수한 JAVA로 구성이 가능해야 한다.
2. 특정 환경에 종속되지 않는다.
    - 특정 비즈니스 로직 처리하는 부분에 외부 종속적인 http request, session 등이 있다면 POJO를 위배한 것
    - @Anotation 기반으로 설정하는것도 POJO를 위반하는 것

## POJO Framework
1. Spring, Hibernate
    - 두 프레임워크는 객체지향적인 설계와 동시에 POJO를 지향하고 있다.
