package scanner.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료됩니다.) ");
            int price = input.nextInt();

            if(price == -1){
                break;
            }

            System.out.print("수량을 입력하세요: ");
            int quantity = input.nextInt();

            System.out.println("총 비용 : " + price*quantity);
        }
    }
}
