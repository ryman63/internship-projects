import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if(inputNumber < 0 || inputNumber >= 10)
        {
            System.out.print(inputNumber);
            return;
        }


        int factorial = 0;

        for(int i = 0; i <= inputNumber; i++)
        {
            if(i == 0)
            {
                factorial = 1;
                continue;
            }
            factorial *= i;
        }
        System.out.print(factorial);
    }
}