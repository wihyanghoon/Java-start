package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        // 배열 변수선언
        int[] students;
        students = new int[5];

        // 변수 값 할당
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 배열 출력
        for (int i = 0; i < students.length; i++){
            System.out.println("학생 " + (i+1) + " 점수 : " + students[i]);
        }
    }
}
