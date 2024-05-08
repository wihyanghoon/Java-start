package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;


        balance = deposit(balance ,1000);
        balance = withdraw(balance ,2000);
        System.out.println("최종잔액 : " + balance + "원");
    }

    public static int deposit (int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw (int balance, int amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출급하였습니다. 현재 잔액 : " + balance);
            return balance;
        } else {
            System.out.println("잔고가 부족합니다.");
            return balance;
        }
    }
}
