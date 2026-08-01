// THE FIX: add the missing break; after case 1.
public class SwitchFallThroughFixed {
    public static void main(String[] args) {
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;              // <-- FIX: stops execution here
            case 2:
                System.out.println("Tuesday");
                break;
            // default:
            //     System.out.println("Invalid day");
        }

        // Now day=1 correctly prints ONLY "Monday"
    }
}