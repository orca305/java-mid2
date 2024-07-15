package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("obj = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("generic = " + obj);
        return obj;
    }

    //제네릭 메소드도 제네릭 타입과 마찬가지로 타입 매개변수를 제한할 수 있다.
    public static <T extends Number> T numberMethod(T obj) {
        System.out.println("bound = " + obj);
        return obj;
    }
}
