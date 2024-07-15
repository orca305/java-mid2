package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    //MyArrayListV4<E>로 제네릭 타입을 선언한다. E는 Element로 요소의 줄임말이다.
    //Object로 입력받고 출력했던 곳을 타입 매개변수 E로 변경한다.

    private static final int DEFAULT_CAPACITY = 5;

    //Object[] elementData는 그대로 유지한다.
    private Object[] elementData;
    //제네릭은 런타임에 이레이저에 의해 타입 정보가 사라진다. 따라서 런타임에 타입 정보가 필요한 생성자에 사용할 수 없다.
    //따라서 제네릭을 기반으로 배열을 생성하는 다음 코드는 작동하지 않고, 컴파일 오류가 발생한다. 참고로 이것은 자바가 제공하는 제네릭의 한계이다.
    private int size = 0;

    public MyArrayListV4(){ //기본생성자를 쓰면 5
        elementData = new Object[DEFAULT_CAPACITY];
    } //생성자에는 이레이저 때문에 E 못씀

    public MyArrayListV4(int initialCapacity) { //원하는 크기 설정 가능
        elementData = new Object[initialCapacity];
    } //생성자에는 이레이저 때문에 E 못씀

    public int getSize() {
        return size;
    }

    public void add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }

    //elementData[]에 데이터를 보관하는 add(E e) 메소드를 보자. E 타입으로 데이터를 입력한다.
    //elementData[]에 데이터를 조회하는 get() 메소드를 보자. 보관할 때와 같은 E 타입으로 데이터를 다운 캐스팅해서 반환한다.
    //따라서 배열의 모든 데이터는 E 타입으로 보관된다.
    //그리고 get()으로 배열에서 데이터를 꺼낼 때 (E)로 다운 캐스팅해도 보관한 E 타입으로 다운 캐스팅하기 때문에 아무런 문제가 되지 않는다.

    //더 구체적으로 예를 들어보자면
    //MyArrayListV4를 생성할 때 타입 매개변수 E를 String으로 지정했다면 elementData에는 항상 String이 저장된다.
    // - add(String e)에서 배열의 모든 데이터는 String 타입으로 보관된다.
    // - get()에서 데이터를 꺼낼 때 항상 (String)으로 다운캐스팅한다. 저장한 String 타입으로 다운캐스팅하기 때문에 아무런 문제가 되지 않는다.

    //Object는 모든 데이터를 담을 수 있기 때문에 데이터를 담는데는 아무런 문제가 없다.
    //다만 데이터를 조회할 때 문제가 될 수 있는데, 이때는 조회한 Object 타입을 지정한 타입 매개변수로 다운캐스팅해준다.

    //정리하면 생성자에는 제네릭의 타입 매개변수를 사용할 수 없는 한계가 있다. 따라서 배열을 생성할 때 대안으로 Object 배열을 사용해야 한다.
    //하지만 제네릭이 리스트의 데이터를 입력 받고 반환하는 곳의 타입을 고정해준다.
    //따라서 고정된 타입으로 Object 배열에 데이터를 보관하고, 또 데이터를 꺼낼 때도 같은 고정된 타입으로 안전하게 다운캐스팅할 수 있다.
}
