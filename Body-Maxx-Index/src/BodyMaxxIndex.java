import java.util.Scanner;

public class BodyMaxxIndex {
    public static void main(String[] args) {
    double height, weight, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so chieu cao (m)  ");
        height=scanner.nextDouble();

        System.out.print("Moi ban nhap so can nang (kg)   ");
        weight=scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi<18.5)
            System.out.printf("%-20.2s%s", bmi, "underWeight");
        else if (bmi<25)
            System.out.printf("%-20.2s%s", bmi, "Normal");
        else if (bmi<30)
            System.out.printf("%-20.2s%s", bmi, "OverWeight");
        else
            System.out.printf("%-20.2s%s", bmi, "Obesy");






    }



}
