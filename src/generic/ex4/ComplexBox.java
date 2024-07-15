package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        //t.getName();
        return t;
    }
    //제네릭 타입보다 제네릭 메소드가 높은 우선순위를 가진다.
    //따라서 printAndReturn()은 제네릭 타입과는 무관하고 제네릭 메소드가 적용된다.

    //여기서 적용된 제네릭 메소드의 타입 매개변수 T는 상한이 없다. 따라서 Object로 취급된다.
    //Object로 취급되기 때문에 t.getName()과 같은 Animal에 존재하는 메소드는 호출할 수 없다.

    //참고로 프로그래밍에서 모호한 것은 좋지 않다.
    //둘의 이름이 겹치면 다음과 같이 둘 중 하나를 다른 이름으로 변경하는 것이 좋다.
}
