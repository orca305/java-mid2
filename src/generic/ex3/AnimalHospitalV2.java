package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        //T의 타입을 메소드를 정의하는 시점에서는 알 수 없다. Object의 기능만 사용가능
        animal.toString();
        animal.equals(null);

        //컴파일 오류
        //System.out.println("동물 이름 = " + animal.getName());
        //System.out.println("동물 크기 = " + animal.getSize());
        //animal.sound();
    }

    public T getBigger(T target) {
        //컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
