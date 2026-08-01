package Module10;

// ANSWER KEY - Practice Exercise 3 (sum of natural numbers 1 to 10)
public class PracticeExercise3_SumOfNaturals {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;     
        }

        System.out.println("Sum = " + sum);   
    }
}