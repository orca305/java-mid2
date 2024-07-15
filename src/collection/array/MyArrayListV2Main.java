package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 listV2 = new MyArrayListV2(2);
        System.out.println("==데이터 추가==");
        System.out.println(listV2);
        listV2.add("a");
        System.out.println(listV2);
        listV2.add("b");
        System.out.println(listV2);
        listV2.add("c");
        System.out.println(listV2);

        System.out.println("==기능 사용==");
        System.out.println("listV2.getSize() = " + listV2.getSize());
        System.out.println("listV2.getElementData(1) = " + listV2.get(1));
        System.out.println("listV2.indexOf('c') = " + listV2.indexOf("c"));
        System.out.println("listV2.setElementData(2, 'z') = " + listV2.set(2, "z"));
        System.out.println(listV2);

        listV2.add("d");
        System.out.println(listV2);
        listV2.add("e");
        System.out.println(listV2);

        listV2.add("f");
        System.out.println(listV2);
    }
}
