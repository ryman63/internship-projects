import java.util.Scanner;

public class RegularPolygon {

    public static double area (int n, double side)
    {
        if(n < 3 || side <= 0)
            // невозможно вычислить площадь
            return -1;

        return (n * Math.pow(side, 2)) / (4.0 * Math.tan(Math.toRadians(360.0 / (2 * n))));
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double side = scanner.nextDouble();

        double area = area(n, side);

        if(area >= 0)
            System.out.print(area);
        else
            System.out.print("NO");
    }
}
