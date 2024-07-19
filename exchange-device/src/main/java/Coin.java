
// класс, который представляет собой стопку монет определённого номинала
public class Coin
{

    // количество монет
    private int count;

    // номинал монеты
    private int denomination;

    public Coin(int count, int denomination) {
        this.count = count;
        this.denomination = denomination;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "Монета " +
                "номиналом " + denomination +
                ", в количестве " + count;
    }
}
