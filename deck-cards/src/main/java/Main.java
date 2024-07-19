import Cards.Deck;
import Cards.Format;

public class Main
{
    public static void main(String[] args)
    {
        // создаём укороченную колоду
        Deck shortDeck = new Deck(Format.Short);
        System.out.println(shortDeck);

        //перемешиваем
        shortDeck.shuffle();
        System.out.println(shortDeck);

        //сортируем
        shortDeck.order();
        System.out.println(shortDeck);


        // создаём полную колоду
        Deck fullDeck = new Deck(Format.Full);
        System.out.println(fullDeck);

        //перемешиваем
        fullDeck.shuffle();
        System.out.println(fullDeck);

        //сортируем
        fullDeck.order();
        System.out.println(fullDeck);
    }
}
