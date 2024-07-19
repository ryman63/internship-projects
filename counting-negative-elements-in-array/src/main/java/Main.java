import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] scStrings = scanner.nextLine().split(" ");

        int sum = 0;
        int count = 0;

        for(String item : scStrings)
        {
            int temp = Integer.parseInt(item);
            if(temp < 0)
            {
                sum += temp;
                count++;
            }
        }

        System.out.printf("%d %d", count, sum);
    }
}