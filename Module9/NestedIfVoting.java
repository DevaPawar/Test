// package Module9;
public class NestedIfVoting {
    public static void main(String[] args) {
        int age = 16;
        String country = "India";

        if (country.equals("India")) {            // Condition 1
            if (age >= 18) {                       // Condition 2 — only CHECKED if Condition 1 is true
                System.out.println("You can vote.");
            } else {
                System.out.println("You are too young to vote.");
            }
        }
        // If country weren't "India", we'd never even reach the age check —
        // that's the whole point of NESTING: Condition 2 only matters once Condition 1 passes.

        // Try changing age to 20, or country to "USA", and re-run.
    }
}