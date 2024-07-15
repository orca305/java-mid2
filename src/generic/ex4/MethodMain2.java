package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("댕댕이", 200);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.checkup(dog); //<Dog>생략
        AnimalMethod.checkup(cat); //<Cat>생략

        Dog dog1 = new Dog("빅댕댕이", 300);

        Dog biggerDog = AnimalMethod.getBigger(dog, dog1); //<Dog>생략
        System.out.println("biggerDog = " + biggerDog);
    }
}
