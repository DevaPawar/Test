public class TernaryOperator {
    public static void main(String[] args) {
        int age = 14;

        // condition ? value-if-true : value-if-false
        String result = (age >= 13) ? "Teenager" : "Child";
        System.out.println(result);   // Teenager

        // Try changing age to 12 above:
        //   (12 >= 13) is false, so result becomes "Child"
    }
}