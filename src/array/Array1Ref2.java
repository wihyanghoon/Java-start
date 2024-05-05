package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        // 배열 변수선언
        int[] students = new int[]{90,80,70,60,50};

        // 배열 출력
        for (int i = 0; i < students.length; i++){
            System.out.println("학생 " + (i+1) + " 점수 : " + students[i]);
        }
    }
}
