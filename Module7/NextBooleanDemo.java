import java.util.Scanner;

public class NextBooleanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NOTE: nextBoolean() only accepts the exact words "true" or "false" as input
        // (not "yes"/"no", not "1"/"0" — it will crash on anything else)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Is student: " + isStudent);

        sc.close();
    }
}