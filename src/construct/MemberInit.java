package construct;

public class MemberInit {
    /*
    인스턴스 : name, age, grade
    */
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        // this : 자기 자신의 인스턴스를 가르킴(인스턴스 참조)
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
