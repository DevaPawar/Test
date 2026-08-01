public class LogicalOperators {
    public static void main(String[] args) {
        int age = 16;

        System.out.println(age > 13 && age < 18);   // true  && true  -> true
        System.out.println(!(age < 18));            // !(true)        -> false
        System.out.println(age < 13 || age > 15);   // false || true  -> true
    }
}