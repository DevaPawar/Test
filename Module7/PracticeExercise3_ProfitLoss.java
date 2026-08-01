// ANSWER KEY - Practice Exercise 3 (profit/loss calculator from user input)
import java.util.Scanner;

public class PracticeExercise3_ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        double diff = sp - cp;
        double percent = (Math.abs(diff) / cp) * 100;

        if (diff > 0) {
            System.out.println("Profit of " + diff);
            System.out.println("Profit % = " + percent);
        } else if (diff < 0) {
            System.out.println("Loss of " + Math.abs(diff));
            System.out.println("Loss % = " + percent);
        } else {
            System.out.println("No profit, no loss");
        }

        sc.close();
    }
}