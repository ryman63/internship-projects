import java.util.*;

public class ChangeMachine
{
    private ArrayList<Integer> coinDenominations;

    public ChangeMachine(ArrayList<Integer> coinDenominations)
    {
        this.coinDenominations = coinDenominations;

        // сортируем и переворачиваем
        Collections.sort(this.coinDenominations);
        Collections.reverse(this.coinDenominations);
    }

    ArrayList<Coin> getChange(int money)
    {
        ArrayList<Coin> coins = new ArrayList<>();

        // так как список перевёрнутый мы идём по списку номиналов от большего к меньшему
        // чтобы выдалось наименьшее кол-во монет
        for(int denomination : coinDenominations)
        {
            if(money <= 0)
                break;

            int count = money / denomination; // считаем кол-во монет определённого номинала
            money -= count * denomination; // высчитываем остаток и записываем его в money
            coins.add(new Coin(count, denomination)); // добавляем в список новую стопку монет определённого номинала
        }

        return coins;
    }
}
