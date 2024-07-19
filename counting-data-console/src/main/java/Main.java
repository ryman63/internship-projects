import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true)
        {
            double scNumber = scanner.nextDouble();

            if(scNumber == 0)
            {
                break;
            }

            sum += scNumber;
            count++;

        }

        double average = sum/(double)count;
        average = Math.floor(average * 100) / 100;
        sum = Math.floor(sum * 100) / 100;

        System.out.printf("%d %.2f %.2f", count, sum, average);

    }
}