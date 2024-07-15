package java_medium1.enumeration.ex2;

// 회원 등급을 다루는 클래스
// ※ 타입 안전 열거형 패턴
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003

    // private 생성자 추가
    private ClassGrade() {}
}
