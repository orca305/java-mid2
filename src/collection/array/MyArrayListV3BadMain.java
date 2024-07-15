package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        //숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3"); //문자열을 입력
        System.out.println("numberList = " + numberList);

        //Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        //ClassCastException 발생, 문자를 Integer로 캐스팅
        //Integer num3 = (Integer) numberList.get(2);
        String str1 = (String) numberList.get(2);
    }
    //numberList에는 숫자만 입력하기를 기대했지만, Object를 받아서 저장하기 때문에 자바의 모든 타입을 다 저장할 수 있다. 따라서 숫자를 입력하다가 실수로 문자를 입력해도 아무런 문제가 되지 않는다.
    //값을 꺼낼 때 Object를 반환하기 때문에, 원래 입력한 타입으로 받으려면 다운 캐스팅을 해야한다.
    //이때 입력한 데이터 타입을 정확하게 알고 있지 않으면 예외가 발생한다.
}
