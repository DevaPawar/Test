package Module11;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello");
            i++;
        }
        // "Check first, then do." -- the condition is tested BEFORE each pass.
        // If i started at 6, this loop would run ZERO times.
    }
}