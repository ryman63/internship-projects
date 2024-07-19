import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if(N < 2 || M < 2)
            return;

        int[][] matrix = new int[N][M];

        // заполняем матрицу
        int counter = 0;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                counter++;

                // если строка чётная то заполняем в обратном порядке
                if(i % 2 == 1)
                    matrix[i][(M - 1) - j] = counter;
                else
                    matrix[i][j] = counter;
            }
        }

        // выводим матрицу
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}