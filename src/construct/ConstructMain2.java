package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // new MemberConstruct("user1", 15, 90): 인스턴스를 생성하고 즉시 해당 생성자를 호출한다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
