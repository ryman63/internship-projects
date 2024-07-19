import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scNumber = scanner.nextInt();

        int denominator = 2;
        while (scNumber % denominator != 0)
            denominator += 1;
        System.out.print(denominator == scNumber);


    }
}