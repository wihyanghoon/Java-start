package scanner.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요.: ");
        int num = input.nextInt();

        for (int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

}
