package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringMyLinkedListV3 = new MyLinkedListV3<>();
        stringMyLinkedListV3.add("a");
        stringMyLinkedListV3.add("b");
        stringMyLinkedListV3.add("c");
        //stringMyLinkedListV3.add(1); //반환 타입이 String으로 결정 되었기 때문에 숫자는 입력 불가
        String str = stringMyLinkedListV3.get(0);
        System.out.println("str = " + str);

        MyLinkedListV3<Integer> integerMyLinkedListV3 = new MyLinkedListV3<>();
        integerMyLinkedListV3.add(1);
        integerMyLinkedListV3.add(2);
        integerMyLinkedListV3.add(3);
        Integer integer = integerMyLinkedListV3.get(2);
        System.out.println("integer = " + integer);
    }
}
