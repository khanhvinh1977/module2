import java.awt.*;
import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0.Exit");
            System.out.println("Choice");
            choice=input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit:  ");
                    fahrenheit=input.nextDouble();
                    public static double celsiusToFahrenheit(celsius) {
                        fahrenheit = (9.0 / 5) * celsius + 32;
                        return fahrenheit;
                    }
                    System.out.println("Fahrenheit to Celsius: " + "fahrenheitToCelsius(fahrenheit)");
                    break;
                }
                case 2: {
                        System.out.println("Enter Celsius: ");
                        celsius = input.nextDouble();
                        public static double fahrenheitToCelsius(double fahrenheit) {
                            double celsius = (5.0 / 9) * (fahrenheit - 32);
                            return celsius;
                        }
                        System.out.println("Celsius to Fahrenheit: " + "celsiusToFahrenheit(celsius)");
                        break;
                }
                case 0: {
                    System.exit(0);
                }
                while (choice!=0);


            }


        }






    }
}
