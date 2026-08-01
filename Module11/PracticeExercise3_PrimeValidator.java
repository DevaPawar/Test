package Module11;

// ANSWER KEY - Practice Exercise 3 (keep asking until a prime is entered)
import java.util.Scanner;

public class PracticeExercise3_PrimeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = false;

        while (!isPrime) {
            System.out.print("Enter a prime number between 1-100: ");
            int num = sc.nextInt();

            // Check primality: not prime if num<2, or divisible by anything from 2 to num-1
            isPrime = (num >= 2);
            for (int i = 2; i < num && isPrime; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(num + " a prime number!");
            } else {
                System.out.println("Not a prime number!");
            }
        }

        sc.close();
    }
}