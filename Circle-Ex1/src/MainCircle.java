import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ban kinh hinh tron:   ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("Chu vi hinh tron la:   " + circle.getPrimier());;
    }
}
