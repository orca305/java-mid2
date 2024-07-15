package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.getValue());
    }

    //Box<Dog>, Box<Cat>, Box<Object>
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    //와일드카드는 제네릭 타입이나, 제네릭 메소드를 선언하는 것이 아니다. 와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
    //와일드카드인 ?모든 타입을 다 받을 수 있다는 뜻이다.
    //이렇게 ?만 사용해서 제한없이 모든 타입을 다 받을 수 있는 와일드카드를 비제한 와일드카드라 한다.

    //제네릭 메소드와 마찬가지로 와일드카드에도 상한 제한을 둘 수 있다.
    //여기서는 ? extends Animal을 지정했다.
    //Animal과 그 하위 타입만 입력받는다. 만약 다른 타입을 입력하면 컴파일 오류가 발생한다.
    //box.getValue()를 통해서 꺼낼 수 있는 타입의 최대 부모는 Animal이 된다. 따라서 Animal 타입으로 조회할 수 있다.
    //결과적으로 Animal 타입의 기능을 호출할 수 있다.

    //와일드카드는 제네릭을 정의할 때 사용하는 것이 아니다. Box<Dog>, Box<Cat>처럼 타입 인자가 전달된 제네릭 타입을 활용할 때 사용한다.
    //메소드의 타입들을 특정 시점에 변경하려면 제네릭 타입이나, 제네릭 메소드를 사용해야 한다.
    //와일드카드는 이미 만들어진 제네릭 타입을 전달받아서 활용할 때 사용한다. 따라서 메소드의 타입들을 타입 인자를 통해 변경할 수 없다. 쉽게 이야기해서 일반적인 메소드에 사용한다고 생각하면 된다.

    //정리하면 제네릭 타입이나 제네릭 메소드가 꼭 필요한 상황이면 <T>를 사용하고, 그렇지 않은 상황이면 와일드카드를 사용하는 것을 권장한다.
}
