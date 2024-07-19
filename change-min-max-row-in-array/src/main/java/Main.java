import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        scanner.close();

        if(N <= 0)
            return;

        int[][] matrix = new int[N][];

        for(int i = 0; i < N; i++)
        {
            String[] scStrings = scanner.nextLine().split(" ");

            // инициализируем столбцы
            matrix[i] = new int[scStrings.length];

            for(int j = 0; j < scStrings.length; j++)
            {
                matrix[i][j] = Integer.parseInt(scStrings[j]);
            }
        }

        int minCountInRow = matrix[0].length;
        int maxCountInRow = matrix[0].length;

        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0; i < N; i++)
        {
            if(matrix[i].length < minCountInRow)
            {
                minCountInRow = matrix[i].length;
                minIndex = i;
            }
            if(matrix[i].length > maxCountInRow)
            {
                maxCountInRow = matrix[i].length;
                maxIndex = i;
            }
        }

        if(minIndex == maxIndex)
        {
            int[] temp = matrix[0];
            matrix[0] = matrix[N - 1];
            matrix[N - 1] = temp;
        }
        else
        {
            int[] temp = matrix[minIndex];
            matrix[minIndex] = matrix[maxIndex];
            matrix[maxIndex] = temp;
        }

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}