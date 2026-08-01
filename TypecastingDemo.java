public class TypecastingDemo {
    public static void main(String[] args) {
        // WIDENING (automatic): small type -> larger type. Always safe, no cast needed.
        int myInt = 9;
        double myDouble = myInt;          // int slides into double on its own
        System.out.println("Widening:  " + myInt + " -> " + myDouble);   // 9 -> 9.0

        // NARROWING (manual): larger type -> smaller type. Needs a cast, may lose data.
        double d = 9.78;
        int i = (int) d;                  // the .78 is CHOPPED off (not rounded!)
        System.out.println("Narrowing: " + d + " -> " + i);              // 9.78 -> 9
    }
}