import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номиналы монет которые выдаёт машина (p.s. в одну строку через пробел):");

        String scString = scanner.nextLine();

        ArrayList<Integer> nominals = new ArrayList<Integer>();

        for(String item : scString.split(" "))
        {
            nominals.add(Integer.parseInt(item));
        }

        ChangeMachine changeMachine = new ChangeMachine(nominals);

        System.out.println("Введите сумму для размена: ");

        int scNumber = scanner.nextInt();

        ArrayList<Coin> coins = changeMachine.getChange(scNumber);

        for(Coin coin : coins)
        {
            System.out.println(coin);
        }
    }
}
