import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int scNumber = scanner.nextInt();

        if(scNumber <= 1 || scNumber >= 20)
            return;

        for(int i = 0; i < scNumber; i++)
        {
            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < scNumber - (i + 1); j++)
            {
                builder.append(" ");
            }

            for(int j = 0; j <= i; j++)
            {
                builder.append("_");
            }
            System.out.println(builder.toString());
        }
    }
}