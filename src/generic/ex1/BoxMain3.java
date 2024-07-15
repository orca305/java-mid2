package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정, 타입 직접 입력
        integerBox.set(10);
        //integerBox.set("문자100"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); //Integer 타입 반환(캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>(); //타입 직접 입력
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>(); //타입 추론
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
        //참고로 타입 추론이 그냥 되는 것은 아니고, 자바 컴파일러가 타입을 추론할 수 있는 상황에만 가능하다. 쉽게 이야기해서 읽을 수 있는 타입 정보가 주변에 있어야 추론할 수 있다.
    }
    //제네릭 클래스는 생성하는 시점에 <> 사이에 원하는 타입을 지정한다.
    //기본형은 안됨, 객체 참조형만 가능(래퍼 클래스 사용)
    //제네릭을 사용한 덕분에 코드 재사용과 타입 안정성이라는 두마리 토끼를 모두 잡을 수 있었다.

    //메소드는 매개변수에 인자를 전달해서 사용할 값을 결정한다.
    //제네릭 클래스는 타입 매개변수에 타입 인자를 전달해서 사용할 타입을 결정한다.

    //제네릭에서 사용하는 용어도 매개변수, 인자의 용어를 그대로 가져다 사용한다. 다만 값이 아니라 타입을 결정하는 것이기 때문에 앞에 타입을 붙인다.
    //타입 매개변수: GenericBox<T>에서 T
    //타입 인자:
    // - GenericBox<Integer>에서 Integer
    // - GenericBox<String>에서 String
    //제네릭 타입의 타입 매개변수 <T>에 타입 인자를 전달해서 제네릭의 사용 타입을 결정한다.

    //제네릭(Generic)
    // - 제네릭이라는 단어는 일반적인, 범용적인이라는 영어 단어 뜻이다.
    // - 풀어보면 특정 타입에 속한 것이 아니라 일반적으로, 범용적으로 사용할 수 있다는 뜻이다.

    //제네릭 타입(Generic Type)
    // - 클래스나 인터페이스를 정의할 때 타입 매개변수를 사용하는 것을 말한다.
    // - 제네릭 클래스, 제네릭 인터페이스를 모두 합쳐서 제네릭 타입이라 한다.

    //제네릭 명명 관례
    // - E : Element
    // - K : Key
    // - N : Number
    // - T : Type
    // - V : Value
    // - S,U,V etc. : 2nd, 3rd, 4th types
}
