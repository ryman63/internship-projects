import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // считываем n, a, b
        String scString = scanner.nextLine();

        // парсим n, a, b
        String[] scStrings = scString.split(" ");
        if(scStrings.length != 3)
        {
            System.out.print("NO");
            return;
        }
        int n = Integer.parseInt(scStrings[0]);
        int a = Integer.parseInt(scStrings[1]);
        int b = Integer.parseInt(scStrings[2]);

        if (n <= 0 || a < 0 || a >= n || b < 0 || b >= n)
        {
            System.out.print("NO");
            return;
        }

        int[] numbers = new int[n];

        // заполняем массив с клавиатуры
        for(int i = 0; i < n; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        // запоминаем значение в ячейке b
        int temp = numbers[b];

        // свапаем
        numbers[b] = numbers[a];

        // устанавливаем ячейке b значение которое запомнили
        numbers[a] = temp;

        // выводим массив
        for(int item : numbers)
            System.out.println(item);
    }
}