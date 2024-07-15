package java_medium2.generic.ex5;

import java_medium2.generic.animal.Animal;
import java_medium2.generic.animal.Cat;
import java_medium2.generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcarV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printGenericV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}
