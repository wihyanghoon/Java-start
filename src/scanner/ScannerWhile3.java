package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("정수를 입력하세요");
            int num = scanner.nextInt();
            sum += num;
            System.out.println("총 합계 " + sum);
            if(num == 0)  break;
        }
    }
}
