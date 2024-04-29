package scope;

public class Scope2 {
    public static void main(String[] args) {
        int num = 10;

        // for문의 조건식에서 선언되는 변수는 해당 for문의 Scope안에서 만 사용 가능
        for(int i = 0; i < 2; i++){
            System.out.println("for num = " + num);
            System.out.println("for i = " + i);
        }

        System.out.println("main num = " + num);
        // System.out.println("main i = " + i);
    }
}
