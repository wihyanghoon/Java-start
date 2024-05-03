package scanner.ex;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true){
            number = input.nextInt();

            if(number == -1) break;

            sum += number;
            count++;
        }

        System.out.println("입력하신 숫자의 총합은 : " + sum);
        System.out.println("입력하신 숫자의 평균은 : " + sum/count);
    }
}
