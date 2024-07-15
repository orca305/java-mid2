package generic.ex1;

public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    //<>를 사용한 클래스를 제네릭 클래스라 한다. 이 기호(<>)를 보통 다이아몬드라 한다.
    //제네릭 킄래스를 사용할 때는 Integer, String 같은 타입을 미리 결정하지 않는다.
    //대신에 클래스명 오른쪽에 <T>와 같이 선언하면 제네릭 클래스가 된다. 여기서 T를 타입 매개변수라 한다.
    //이 타입 매개변수는 이후에 Integer, String으로 변할 수 있다.
    //그리고 클래스 내부에 T 타입이 필요한 곳에 T value와 같이 타입 매개변수를 적어두면 된다.
}
