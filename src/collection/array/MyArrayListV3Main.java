package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 listV3 = new MyArrayListV3();
        //마지막에 추가 //O(1)
        listV3.add("a");
        listV3.add("b");
        listV3.add("c");
        System.out.println("listV3 = " + listV3);

        //원하는 위치에 추가
        System.out.println("addLast");
        listV3.add(3, "addLast"); //O(1)
        System.out.println("listV3 = " + listV3);

        System.out.println("addFirst");
        listV3.add(0, "addFirst"); //O(n)
        System.out.println("listV3 = " + listV3);

        //삭제
        Object remove1 = listV3.remove(4); //remove Last O(1)
        System.out.println("remove(4) = " + remove1);
        System.out.println(listV3);

        Object remove2 = listV3.remove(0);//remove First O(n)
        System.out.println("remove(0) = " + remove2);
        System.out.println(listV3);
    }
    //지금까지 우리가 만든 자료구조를 배열 리스트(ArrayList)라 한다. 리스트(List) 자료 구조를 사용하는데, 내부의 데이터는 배열(Array)에 보관하는 것이다.

    //배열 리스트의 빅 오
    //1.데이터 추가
    // - 마지막에 추가: O(1)
    // - 앞, 중간에 추가: O(n)
    //2.데이터 삭제
    // - 마지막에 삭제: O(1)
    // - 앞, 중간에 삭제: O(1)
    //3.인덱스 조회: O(1)
    //4.데이터 검색: O(n)

    //배열 리스트는 마지막에 데이터를 추가하거나 마지막에 있는 데이터를 삭제할 때는 O(1)로 매우 빠르지만, 중간에 데이터를 추가하거나 삭제하는 경우에는 O(n)으로 느리다.
    //배열 리스트는 보통 데이터를 중간에 추가하고 삭제하는 변경 보다는, 데이터를 순서대로 입력하고(데이터를 마지막에 추가하고), 순서대로 출력하는 경우에 가장 효율적이다.
}
