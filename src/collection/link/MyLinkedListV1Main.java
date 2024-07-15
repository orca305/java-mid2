package collection.link;

public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 listV1 = new MyLinkedListV1();
        System.out.println("==데이터 추가==");
        System.out.println(listV1);
        listV1.add("a");
        System.out.println(listV1);
        listV1.add("b");
        System.out.println(listV1);
        listV1.add("c");
        System.out.println(listV1);

        System.out.println("==기능 사용==");
        System.out.println("listV1.size() = " + listV1.size());
        System.out.println("listV1.get(1) = " + listV1.get(1));
        System.out.println("listV1.indexOf('c') = " + listV1.indexOf("c"));
        System.out.println("listV1.set(2, 'z') = " + listV1.set(2, "z"));
        System.out.println(listV1);

        System.out.println("==범위 초과==");
        listV1.add("d");
        System.out.println(listV1);
        listV1.add("e");
        System.out.println(listV1);

        //범위 초과, capacity가 늘어나지 않으면 예외 발생
        listV1.add("f");
        System.out.println(listV1);
    }
}
