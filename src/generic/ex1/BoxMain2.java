package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); //String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }

    //Integer = Object는 성립하지 않는다. 자식은 부모를 담을 수 없다. 따라서 다음과 같이 (Integer) 타입 캐스팅 코드를 넣어서 Object 타입을 Integer 타입으로 직접 다운 캐스팅해야 한다.
    //set(Object ..) 메소드는 모든 타입의 부모인 Object를 매개변수로 받기 때문에 세상의 어떤 데이터도 입력받을 수 있다. 따라서 이렇게 문자열을 입력해도 자바 언어 입장에서는 아무런 문제가 되지 않는다.
    //잘못된 타입의 값을 전달하면 값을 꺼낼 때 문제가 발생한다.
    //숫자가 들어가 있을 것으로 예상한 박스에는 문자열이 들어가 있었다. 결과적으로 다운 캐스팅시에 String을 Integer로 캐스팅할 수 없다는 예외가 발생하고 프로그램이 종료된다.

    //정리
    //다형성을 활용한 덕분에 코드의 중복을 제거하고, 기존 코드를 재사용할 수 있게 되었다. 하지만 입력할 때 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안정성 문제가 발생한다.
    //예를 들어서 integerBox에는 숫자만 넣어야 하고, stringBox에는 문자열만 입력할 수 있어야 한다. 하지만 박스에 값을 보관하는 set()의 매개변수가 Object이기 때문에 다른 타입의 값을 입력할 수 있다.
    //그리고 반환 시점에도 Object를 반환하기 때문에 원하는 타입을 정확하게 받을 수 없고, 항상 위험한 다운 캐스팅을 시도해야 한다. 결과적으로 이 방식은 타입 안정성이 떨어진다.

    //지금까지 개발한 프로그램은 코드 재사용과 타입 안정성이라는 2마리 토끼를 한번에 잡을 수 없다. 코드 재사용을 늘리기 위해 Object와 다형성을 사용하면 타입 안정성이 떨어지는 문제가 발생한다.
}
