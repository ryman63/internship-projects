import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        String keepGoing = "Y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("Y")) {
            System.out.print("Введите число: ");
            int val = scan.nextInt();
            try
            {
                System.out.println(
                        String.format(
                                "Факториал(\"%d\") = %d",
                                val, MathUtils.factorial(val)
                        )
                );
            }
            catch (IllegalArgumentException exception)
            {
                System.out.println(exception.getMessage());
            }

            System.out.print("Вычислить другой факториал? (y/n) ");
            keepGoing = scan.next().toUpperCase();
        }
    }
}

