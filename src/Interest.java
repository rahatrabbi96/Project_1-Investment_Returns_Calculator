import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Initial blance: ");
        int balance = scan.nextInt();
        System.out.println("Annual interest rate (percent): ");
        int rate = scan.nextInt();

        double yearlyInterest = (balance * rate/100.0);
        double monthlyInterest = yearlyInterest/12;

        double Total1stMonth = balance + monthlyInterest;
        double Total2ndMonth = Total1stMonth + monthlyInterest;
        double Total3rdMonth = Total2ndMonth + monthlyInterest;
        double Total4thMonth = Total3rdMonth + monthlyInterest;
        double Total5thMonth = Total4thMonth + monthlyInterest;
        double Total6thMonth = Total5thMonth + monthlyInterest;


        System.out.println(String.format("After the first month : $%.2f", Total1stMonth));
        System.out.println(String.format("After the Second month : $%.2f", Total2ndMonth));
        System.out.println(String.format("After the Third month : $%.2f", Total3rdMonth));
        System.out.println(String.format("After the fourth month : $%.2f", Total4thMonth));
        System.out.println(String.format("After the fifth month : $%.2f", Total5thMonth));
        System.out.println(String.format("After the Sixth month : $%.2f", Total6thMonth));
    }
}
