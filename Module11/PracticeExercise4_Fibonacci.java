package Module11;

// ANSWER KEY - Practice Exercise 4 (first n Fibonacci numbers)
import java.util.Scanner;

public class PracticeExercise4_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        int count = 0;

        while (count < n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
        sc.close();
    }
}