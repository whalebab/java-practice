package java_basic.construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // 생성자 추가
    MemberConstruct(String name, int age) {
        // this()는 생성자 코드의 첫줄에만 작성할 수 있다.
        this(name, age, 50); // 변경
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
