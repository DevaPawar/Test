public class FinalVariableDemo {
    public static void main(String[] args) {
        final int MAX_MARKS = 100;                 // constant — set once, locked forever
        System.out.println("Max marks: " + MAX_MARKS);

        // STEP 2: remove the // in front of the next line, then compile again.
        // MAX_MARKS = 90;    // ERROR: cannot assign a value to final variable MAX_MARKS
    }
}