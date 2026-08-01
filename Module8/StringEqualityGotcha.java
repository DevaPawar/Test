public class StringEqualityGotcha {
    public static void main(String[] args) {
        // Case 1: two String LITERALS -- Java quietly reuses the same object, so == happens to work.
        String a = "Red";
        String b = "Red";
        System.out.println("literal == literal:      " + (a == b));        // true (looks fine... but don't trust it)

        // Case 2: a String built with 'new' -- a DIFFERENT object with the same text.
        String c = new String("Red");
        System.out.println("literal == new String:   " + (a == c));        // false! Same text, but == says no.
        System.out.println("a.equals(c):              " + a.equals(c));    // true -- .equals() checks the TEXT, always correct.

        // This is exactly why real programs (reading user input, from a database, etc.)
        // should ALWAYS use .equals() to compare Strings, never ==.
    }
}