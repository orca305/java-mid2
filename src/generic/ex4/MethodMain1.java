package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        //Integer result = (Integer) GenericMethod.objMethod(i);

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        //제네릭 메소드 타입 추론, 타입 인자 생략
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
        //제네릭 메소드를 호출할 때 <Integer>와 같이 타입 인자를 계속 전달하는 것은 매우 불편하다.
        //자바 컴파일러는 genericMethod()에 전달되는 인자 i의 타입이 Integer라는 것을 알 수 있다.
        //또한 반환 타입이 Integer result라는 것도 알 수 있다. 이런 정보를 통해 자바 컴파일러라는 타입 인자를 추론할 수 있다.
        //이 경우 타입을 추론해서 컴파일러가 대신 처리하기 때문에 타입을 전달하지 않는 것 처럼 보인다. 하지만 실제로는 타입 인자가 전달된다는 것을 기억하자.
    }

    //제네릭 타입
    // - 정의: GenericClass<T>
    // - 타입 인자 전달: 객체를 생성하는 시점
    // - ex) new GenericClass<String>

    //제네릭 메소드
    // - 정의: <T> T genericMethod(T t)
    // - 타입 인자 전달: 메소드를 호출하는 시점
    // - ex)GenericMethod.<Integer>genericMethod(i)

    //제네릭 메소드는 클래스 전체가 아니라 특정 메소드 단위로 제네릭을 도입할 때 사용한다.
    //제네릭 메소드를 정의할 때는 메소드의 반환 타입 왼쪽에 다이아몬드를 사용해서 <T>와 같이 타입 매개변수를 적어준다.
    //제네릭 메소드는 메소드를 실제 호출하는 시점에 다이아몬드를 사용해서 <Integer>와 같이 타입을 정하고 호출한다.

    //제네릭 메소드의 핵심은 메소드를 호출하는 시점에 타입 인자를 전달해서 타입을 지정하는 것이다. 따라서 타입을 지정하면서 메소드를 호출한다.
}

//제네릭 메소드는 인스턴스 메소드와 static 메소드에 모두 적용할 수 있다.
/*
class Box<T> { //제네릭 타입
    static <V> V staticMethod2(V t) {} //static 메소드에 제네릭 메소드 도입
    <Z> Z instanceMethod2(Z z) {} //인스턴스 메소드에 제네릭 메소드 도입 가능

    T instanceMethod1(T t) {} //가능
    static T staticMethod1(T t) {} //제네릭 타입의 T 사용 불가능

    //제네릭 타입은 static 메소드에 타입 매개변수를 사용할 수 없다. 제네릭 타입은 객체를 생성하는 시점에 타입이 정해진다.
    //그런데 static 메소드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭 타입과는 무관하다.
    //따라서 static 메소드에 제네릭을 도입하려면 제네릭 메소드를 사용해야 한다.
}
*/
