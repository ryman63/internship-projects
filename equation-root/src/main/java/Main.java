import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int b =scanner.nextInt();
        System.out.print(function(k, b));
    }

    public static float function(int k, int b)
    {
        return (float)b/(float)k;
    }
}