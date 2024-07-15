package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 크기 = " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

    //여기서 핵심은 <T extends Animal>이다.
    //타입 매개변수 T를 Animal과 그 자식만 받을 수 있도록 제한을 두는 것이다. 즉 T의 상한이 Animal이 되는 것이다.
    //이렇게 하면 타입 인자로 들어올 수 있는 값이 Animal과 그 자식으로 제한된다.

    //이제 자바 컴파일러는 T에 입력될 수 있는 값의 범위를 예측할 수 있다.
    //타입 매개변수 T에는 타입 인자로 Animal, Dog, Cat만 들어올 수 있다. 따라서 이를 모두 수용할 수 있는 Animal을 T의 타입으로 가정해도 문제가 없다.
    //따라서 Animal이 제공하는 getName(), getSize() 같은 기능을 사용할 수 있다.
}
