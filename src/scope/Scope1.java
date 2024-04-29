package scope;

public class Scope1 {

    public static void main(String[] args) {
        // x가 선언됨
        int x = 10;

        if(true){
            // y가 선언됨
            int y = 10;
            System.out.println("if x = " + x);
            System.out.println("if y = " + y);
        }
        // x의 변수는 살아 있음
        System.out.println("main x = " + x);
        // y는 본인의 스코프를 벗어나 참조 할 수 없음
        //System.out.println("main y = " + y);
    }
}
