import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String scString1 = scanner.next();
        String scString2 = scanner.next();

        int Sum = 0;

        boolean flag = false; // error

        String[] scStrings = new String[] {scString1, scString2};

        for(String item : scStrings)
        {
            int number = 0;
            switch (item)
            {
                case "odin":
                    number = 1;
                    break;
                case "dva":
                    number = 2;
                    break;
                case "tri":
                    number = 3;
                    break;
                case "chetire":
                    number = 4;
                    break;
                case "pyat`":
                    number = 5;
                    break;
                case "shest`":
                    number = 6;
                    break;
                case "sem`":
                    number = 7;
                    break;
                case "vosem`":
                    number = 8;
                    break;
                case "devyat`":
                    number = 9;
                    break;
                default:
                    flag = true;
                    break;

            }
            Sum += number;
        }


        if(flag)
            System.out.print("error");
        else
            System.out.print(Sum);
    }
}