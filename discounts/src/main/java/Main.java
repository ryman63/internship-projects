import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double discount = 0.05;
        double sum = 0;
        double sumWithDisc = 0;

        for(double scNumber = scanner.nextDouble(); scNumber >= 0;)
        {
            sum += scNumber;
            if(scNumber >= 1000)
                sumWithDisc += scNumber * (1 - discount);
            else
                sumWithDisc += scNumber;
            scNumber = scanner.nextDouble();
        }

        // вычисление скидки

        double saleCost = sum - sumWithDisc;

        // округление до сотых
        sum = Math.floor(sum * 100) / 100;
        sumWithDisc = Math.floor(sumWithDisc * 100) / 100;
        saleCost = Math.floor(saleCost * 100) / 100;

        String formattedDouble = String.format("%.2f", 0.1321231);

        System.out.print(String.format("%.2f", sum).replace(",", ".")
                + " " + String.format("%.2f", sumWithDisc).replace(",", ".")
                + " " + String.format("%.2f", saleCost).replace(",", "."));

        //System.out.printf("%.2f %.2f %.2f", sum, sumWithDisc, saleCost);
    }
}