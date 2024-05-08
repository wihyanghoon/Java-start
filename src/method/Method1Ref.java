package method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(1,2);
        System.out.println("결과1 출력: " + sum1);

        int sum2 = add(10, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        return a + b;
    }
}
