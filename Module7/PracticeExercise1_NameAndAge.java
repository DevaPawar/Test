// ANSWER KEY - Practice Exercise 1 (name + age, using nextLine and nextInt)
// NOTE: name is read FIRST (nextLine has no leftover-newline issue when it's the very first read).
// If age were read before name, we'd need an extra sc.nextLine() in between — see 02_nextLine folder.
import java.util.Scanner;

public class PracticeExercise1_NameAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}