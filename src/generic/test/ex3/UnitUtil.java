package generic.test.ex3;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T m1, T m2) {
        if (m1.getHp() > m2.getHp()) {
            return m1;
        } else {
            return m2;
        }
    }
}
