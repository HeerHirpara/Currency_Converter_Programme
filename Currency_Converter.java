import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*");
        System.out.println("*       WELCOME TO CURRENCY CONVERTER PROGRAMME         *");
        System.out.println("*");
        Logic logic = new Logic();
        logic.choice(); // Start currency conversion choices
    }
}

// Base class for currency conversion logic
class CurrencyConverter {
    // Method to get the currency symbol based on the currency code
    String getCurrencySymbol(String currencyCode) {
        switch (currencyCode) {
            case "INR":
                return "₹";
            case "USD":
                return "$";
            case "AED":
                return "د.إ";
            case "EURO":
                return "€";
            case "KWD":
                return "د.ك";
            default:
                return "";
        }
    }

    // Conversion calculation and output with currency symbol
    void convertCurrency(double value, double rate, String currencyCode) {
        double result = value * rate;
        String symbol = getCurrencySymbol(currencyCode);
        System.out.println("Converted amount: " + result + " " + symbol);
    }
}

// Logic class inheriting from CurrencyConverter
class Logic extends CurrencyConverter {
    Scanner sc = new Scanner(System.in);

    // Menu for currency conversion choices
    void choice() {
        while (true) {
            // Displaying conversion options
            System.out.println("=============================================");
            System.out.println("=========CURRENCY CONVERSION OPTIONS=========");
            System.out.println("=============================================");
            System.out.println("Press 1 for INR to USD");
            System.out.println("Press 2 for USD to INR");
            System.out.println("Press 3 for AED to INR");
            System.out.println("Press 4 for AED to USD");
            System.out.println("Press 5 for INR to AED");
            System.out.println("Press 6 for USD to AED");
            System.out.println("Press 7 for EURO to INR");
            System.out.println("Press 8 for EURO to USD");
            System.out.println("Press 9 for EURO to AED");
            System.out.println("Press 10 for USD to EURO");
            System.out.println("Press 11 for INR to EURO");
            System.out.println("Press 12 for AED to EURO");
            System.out.println("Press 13 for KWD to USD");
            System.out.println("Press 14 for KWD to INR");
            System.out.println("Press 15 for KWD to AED");
            System.out.println("Press 16 for INR to KWD");
            System.out.println("Press 17 for USD to KWD");
            System.out.println("Press 18 for AED to KWD");
            System.out.println("Press 19 for KWD to EURO");
            System.out.println("Press 20 for EURO to KWD");
            System.out.println("Press 0 to Exit");

            // Take user choice
            System.out.print("Enter your choice which select you in options: ");
            int choice = sc.nextInt();
            sc.nextLine(); // To consume the newline left by nextInt()
            if (choice == 0) {
                System.out.println("=================================");
                System.out.println("======EXITING THE PROGRAMME======");
                System.out.println("======THANK YOU FOR VISIT=========");
                System.out.println("=================================");
                break; // Exit the loop
            }

            if (choice < 1 || choice > 20) {
                System.out.println("Invalid choice! Please try again.");
                continue; // Skip invalid choices
            }

            // Perform selected conversion
            boolean continueConversion = true;
            while (continueConversion) {
                switch (choice) {
                    case 1:
                        this.RstoUsd();
                        break;
                    case 2:
                        this.UsdtoRs();
                        break;
                    case 3:
                        this.AedtoRs();
                        break;
                    case 4:
                        this.AedtoUsd();
                        break;
                    case 5:
                        this.RstoAed();
                        break;
                    case 6:
                        this.UsdtoAed();
                        break;
                    case 7:
                        this.EurotoRs();
                        break;
                    case 8:
                        this.EurotoUsd();
                        break;
                    case 9:
                        this.EurotoAed();
                        break;
                    case 10:
                        this.UsdtoEuro();
                        break;
                    case 11:
                        this.RstoEuro();
                        break;
                    case 12:
                        this.AedtoEuro();
                        break;
                    case 13:
                        this.KwdtoUsd();
                        break;
                    case 14:
                        this.KwdtoRs();
                        break;
                    case 15:
                        this.KwdtoAed();
                        break;
                    case 16:
                        this.RstoKwd();
                        break;
                    case 17:
                        this.UsdtoKwd();
                        break;
                    case 18:
                        this.AedtoKwd();
                        break;
                    case 19:
                        this.KwdtoEuro();
                        break;
                    case 20:
                        this.EurotoKwd();
                        break;
                }

                // Ask the user if they want to repeat with the same currency pair
                System.out.print("Do you want to perform another conversion with the same currency pair? (yes/no): ");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("no")) {
                    continueConversion = false; // Exit the loop if user doesn't want to continue
                }
            }
        }
    }

    // Currency conversion methods with currency symbols
    void RstoUsd() {
        System.out.println("Enter value in INR:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 1 / 86.22, "USD"); // INR to USD
    }

    void UsdtoRs() {
        System.out.println("Enter value in USD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 86.22, "INR"); // USD to INR
    }

    void AedtoRs() {
        System.out.println("Enter value in AED:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 23.56, "INR"); // AED to INR
    }

    void AedtoUsd() {
        System.out.println("Enter value in AED:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.27, "USD"); // AED to USD
    }

    void RstoAed() {
        System.out.println("Enter value in INR:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 1 / 0.042, "AED"); // INR to AED
    }

    void UsdtoAed() {
        System.out.println("Enter value in USD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 3.67, "AED"); // USD to AED
    }

    void EurotoRs() {
        System.out.println("Enter value in EURO:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 89.61, "INR"); // EURO to INR
    }

    void EurotoUsd() {
        System.out.println("Enter value in EURO:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 1.04, "USD"); // EURO to USD
    }

    void EurotoAed() {
        System.out.println("Enter value in EURO:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 3.82, "AED"); // EURO to AED
    }

    void UsdtoEuro() {
        System.out.println("Enter value in USD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.96, "EURO"); // USD to EURO
    }

    void RstoEuro() {
        System.out.println("Enter value in INR:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.011, "EURO"); // INR to EURO
    }

    void AedtoEuro() {
        System.out.println("Enter value in AED:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.26, "EURO"); // AED to EURO
    }

    void KwdtoUsd() {
        System.out.println("Enter value in KWD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 3.24, "USD"); // KWD to USD
    }

    void KwdtoRs() {
        System.out.println("Enter value in KWD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 279.74, "INR"); // KWD to INR
    }

    void KwdtoAed() {
        System.out.println("Enter value in KWD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 11.89, "AED"); // KWD to AED
    }

    void RstoKwd() {
        System.out.println("Enter value in INR:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.0036, "KWD"); // INR to KWD
    }

    void UsdtoKwd() {
        System.out.println("Enter value in USD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.31, "KWD"); // USD to KWD
    }

    void AedtoKwd() {
        System.out.println("Enter value in AED:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.084, "KWD"); // AED to KWD
    }

    void KwdtoEuro() {
        System.out.println("Enter value in KWD:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 3.13, "EURO"); // KWD to EURO
    }

    void EurotoKwd() {
        System.out.println("Enter value in EURO:");
        double value = sc.nextDouble();
        sc.nextLine(); // Consume the newline
        this.convertCurrency(value, 0.32, "KWD"); // EURO to KWD
    }
}