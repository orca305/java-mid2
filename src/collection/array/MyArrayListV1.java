package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1(){ //기본생성자를 쓰면 5
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) { //원하는 크기 설정 가능
        elementData = new Object[initialCapacity];
    }

    public int getSize() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object getElementData(int index) {
        return elementData[index];
    }

    public Object setElementData(int index, Object element) {
        Object oldValue = getElementData(index);
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
