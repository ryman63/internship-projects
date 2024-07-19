import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        Watch watch = new Watch(0, minutes);
        if(minutes >= 0)
        System.out.printf("%d:%d", watch.GetHours(), watch.GetMinutes());
        else
            System.out.print("0:0");
    }


}

