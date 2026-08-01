// ANSWER KEY - Practice Exercise 5 (3-subject percentage + pass/fail)
import java.util.Scanner;

public class PracticeExercise5_ThreeSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        double percentage = (physics + chemistry + maths) / 3.0;   
        System.out.println("Percentage: " + percentage);

        if (physics >= 40 && chemistry >= 40 && maths >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}