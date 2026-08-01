public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 5, b = 20, c = 1;

        a += 10;   // a = a + 10  -> 15
        b -= a;    // b = b - a    -> 20 - 15 = 5   (uses the NEW a, which is 15)
        c *= b;    // c = c * b    -> 1 * 5   = 5

        System.out.println("a = " + a);   // 15
        System.out.println("b = " + b);   // 5
        System.out.println("c = " + c);   // 5
    }
}