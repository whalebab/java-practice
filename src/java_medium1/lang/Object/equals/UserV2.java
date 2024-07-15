package java_medium1.lang.Object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }
/*

    @Override
    public boolean equals(Object obj) {
        // DownCasting을 하지않으면 obj.id가 없기 때문에 에러발생
        // 객체의 특정 값을 사용하려면 다운캐스팅이 필요함
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
