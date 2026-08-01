import java.util.Scanner;

public class NextLineDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your address: ");
        String address = sc.nextLine();     // reads the WHOLE line, spaces included

        System.out.println("You entered: " + address);

        sc.close();
    }
}