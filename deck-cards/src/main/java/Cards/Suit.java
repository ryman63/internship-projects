package Cards;

enum Suits
{
    Diamonds,
    Clubs,
    Hearts,
    Spades
}
public class Suit
{
    private Suits value;

    public Suit(Suits value)
    {
        this.value = value;
    }

    public Suits getValue() {
        return value;
    }

    public void setValue(Suits value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
