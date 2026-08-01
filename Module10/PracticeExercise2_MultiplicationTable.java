package Module10;

// ANSWER KEY - Practice Exercise 2 (multiplication table, formatted)
import java.util.Scanner;

public class PracticeExercise2_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " \t= " + (num * i));
        }

        sc.close();
    }
}