package Cards;
public class Deck
{
    Format format;
    Card[] cards;
    public Deck(Format format)
    {
        this.format = format;
        cards = new Card[format.getCount()];
        fillDeck();
    }

    private void fillDeck()
    {
        int counter = 0;
        for(Suits suit : Suits.values())
        {
            if(format == Format.Full)
            {
                for(Ranks rank : Ranks.values())
                {
                    cards[counter] = new Card(new Rank(rank), new Suit(suit));
                    counter++;
                }
            }
            else
            {
                Ranks[] ranks = Ranks.values();

                // начинаем заполнять с ранга Six
                for(int i = Ranks.Six.ordinal(); i < ranks.length; i++)
                {
                    cards[counter] = new Card(new Rank(ranks[i]), new Suit(suit));
                    counter++;
                }
            }
        }
    }

    public int findCardIndex(Ranks rank, Suits suit)
    {
        for(int i = 0; i < format.getCount(); i++)
        {
            if(cards[i].getRank().getValue() == rank && cards[i].getSuit().getValue() == suit)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilderCards = new StringBuilder();

        for(int i = 0; i < format.getCount(); i++)
        {
            stringBuilderCards.append("\n" + (i + 1) + " [" + cards[i].toString() + "]");
        }

        return "Колода \n" +
                "Формат = " + format +
                "\nКарты = (" +
                stringBuilderCards.toString() +
                "\n)\n";
    }

    // Перетасовка колоды
    public void shuffle()
    {
        for(int i = 0; i < format.getCount(); i++)
        {
            // меняем местами рандомный индекс и текущий
            int random_index = (int) (Math.random() * format.getCount());
            Card temp = cards[random_index];
            cards[random_index] = cards[i];
            cards[i] = temp;
        }
    }

    // упорядочить колоду
    public void order()
    {
        int counter = 0;
        for(Suits suit : Suits.values())
        {
            // пузырькуем в зависимости от формата колоды

            if(format == Format.Full)
            {
                for(Ranks rank : Ranks.values())
                {
                    int findIndex = findCardIndex(rank, suit);
                    if(findIndex != -1)
                    {
                        Card temp = cards[counter];
                        cards[counter] = cards[findIndex];
                        cards[findIndex] = temp;
                    }
                    counter++;
                }
            }
            else
            {
                Ranks[] ranks = Ranks.values();

                // начинаем упорядочивать с ранга Six
                for(int i = Ranks.Six.ordinal(); i < ranks.length; i++)
                {
                    int findIndex = findCardIndex(ranks[i], suit);
                    if(findIndex != -1)
                    {
                        Card temp = cards[counter];
                        cards[counter] = cards[findIndex];
                        cards[findIndex] = temp;
                    }
                    counter++;
                }
            }
        }
    }

}
