import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Введите номер автомобиля (для выхода введите 'exit'): ");
            String scString = scanner.nextLine().trim().toUpperCase();

            if (scString.equalsIgnoreCase("exit")) {
                break;
            }

            try
            {
                if(LicenseNumber.isValid(scString))
                {
                    LicenseNumber number = LicenseNumber.parse(scString);
                    System.out.println("Регион: " + number.getRegion());
                }
            }
            catch (IllegalArgumentException exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }
}
