package Module11;

// ANSWER KEY - Practice Exercise 2 (menu-driven calculator)
// do-while fits perfectly here: we ALWAYS want to show the menu at least once,
// then keep looping until the user picks "Exit" -- that's exactly do-while's job.
import java.util.Scanner;
public class PracticeExercise2_MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result: " + (a * b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Error: cannot divide by zero");
                        } else {
                            System.out.println("Result: " + (a / b));
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice, try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}