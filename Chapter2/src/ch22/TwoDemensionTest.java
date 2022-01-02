package ch22;

public class TwoDemensionTest {
     public static void main(String[] args) {
         int[][] arr = {{1, 2, 3}, {1, 2, 3, 4}};  // 바로 초기화하는 경우

         int i, j;
         for(i=0; i<arr.length; i++) {
             for(j=0; j<arr[i].length; j++) {
                 System.out.print(arr[i][j] + ",");
             }
             System.out.println("\t" + arr[i].length);
         }

         int[][] arrLater = new int[3][4];  // 우선 선언하고 나중에 값을 채워서 사용할 경우
     }
}
