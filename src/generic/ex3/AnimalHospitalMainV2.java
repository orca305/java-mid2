package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    //<T>를 사용해서 제네릭 타입을 선언했다.
    //제네릭 타입을 선언하면 자바 컴파일러 입장에서 T에서 어떤 값이 들어올지 예측할 수 없다. 우리는 Animal 타입의 자식이 들어오기를 기대했지만,
    //여기 코드 어디에도 Animal에 대한 정보는 없다. T에는 타입 인자로 Integer가 들어올 수도 있고, Dog가 들어 올 수도 있다. 물론 Object가 들어올 수도 있다.

    //자바 컴파일러는 어떤 타입이 들어올 지 알 수 없기 때문에 T를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인 Object 타입으로 가정한다. 따라서 object가 제공하는 메소드만 호출할 수 있다.
    //원하는 기능을 사용하려면 Animal 타입이 제공하는 기능들이 필요한데, 이 기능을 모두 사용할 수 없다.

    //여기에 추가로 한가지 문제가 더 있다. 바로 동물 병원에 Integer, Object 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달할 수 있다는 점이다. 우리는 최소한 Animal이나 그 자식을 타입 인자로 제한하고 싶다.

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
    //문제
    // - 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
    // - 따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 Object로 가정하고, Object의 기능만 사용할 수 있다.
}
