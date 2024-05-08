package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==================================");
            System.out.println("1. 입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("==================================");
            System.out.print("선택 ");
            int input = scanner.nextInt();

            if(input == 4) break;

            if(input == 1){
                System.out.print("입금액을 입력하세요: ");
                int number = scanner.nextInt();
                balance = deposit(balance, number);
            } else if (input == 2) {
                System.out.print("출금액을 입력하세요: ");
                int number = scanner.nextInt();
                balance = withdraw(balance, number);
            } else if (input == 3) {
                System.out.println("현재 잔액은 : " + balance + "원 입니다.");
            } else {
                System.out.println("잘못된 번호입니다.");
            }
        }
    }

    public static int deposit (int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withdraw (int balance, int amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출급하였습니다. 현재 잔액 : " + balance + "원");
            return balance;
        } else {
            System.out.println("잔고가 부족합니다.");
            return balance;
        }
    }
}
