package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello Java";

        printMessage(message, 3);
        printMessage("Good Bye Java", 3);
    }

    public static void printMessage (String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
