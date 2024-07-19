import java.lang.management.MonitorInfo;
import java.util.Scanner;
import BankAccount.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            BankAccount account = new DefaultBankAccount();

            switch (i)
            {
                case 0:
                    break;
                case 1: account = new AdvancedBankAccount();
                    break;
                case 2: account = new YouthBankAccount();
                    break;
            }

            System.out.print("Введите ФиО: ");
            String scFullName = scanner.nextLine();
            System.out.println("");
            System.out.print("Введите ПиН-КОД: ");
            String scPinCode = scanner.nextLine();
            System.out.println("");

            System.out.print(account.openingAccount(scFullName, scPinCode));

            if(account.putMoney(scPinCode, new Money(10000)))
                System.out.println("Деньги успешно положены");
            else
                System.out.println("Операция отменена");

            account.increaseCountMonth();

            for(int j = 0; j < 12; j++)
            {
                if(account.isAccountOpening())
                {
                    Money cash = account.withdrawMoney(scPinCode, new Money(600));
                    if(cash != null)
                        System.out.println("Деньги успешно сняты в размере: " + cash);
                    else
                        System.out.println("Деньги не удалось снять");
                    System.out.println(account.getOwnerInfo());
                }

                account.increaseCountMonth();
            }
            System.out.println(" ");

            if(account.payment(scPinCode, new Money(300), "Ростелеком"))
                System.out.println("Платёж успешно прошёл");
            else
                System.out.println("Платёж не прошёл");
            System.out.println(account.getOwnerInfo());

            if(account.payment(scPinCode, new Money(1200), "ЖКХ"))
                System.out.println("Платёж успешно прошёл");
            else
                System.out.println("Платёж не прошёл");
            System.out.println(account.getOwnerInfo());

            account.increaseCountMonth();

            System.out.println("\nДетализация счёта:");
            System.out.print(account.getHistory());
        }
    }
}