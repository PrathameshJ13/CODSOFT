import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = getExchangeRate("RS", "USD");

        System.out.println("Currency Converter");
        System.out.print("Enter the amount in base currency: ");
        double baseAmount = scanner.nextDouble();

        double convertedAmount = baseAmount * exchangeRate;
        System.out.println("Converted amount: " + convertedAmount + " USD");

        scanner.close();
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        return 82.98; 
    }
}
