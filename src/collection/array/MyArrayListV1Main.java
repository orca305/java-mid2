package collection.array;

public class MyArrayListV1Main {

    public static void main(String[] args) {
        MyArrayListV1 listV1 = new MyArrayListV1();
        System.out.println("==데이터 추가==");
        System.out.println(listV1);
        listV1.add("a");
        System.out.println(listV1);
        listV1.add("b");
        System.out.println(listV1);
        listV1.add("c");
        System.out.println(listV1);

        System.out.println("==기능 사용==");
        System.out.println("listV1.getSize() = " + listV1.getSize());
        System.out.println("listV1.getElementData(1) = " + listV1.getElementData(1));
        System.out.println("listV1.indexOf('c') = " + listV1.indexOf("c"));
        System.out.println("listV1.setElementData(2, 'z') = " + listV1.setElementData(2, "z"));
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
