package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringListV4 = new MyArrayListV4<>();
        stringListV4.add("a");
        stringListV4.add("b");
        stringListV4.add("c");
        String str = stringListV4.get(0);
        System.out.println("str = " + str);

        MyArrayListV4<Integer> intListV4 = new MyArrayListV4<>();
        intListV4.add(1);
        intListV4.add(2);
        intListV4.add(3);
        Integer integer = intListV4.get(0);
        System.out.println("integer = " + integer);
    }
    //이제 stringListV4에는 String 문자열만 보관하고 조회하고, intListV4에는 Integer 숫자만 보관하고 조회할 수 있다.
    //다른 타입의 값을 저장하면 컴파일 오류가 발생한다. 추가로 값을 조회할 때도 위험한 다운 캐스팅 없이 지정한 타입으로 안전하게 조회할 수 있다.
    //제네릭을 사용한 덕분에 타입 인자로 지정한 타입으로만 안전하게 데이터를 저장하고, 조회할 수 있게 되었다.
    //제네릭의 도움으로 타입 안정성이 높은 자료 구조를 만들 수 있었다.

    //MyArrayList의 단점
    //배열을 사용한 리스트인 MyArrayList는 다음과 같은 단점이 있다.
    //정확한 크기를 미리 알지 못하면 메모리가 낭비된다. 배열을 사용하므로 배열 뒷 부분에 사용되지 않고, 낭비되는 메모리가 있다.
    //데이터를 중간에 추가하거나 삭제할 때 비효율적이다.
    // - 이 경우 데이터를 한 칸씩 밀어야 한다. 이것은 O(n)으로 성능이 좋지 않다.
    // - 만약 데이터의 크기가 1,000,000건이라면 최악의 경우 데이터를 추가할 때 마다 1,000,000건의 데이터를 밀어야 한다.
}
