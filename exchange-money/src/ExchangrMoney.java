import java.util.Scanner;

public class ExchangrMoney {
    public static void main(String[] args) {
     int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so Dola can quy doi   ");
        int USD = scanner.nextInt();

        int VND = USD * rate;
        System.out.printf("So USD quy doi ra VND la   " + VND +"  VND");







    }

}
