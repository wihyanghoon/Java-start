package array.ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 갯수는 ?");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double avg = 0;

        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        avg = (double) sum /  count;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
