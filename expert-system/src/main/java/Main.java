import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] questions = {"Чему равна площадь круга с радиусом 3 см.?",
                "Чему равна третья сторона треугольника, если первая и вторая стороны равны 3 см. и 4 см. соответственно?",
                "Чему равен объём цилиндра высотой 5 см., и радиусом 4 см.?",
                "Высота конуса равна 12, длина образующей равна 13. Чему равен диаметр основания конуса?"};

        // строкой является номер вопроса, а столбец вариантом решения
        int[][] options =
                {
                        { 3, 9, 18, 28, 27},
                        {5, 2, 7, 3, 10},
                        {151, 211, 174, 200, 251},
                        {8, 10, 11, 15, 9},
                };

        // индексом является номер вопроса, а значение индексом из массива вариантов правильного ответа на данный вопрос.
        int[] answers = {4, 1, 5, 2};

        Scanner scanner = new Scanner(System.in);

        // баллы пользователя
        int points = 0;

        for(int i = 0; i < questions.length; i++)
        {
            //вывод текущего вопроса
            System.out.println(questions[i]);

            // вывод вариантов ответа
            for(int j = 0; j < options[i].length; j++)
                System.out.println(j + 1 + ") " + options[i][j]);

            System.out.print("Введите номер варианта ответа: ");
            int answer = scanner.nextInt();

            // проверяем вариант ответа
            // если вариант ответа не предусмотрен то завершаем работу
            if(answer <= 0 || answer > options[i].length )
                return;


            // проверяем ответ пользователя на корректность и меняем кол-во баллов в зависимости от ответа
            if(answer == answers[i])
                points++;

            System.out.print("\n");
        }

        System.out.println("Правильных ответов: " + points + " из 4");
        String result = "";
        switch (points)
        {
            case 0:
            case 1: result = "Плохо";
                break;
            case 2:
            case 3: result = "Удовлетворительно";
                break;
            case 4: result = "Хорошо";
        }

        System.out.print("Ваша оценка: " + result);
    }
}