package array.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요 : ");
        int studentCount = scanner.nextInt();

        int[][] score = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) +"번 학생의 성적을 입력하세요");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + "점수 :");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < score.length; i++) {
            int total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += score[i][j];
            }
            double avg = total / subjects.length;
            System.out.println((i + 1) +"번 학생의 총점은 : " + total);
            System.out.println((i + 1) +"번 학생의 평균은 : " + avg);
        }
    }
}
