package loop.ex;

public class Ex3 {
    public static void main(String[] args) {
        int rows = 2;

        // 행의 반복
        for (int i = 1; i <= rows; i ++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
