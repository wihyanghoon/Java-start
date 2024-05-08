package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값 : " + getAvg(11,2,3));
        System.out.println("평균값 : " + getAvg(3,4,5));
    }

    public static double getAvg(int a, int b, int c) {
        return (a + b + c)/ 3.0;
    }
}
