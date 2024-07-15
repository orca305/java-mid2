package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objBox); //허용
        writeBox(animalBox); //허용
        //writeBox(catBox); //하한이 Animal, 불가
        //writeBox(dogBox); //하한이 Animal, 불가

        Animal animal = animalBox.getValue();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box) {
        box.setValue(new Dog("댕댕이", 200));
    }

    //컴파일이 모두 끝내면 자바는 제네릭과 관련된 정보를 삭제한다.
    //상한 제한 없이 선언한 타입 매개변수 T는 Object로 변환된다.

    //자바의 제네릭은 단순하게 생각하면 개발작가 직접 캐스팅하는 코드를 컴파일러가 대신 처리해주는 것이다.
    //자바는 컴파일 시점에 제네릭을 사용한 코드에 문제가 없는지 완벽하게 검증하기 때문에 자바 컴파일러가 추가하는 다운 캐스팅에는 문제가 발생하지 않는다.

    //자바의 제네릭 타입은 컴파일 시점에만 존재하고, 런타임 시에는 제네릭 정보가 지워지는데, 이것을 타입 이레이저라 한다.
    //컴파일 이후에는 제네릭 타입 정보가 존재하지 않는다.
}
