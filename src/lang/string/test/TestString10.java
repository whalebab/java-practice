package lang.string.test;

/*
* 문제 설명**
`split()` 를 사용해서 `fruits` 를 분리하고, `join()` 을 사용해서 분리한 문자들을 하나로 합쳐라.
실행 결과를 참고해라.
* */
public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }
        String joinedString = String.join("->", splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}
