import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = (int)(number / 10);
        int result = number % 10;
        if(result != 0)
            System.out.print(result);
        else
            System.out.print("-1");
    }
}