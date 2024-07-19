import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if(N < 2)
            return;

        int[][] matrix = new int[N][N];

        // заполняем матрицу
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // меняем местами строки и столбцы
        for(int i = 1; i < N; i++)
        {
            for(int j = 0; j < i; j++)
            {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        // выводим матрицу
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}