import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int result = 0;
        for (int i = 0 ;; i++)
        {
            int scNumber = scanner.nextInt();
            sum += scNumber;
            if(sum == 10)
                result = i + 1;
            if(scNumber == 0)
                break;

        }
        System.out.print(result);
    }
}