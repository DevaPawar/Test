// ANSWER KEY - Practice Exercise 3 (temperature -> clothing advice)
import java.util.Scanner;

public class PracticeExercise3_TemperatureAdvice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp < 10) {
            System.out.println("Wear a coat");
        } else if (temp <= 20) {           
            System.out.println("Light jacket recommended");
        } else if (temp <= 30) {         
            System.out.println("T-shirt weather");
        } else {                           
            System.out.println("Stay indoors!");
        }

        sc.close();
    }
}