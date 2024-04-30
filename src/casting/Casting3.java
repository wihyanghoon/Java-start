package casting;

public class Casting3 {
    public static void main(String[] args) {
        // int형
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 1

        // double
        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5

        // 대원칙
        /*
        1. 자바에서 같은 타입끼리 계산은 같은 타입의 타입이 나옴
        2. 다른 타입끼리 계산은 큰범위로 자동 형변환이 일어난다.
        */
    }
}
