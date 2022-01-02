package ch20;

public class Array {
    public static void main(String[] args) {
        // array
        // 동일한 자료형의 순차적 자료 구조
        // insert/delete의 시간복잡도 O(n)
        // 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
        // 객체 배열과 기본형 배열은 조금의 차이가 있음

        // 배열 선언
        int[] arr1 = new int[10];
        int arr2[] = new int[10];

        // 배열 초기화
        int[] numbers = new int[]{10, 20, 30};
        int[] numbers2 = {10, 20, 30};  // new int[] 생략 가능

        int[] ids;
        ids = new int[]{10, 20, 30};  // 선언 후 배열을 생성하는 경우 new int[] 생략 불가능

        // 배열 사용하기
        int[] arr = new int[10];  // int는 0으로 initialize
        int total = 0;

        for(int i=0, num=1; i<arr.length; i++) {
            arr[i] = num++;
        }

        // enhanced for -> arr의 처음부터 끝까지 iteration 돈다. 파이썬의 for문과 같음
        for( int num : arr) {
            total += num;
        }

        System.out.println(total);

        // 배열의 길이와 요소의 갯수는 동일하지 않을 수 있다.
        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for(int i=0; i<count; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal);
    }
}
