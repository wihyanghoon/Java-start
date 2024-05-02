package scanner;
// 자바 유틸패키지에 포함된 스캐너객체 임포트
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 :");
        // 입력을 엔터시 string값으로 가져온다.
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        // 입력을 엔터시 정수값으로 가져온다.
        int num = scanner.nextInt();
        System.out.println("입력한 정수: " + num);

        System.out.print("실수를 입력하세요:");
        // 입력을 엔터시 실수값으로 가져온다.
        double doubleNum = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleNum);
    }

}
