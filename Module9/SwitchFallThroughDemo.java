// THIS FILE DEMONSTRATES THE FALL-THROUGH BUG ON PURPOSE.
// NOTE: uses day = 1, not day = 2 — with day=1 you can actually SEE case 1 "fall into" case 2.
// (If you used day=2 here, execution would jump straight into case 2 and look completely normal —
//  the missing break after case 1 would never even come into play.)

public class SwitchFallThroughDemo {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                                // break;

            case 2:
                System.out.println("Tuesday");
                // break;
                case 3 :
                System.out.println("Tuesday");
                // break;
            default:
                System.out.println("Invalid day");
        }

    }
}