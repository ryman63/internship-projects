import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        List<Integer> basket = new ArrayList<Integer>();

    /*    имеется следующий набор:

        2 экземпляра первой книги;
        2 экземпляра второй книги;
        2 экземпляра третьей книги;
        1 экземпляр четвертой книги;
        1 экземпляр пятой книги.*/

        basket.add(1);
        basket.add(1);
        basket.add(2);
        basket.add(2);
        basket.add(3);
        basket.add(3);
        basket.add(4);
        basket.add(5);


        BookStore store = new BookStore();

        double totalCost = store.calculateBasketCost(basket);
        System.out.println("Total cost: " + totalCost + " rubles");
    }
}
