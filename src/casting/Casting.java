package casting;

public class Casting {
    public static void main(String[] args) {
        double doubleNum = 1.5;
        int intNum = 0;

        // 묵시적 형변환
        // 컴파일 오류
        // intNum = doubleNum

        // 명시적 형변환
        // 명시적 형 변환시 숫자가 손실되는 문제가 발생 할 수 있음
        intNum = (int) doubleNum;
        System.out.println(intNum);
    }
}
