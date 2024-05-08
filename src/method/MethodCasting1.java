package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;

        //printNumber(number); // 타입이 맞지 않음.
        printNumber((int) number); // 명시적 형변환 사용
    }

    public static void printNumber (int a) {
        System.out.println("숫자: " + a);
    }
}
