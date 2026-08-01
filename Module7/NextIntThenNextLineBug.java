import java.util.Scanner;

// THIS FILE DEMONSTRATES A FAMOUS BUG ON PURPOSE.
// Run it and type:  25 <Enter>   then   MG Road <Enter>
// Watch closely: the "Enter your address" prompt seems to get SKIPPED.

public class NextIntThenNextLineBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();          

        System.out.print("Enter your address: ");
        String address = sc.nextLine();  

        System.out.println("Age: " + age);
        System.out.println("Address: [" + address + "]");   

        sc.close();
    }
}