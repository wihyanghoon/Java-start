package method;

public class Overloading2 {
    public static void main(String[] args) {
        System.out.println("1번 리턴값 : " + add(1, 1.1));
        System.out.println("2번 리턴값 : " + add(1, 2));
    }

    public static int add (int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add (double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
