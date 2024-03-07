package static1;

public class Data3 {
    public String name;
    public static int count; // static (static변수, 정적 변수, 클래스 변수)

    // static 변수는 클래스인 붕어빵 틀이 특별히 관리하는 변수
    // 붕어빵 틀은 1개이므로 클래스 변수도 하나만 존재
    // 반면에 인스턴스인 붕어빵은 인스턴스의 수만큼 변수가 존재한다.

    public Data3(String name) {
        this.name = name;
        count++;
        //Data3.count++; - 자기 클래스 안에서 static 변수(정적 변수, 클래스 변수)를 사용할때 클래스명을 따로 쓰지않아도 됨
    }
}
