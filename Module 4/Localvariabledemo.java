public class Localvariabledemo {
    public static void main(String[] args) {
        greet();
    }

    static void greet() {
        String name = "Sara";        // local variable — lives only inside greet()
        System.out.println(name);    // works: we are still inside greet()
    }
}