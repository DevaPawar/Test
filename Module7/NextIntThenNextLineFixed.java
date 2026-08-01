import java.util.Scanner;

// THE FIX for the nextInt() -> nextLine() bug:
// add one extra sc.nextLine() right after nextInt() to "eat" the leftover Enter key.

public class NextIntThenNextLineFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();                    // <-- THE FIX: consumes the leftover newline, does nothing else

        System.out.print("Enter your address: ");
        String address = sc.nextLine();   // now this works correctly and waits for real input

        System.out.println("Age: " + age);
        System.out.println("Address: [" + address + "]");

        sc.close();
    }
}