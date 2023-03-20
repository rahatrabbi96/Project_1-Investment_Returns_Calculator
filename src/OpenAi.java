import java.text.NumberFormat;
import java.util.Scanner;

public class OpenAi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Annual interest rate: ");
        double rate = sc.nextDouble();

        double monthlyRate = rate / 12 / 100;
        double newBalance = balance;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        for (int month = 1; month <= 6; month++) {
            newBalance = newBalance * (1 + monthlyRate);
            System.out.println("After the " + month + " month: " + currencyFormat.format(newBalance));
        }
    }
}
