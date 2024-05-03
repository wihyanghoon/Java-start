package scanner.ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.print("첫번째 정수를 입력 하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수를 입력 하세요 : ");
        int num2 = scanner.nextInt();

        if(num2 < num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        // while
//        while (true) {
//            num1++;
//            if(num1 == num2) break;
//            System.out.print(num1 + ",");
//        }

        //for
        for(int i = num1; i <= num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(",");
            }
        }
    }
}
