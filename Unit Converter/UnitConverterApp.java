import java.util.Scanner;

public class UnitConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Unit Converter App ---");
            System.out.println("1. Length Converter");
            System.out.println("2. Weight Converter");
            System.out.println("3. Temperature Converter");
            System.out.println("0. Exit");
            System.out.print("Choose a conversion type: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    convertLength(sc);
                    break;
                case 2:
                    convertWeight(sc);
                    break;
                case 3:
                    convertTemperature(sc);
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    static void convertLength(Scanner sc) {
        System.out.println("\n--- Length Converter ---");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Miles");
        System.out.println("3. Miles to Meters");
        System.out.print("Enter your choice: ");
        int option = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();
        double result = 0;

        switch (option) {
            case 1:
                result = value / 1000;
                System.out.println(value + " meters = " + result + " kilometers");
                break;
            case 2:
                result = value * 0.621371;
                System.out.println(value + " kilometers = " + result + " miles");
                break;
            case 3:
                result = value * 1609.34;
                System.out.println(value + " miles = " + result + " meters");
                break;
            default:
                System.out.println("Invalid length conversion choice.");
        }
    }

    static void convertWeight(Scanner sc) {
        System.out.println("\n--- Weight Converter ---");
        System.out.println("1. Grams to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.println("3. Pounds to Grams");
        System.out.print("Enter your choice: ");
        int option = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();
        double result = 0;

        switch (option) {
            case 1:
                result = value / 1000;
                System.out.println(value + " grams = " + result + " kilograms");
                break;
            case 2:
                result = value * 2.20462;
                System.out.println(value + " kilograms = " + result + " pounds");
                break;
            case 3:
                result = value * 453.592;
                System.out.println(value + " pounds = " + result + " grams");
                break;
            default:
                System.out.println("Invalid weight conversion choice.");
        }
    }

    static void convertTemperature(Scanner sc) {
        System.out.println("\n--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Kelvin");
        System.out.println("3. Kelvin to Celsius");
        System.out.print("Enter your choice: ");
        int option = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();
        double result = 0;

        switch (option) {
            case 1:
                result = (value * 9/5) + 32;
                System.out.println(value + "°C = " + result + "°F");
                break;
            case 2:
                result = (value - 32) * 5/9 + 273.15;
                System.out.println(value + "°F = " + result + " K");
                break;
            case 3:
                result = value - 273.15;
                System.out.println(value + " K = " + result + "°C");
                break;
            default:
                System.out.println("Invalid temperature conversion choice.");
        }
    }
}
