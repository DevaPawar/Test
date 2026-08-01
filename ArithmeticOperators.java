public class ArithmeticOperators {
    public static void main(String[] args) {
        double a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));   // 15
        System.out.println("a - b = " + (a - b));   // 5
        System.out.println("a * b = " + (a * b));   // 50
        System.out.println("a / b = " + (a / b));   // 2

        int x = 10, y = 3;
        System.out.println("x % y = " + (x % y));   

        // ---- BONUS gotcha: integer division chops the decimal ----
        // System.out.println(10 / 3);              // 3    (NOT 3.33)
        // System.out.println(10.0 / 3);            // 3.333...  (one side must be a double)
    }
}