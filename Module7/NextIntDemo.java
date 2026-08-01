import java.util.Scanner;

public class NextIntDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("You entered: " + age);

        sc.close();
    }
}