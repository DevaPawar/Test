public class StringEqualityGotcha1 {
    public static void main(String[] args) {
        String a = "Red";
        String b = "Red";
        System.out.println("literal == literal:      " + (a == b));     

        String c = new String("Red");
        System.out.println("literal == new String:   " + (a == c));        
        System.out.println("a.equals(c):              " + a.equals(c));   
    }
}