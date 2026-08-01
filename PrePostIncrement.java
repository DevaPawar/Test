public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 3;
        int a = i++;   
        int b = ++i;  

        System.out.println("a = " + a);  
        System.out.println("b = " + b); 
        System.out.println("i = " + i);  
    }
}