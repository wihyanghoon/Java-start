package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2 * 3 2차원 배열을 만든다.
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        for(int row = 0; row < arr.length; row++){
            for (int colum = 0; colum < arr[row].length; colum++){
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println();
        }
    }
}
