package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }

    //제네릭 타입을 사용할 때는 항상 <>를 사용해서 사용시점에 원하는 타입을 지정해야 한다.
    //그런데 다음과 같이 <>을 지정하지 않을 수 있는데, 이런 것을 로 타입(raw type), 또는 원시 타입이라 한다.
    //원시 타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다고 이해하면 된다.

    //정리하자면 로 타입을 사용하지 않아야 한다.
    //만약에 Object 타입을 사용해야 한다면 다음과 같이 타입 인자로 Object를 지정해서 사용하면 된다.
    //GenericBox<Object> integerBox = new GenericBox<>();

}
