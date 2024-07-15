package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2(){ //기본생성자를 쓰면 5
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) { //원하는 크기 설정 가능
        elementData = new Object[initialCapacity];
    }

    public int getSize() {
        return size;
    }

    public void add(Object e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }
    //add()를 사용해서 데이터를 추가하는 경우 리스트의 마지막(size)에 데이터를 추가한다.
    //데이터를 리스트의 마지막에 추가하기 때문에 기존 데이터를 이동하지 않는다.
    //size를 배열의 index로 사용하고 기존 데이터를 이동하지 않기 때문에 O(1)로 표현할 수 있다.

    //코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        /*
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        */
        elementData = Arrays.copyOf(elementData, newCapacity); //새로운 배열을 참조하도록 바꿈
        //기존 배열은 더는 참조하는 곳이 없으므로 GC의 대상이 된다.
    }
    //추가된 부분은 grow() 메소드와 이 메소드를 호출하는 add() 메소드이다.
    //add() 메소드에서 데이터를 추가할 때 size가 배열의 크기에 도달했다면 더는 데이터를 추가할 수 없다.
    //따라서 이때는 grow()를 호출해서 기존 배열을 복사한 새로운 배열을 만들고 배열의 크기도 2배로 늘려준다.
    //Arrays.copyOf(기존배열, 새로운길이): 새로운 길이로 배열을 생성하고, 기존 배열의 값을 새로운 배열에 복사한다.
    //예제를 단순화 하기 위해 2배씩 증가했지만, 보통은 50% 정도 증가하는 방법을 사용한다.

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        //[1, 2, 3, null, null] //size = 3
        //[1, 2, 3] //size = 3
        //Arrays.copyOf(elementData, size) 배열의 크기만큼 카피
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }
}
