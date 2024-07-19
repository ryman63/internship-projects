package Cards;

enum Ranks
{
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King,
    Ace
}
public class Rank
{
    private Ranks value;

    public Rank(Ranks value) {
        this.value = value;
    }

    public Ranks getValue() {
        return value;
    }

    public void setValue(Ranks value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
