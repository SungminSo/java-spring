package ch12;

public class Person {

    String name;
    int age;

    public Person() {
        // 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 할 수 없음.
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        System.out.println(person);  // 클래스 full name@JVM이 할당해준 address
        Person person1 = person.getPerson();
        System.out.println(person1);  // 위와 같은 값이 출력됨
    }
}
