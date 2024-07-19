import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Rectangle rect = new Rectangle(x1, x2, y1, y2);
        System.out.print(Math.floor(rect.Square() * 100) / 100);
    }
}