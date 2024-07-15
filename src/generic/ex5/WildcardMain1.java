package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("댕댕이", 100));

        WildcardEx.<Dog>printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);
        //제네릭 메소드 vs 와일드카드
        //제네릭 메소드에는 타입 매개변수가 존재한다. 그리고 특정 시점에 타입 매개변수에 타입 인자를 전달해서 타입을 결정해야 한다. 이런 과정은 매우 복잡하다.
        //반면, 와일드 카드는 일반적인 메소드에 사용할 수 있고, 단순히 매개변수로 제네릭 타입을 받을 수 있는 것 뿐이다.
        //제네릭 메소드처럼 타입을 결정하거나 복잡하게 작동하지 않는다. 단순히 일반 메소드에 제네릭 타입을 받을 수 있는 매개변수가 하나 있는 것 뿐이다.
        //제네릭 타입이나 제네릭 메소드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드카드를 사용을 권장한다.

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        catBox.setValue(new Cat("냐옹이", 200));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}
