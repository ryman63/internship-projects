import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] matrix = new int[N][M];

        int counter = 0;
        int wallRight = M - 1; // правая граница
        int wallDown = N - 1;  // нижняя
        int wallLeft = 0;      // левая
        int wallUp = 1;        // верхняя
        int row = 0;           // индекс строки
        int col = 0;           // индекс столбца

        // false - по вертикали, true - по горизонтали
        boolean verticalOrHorizontal = true;
        // false - влево, true - вправо
        boolean rightOrLeft = true;
        // false - вниз, true - вверх
        boolean upOrDown = true;

        // заполняем матрицу
        for(int i = 0; i < N * M; i++)
        {
            counter++;

            matrix[row][col] = counter;

            if(verticalOrHorizontal)
            //
            {
                if(rightOrLeft)
                {
                    // вправо по горизонтали
                    col++;

                    // если индекс столбца достиг правой границы
                    // сдвигаем границу и меняем направления
                    if(col == wallRight)
                    {
                        wallRight--;
                        rightOrLeft = !rightOrLeft;
                        verticalOrHorizontal = !verticalOrHorizontal;
                    }
                }
                else
                {
                    // влево по горизонтали
                    col--;

                    // если индекс столбца достиг левой границы
                    // сдвигаем границу и меняем направления
                    if(col == wallLeft)
                    {
                        wallLeft++;
                        rightOrLeft = !rightOrLeft;
                        verticalOrHorizontal = !verticalOrHorizontal;
                    }
                }
            }
            else
            {
                if(upOrDown)
                {
                    // вниз по вертикали
                    row++;

                    // если индекс строки достиг нижней границы
                    // сдвигаем границу и меняем направления
                    if(row == wallDown)
                    {
                        wallDown--;
                        upOrDown = !upOrDown;
                        verticalOrHorizontal = !verticalOrHorizontal;
                    }
                }
                else
                {
                    // вверх по вертикали
                    row--;

                    // если индекс строки достиг верхней границы
                    // сдвигаем границу и меняем направления
                    if(row == wallUp)
                    {
                        wallUp++;
                        upOrDown =!upOrDown;
                        verticalOrHorizontal = !verticalOrHorizontal;
                    }
                }
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