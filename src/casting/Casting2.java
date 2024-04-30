package casting;

public class Casting2 {
    public static void main(String[] args) {
        // overflow

        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;

        int value = 0;

        value = (int) maxIntValue;
        System.out.println("형변환 값 : "+ value);

        value = (int) maxIntOver;
        System.out.println("형변환 값 : " + value);
    }
}
