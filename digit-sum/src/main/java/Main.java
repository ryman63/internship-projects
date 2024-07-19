import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int Sum = number % 10; number /= 10;
        Sum += number % 10; number /= 10;
        Sum += number % 10; number /= 10;
        System.out.print(Sum);
    }
}