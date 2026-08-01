package Module10;

// ANSWER KEY - Practice Exercise 4 (factorial)
// Uses 'long' instead of 'int' -- factorials grow FAST (13! already overflows int).
import java.util.Scanner;

public class PracticeExercise4_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;      // factorial = factorial * i
        }

        System.out.println(n + "! = " + factorial);
        sc.close();
    }
}