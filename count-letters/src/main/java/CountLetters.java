import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26];

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите слово (только буквы, пожалуйста): ");
        String word = scan.nextLine();
        word = word.toUpperCase();


            for (int i = 0; i < word.length(); i++)
            {
                try
                {
                counts[word.charAt(i) - 'A']++;
                }
                catch (ArrayIndexOutOfBoundsException exception)
                {
                    System.out.println("Символ '" + word.charAt(i) + "' обнаружен в введённой строке на позиции " + (i + 1));
                }
            }
            System.out.println();

            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    System.out.println((char) (i + 'A') + ": " + counts[i]);
                }
            }



    }
}
