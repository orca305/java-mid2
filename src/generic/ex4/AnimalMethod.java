package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {
    
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름 = " + t.getName());
        System.out.println("동물 크기 = " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T getBigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }

    //checkup(), getBigger()라는 두 개의 제네릭 메소드를 정의했다. 둘 다 Animal을 상한으로 제한한다.
}
