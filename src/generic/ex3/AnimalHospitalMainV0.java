package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("댕댕이1", 100);
        Cat cat = new Cat("야옹이1", 200);

        //개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이 전달
        //dogHospital.setAnimal(cat); //다른 타입 입력: 컴파일 오류

        //문제2: 개 타입 반환
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("댕댕이2", 150));
        System.out.println("biggerDog = " + biggerDog);
    }

    //문제
    // 코드 재사용X : 개 병원과 고양이 병원은 중복이 많이 보인다.
    // 타입 안정성O : 타입 안전성이 명확하게 지켜진다.
}
