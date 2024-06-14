import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Please select the currency you want to convert from:");
        System.out.println("1. USD (United States Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. INR (Indian Rupee)");
        System.out.println("5. JPY (Japanese Yen)");
        System.out.print("Enter your choice (1-5): ");

        int fromCurrency = scanner.nextInt();

        System.out.println("Please select the currency you want to convert to:");
        System.out.println("1. USD (United States Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. INR (Indian Rupee)");
        System.out.println("5. JPY (Japanese Yen)");
        System.out.print("Enter your choice (1-5): ");

        int toCurrency = scanner.nextInt();

        System.out.print("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);

        System.out.printf("The converted amount is: %.2f%n", convertedAmount);
    }

    public static double convertCurrency(int fromCurrency, int toCurrency, double amount) {
        // Exchange rates (you can update these rates as per current market rates)
        double usdToEur = 0.84;
        double usdToGbp = 0.76;
        double usdToInr = 74.83;
        double usdToJpy = 109.23;
        double eurToUsd = 1.19;
        double eurToGbp = 0.90;
        double eurToInr = 88.42;
        double eurToJpy = 130.23;
        double gbpToUsd = 1.32;
        double gbpToEur = 1.11;
        double gbpToInr = 98.23;
        double gbpToJpy = 143.45;
        double inrToUsd = 0.013;
        double inrToEur = 0.011;
        double inrToGbp = 0.010;
        double inrToJpy = 1.46;
        double jpyToUsd = 0.0092;
        double jpyToEur = 0.0077;
        double jpyToGbp = 0.0069;
        double jpyToInr = 0.68;

        switch (fromCurrency) {
            case 1: // USD
                switch (toCurrency) {
                    case 2: // EUR
                        return amount * usdToEur;
                    case 3: // GBP
                        return amount * usdToGbp;
                    case 4: // INR
                        return amount * usdToInr;
                    case 5: // JPY
                        return amount * usdToJpy;
                    default:
                        return amount;
                }
            case 2: // EUR
                switch (toCurrency) {
                    case 1: // USD
                        return amount * eurToUsd;
                    case 3: // GBP
                        return amount * eurToGbp;
                    case 4: // INR
                        return amount * eurToInr;
                    case 5: // JPY
                        return amount * eurToJpy;
                    default:
                        return amount;
                }
            case 3: // GBP
                switch (toCurrency) {
                    case 1: // USD
                        return amount * gbpToUsd;
                    case 2: // EUR
                        return amount * gbpToEur;
                    case 4: // INR
                        return amount * gbpToInr;
                    case 5: // JPY
                        return amount * gbpToJpy;
                    default:
                        return amount;
                }
            case 4: // INR
                switch (toCurrency) {
                    case 1: // USD
                        return amount * inrToUsd;
                    case 2: // EUR
                        return amount * inrToEur;
                    case 3: // GBP
                        return amount * inrToGbp;
                    case 5: // JPY
                        return amount * inrToJpy;
                    default:
                        return amount;
                }
            case 5: // JPY
                switch (toCurrency) {
                   case 1: // USD
                        return amount * jpyToUsd;
                    case 2: // EUR
                        return amount * jpyToEur;
                    case 3: // GBP
                        return amount * jpyToGbp;
                    case 4: // INR
                        return amount * jpyToInr;
                    default:
                        return amount;
                }
            default:
                return amount;
        }
    }
}