// ANSWER KEY - Practice Exercise 2 (profit / loss)
public class PracticeExercise2_ProfitLoss {
    public static void main(String[] args) {
        double cp = 1000;                   

        double sp1 = cp - cp * 10 / 100;      
        double sp2 = cp + cp * 20 / 100;      

        double totalCost = cp * 2;           
        double totalSell = sp1 + sp2;       
        double net = totalSell - totalCost;  

        System.out.println("Total Cost = Rs " + totalCost);
        System.out.println("Total Sell = Rs " + totalSell);
        System.out.println("Net (positive = profit) = Rs " + net);
    }
}