import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Fan fan =   new Fan(1, false, 10, "Red" );

        int choice;
        do {
            System.out.println("""
                    Menu
                    1. Change speed
                    2. Turn on/off
                    3. Change color
                    4. Check status
                    0. Exit""");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter new speed");
                    int newSpeed = scanner.nextInt();
                    fan.setSpeed(newSpeed);

                    break;
                case 2:
                    System.out.println("Turn on or off");
                    boolean isOn = scanner.nextBoolean();
                    fan.setOn(isOn);

                    break;
                case 3:
                    System.out.println("Enter new color");
                    String newColor = scanner.next();
                    fan.setColor(newColor);

                    break;
                case 4:
                    System.out.println(fan.toString());
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while(choice != 0);
    }

    }
