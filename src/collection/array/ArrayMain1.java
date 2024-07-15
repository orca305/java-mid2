package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: 0(1) - 빅오 표기법
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경: 0(1)
        System.out.println("==index 변경: 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }

    //배열의 특징
    // - 배열에서 자료를 찾을 때 인덱스(index)를 사용하면 매우 빠르게 자료를 찾을 수 있다.
    // - 인덱스를 통한 입력, 변경, 조회의 경우 한번의 계산으로 자료의 위치를 찾을 수 있다.
    // - 배열에서 인덱스를 사용하는 경우 데이터가 아무리 많아도 한 번의 연산으로 필요한 위치를 찾을 수 있다.

    //배열의 검색
    // - 배열에 들어있는 데이터를 찾는 것을 검색이라 한다.
    // - 배열에 들어있는 데이터를 검색할 때는 배열에 들어있는 데이터를 하나하나 비교해야 한다. 이때는 이전과 같이 인덱스를 사용해서 한 번에 찾을 수 없다.
    // - 대신에 배열 안에 들어있는 데이터를 하나하나 확인해야 한다. 따라서 평균적으로 볼 때 배열의 크기가 클 수록 오랜 시간이 걸린다.

    //배열의 순차 검색은 배열에 들어있는 데이터의 크기만큼 연산이 필요하다. 배열의 크기가 n이면 연산도 n만큼 필요하다.

    //빅오 표기법
    // - O(1) 상수 시간: 입력 데이터의 크기에 관계없이 알고리즘의 실행 시간이 일정하다.
    //                  ex) 배열에서 인덱스를 사용하는 경우
    // - O(n) 선형 시간: 알고리즘의 실행 시간이 입력 데이터의 크기에 비례하여 증가한다.
    //                  ex) 배열의 검색, 배열의 모든 요소를 순회하는 경우
    // - O(n*n) 제곱 시간: 알고리즘의 실행 시간이 입력 데이터의 크기와 제곱하여 증가한다.
    //                  ex) 보통 이중 루프를 사용하는 알고리즘에서 나타남
    // - O(log n) 로그 시간: 알고리즘의 실행 시간이 데이터 크기의 로그에 비례하여 증가한다.
    //                  ex) 이진 탐색
    // - O(n log n) 선형 로그 시간:
    //                  ex) 많은 효율적인 정렬 알고리즘들

    //빅오 표기법은 매우 큰 데이터를 입력한다고 가정하고, 데이터 양 증가에 따른 성능의 변화 추세를 비교하는데 사용한다.
    //정확한 성능을 측정하는 것이 목표가 아니라 매우 큰 데이터가 들어왔을 때의 대략적인 추세를 비교하는 것이 목적이다.
    //데이터가 매우 많이 들어오면 추세를 보는데 상수는 크게 의미가 없어진다. 이런 이유로 빅오 표기법에서는 상수를 제거한다.

    //배열에 데이터를 추가할 때 위치에 따른 성능 변화
    //1.배열의 첫번째 위치에 추가
    // - 배열의 첫번째 위치를 찾는데는 인덱스를 사용하므로 O(1)이 걸린다.
    // - 모든 데이터를 배열의 크기만큼 한 칸씩 이동해야 한다. 따라서 O(n)만큼의 연산이 걸린다.
    // - O(1+n) -> O(n)이 된다.
    //2.배열의 중간 위치에 추가
    // - 배열의 첫번째 위치를 찾는데는 O(1)이 걸린다.
    // - index의 오른쪽에 있는 데이터를 모두 한 칸씩 이동해야 한다. 따라서 평균 연산은 O(n/2)이 된다.
    // - O(1+n/2) -> O(n)이 된다.
    //3.배열의 마지막 위치에 추가
    // - 이 경우 배열이 이동하지 않고 배열의 길이를 사용하면 마지막 인덱스에 바로 접근할 수 있으므로 한번의 계산으로 위치를 찾을 수 있고, 기존 배열을 이동하지 않으므로 O(1)이 된다.
}
