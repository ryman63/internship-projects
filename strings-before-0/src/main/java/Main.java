import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] scStrings = new String[1];

        for (int i = 0 ;; i++)
        {
            String scString = scanner.nextLine();
            if(scString.equals("0"))
            {
                 break;
            }

            if(i >= scStrings.length)
            {
                String[] newArray = new String[scStrings.length + 1];
                System.arraycopy(scStrings, 0, newArray, 0, scStrings.length);
                scStrings = newArray;
            }

            scStrings[i] = scString;

        }
        for(String scString : scStrings)
        {
            if(scString != null)
                System.out.println(scString);
        }
    }
}