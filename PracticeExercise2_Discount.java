// ANSWER KEY - Practice Exercise 2 (discount, logical operators)
// RULE CHOSEN: you get a discount if you are a student OR a member OR you have a coupon.
// (Any consistent rule is fine — the point is expressing it with && / ||.
//  A stricter rule could be: (isStudent || isMember) && hasCoupon )
public class PracticeExercise2_Discount {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isMember  = false;
        boolean hasCoupon = false;

        boolean getsDiscount = isStudent || isMember || hasCoupon;

        System.out.println("Gets discount: " + getsDiscount);   // true
    }
}