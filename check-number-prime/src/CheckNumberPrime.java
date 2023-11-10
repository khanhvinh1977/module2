import java.util.Scanner;

public class CheckNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so can tim   ");
        int number = scanner.nextInt();

        if (number<2) {
            System.out.print("So nay khong la so nguyen to");
        }
        else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
                if (check) {
                    System.out.println("So " + number + " la so nguyen to");
                } else {
                    System.out.println("So " + number + " khong la so nguyen to");
                }
            }
        }





    }

}
