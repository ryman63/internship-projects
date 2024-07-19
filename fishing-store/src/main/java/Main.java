import fishing.providers.GoodProvider;
import fishing.stores.Store;
import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;

public class Main {
    public static void main(String[] args) {
        // создаём поставщика и магазин
        GoodProvider goodProvider = new GoodProvider();
        Store fishingStore = new Store();
        // просим поставщика завезти по 2 товара каждого типа
        for (ProductName productName : ProductName.values()) {
            fishingStore.receiveProduct(goodProvider.orderProduct(productName, 2));
        }

        Product boots1 = fishingStore.buy(ProductName.BOOTS);
        if (boots1 != null)
            System.out.println("Вы купили: " + boots1.name());
        else
            System.out.println("нет в наличии");

        for (ProductName productName : ProductName.values()) {
            System.out.println("Кол-во " + productName + " в магазине: " + fishingStore.getBalance(productName));
        }

        Product boots2 = fishingStore.buy(ProductName.BOOTS);
        if (boots2 != null)
            System.out.println("Вы купили: " + boots2.name());
        else
            System.out.println("нет в наличии");

        Product boots3 = fishingStore.buy(ProductName.BOOTS);
        if (boots3 != null)
            System.out.println("Вы купили: " + boots3.name());
        else
            System.out.println("нет в наличии");

        for (ProductName productName : ProductName.values()) {
            System.out.println("Кол-во " + productName + " в магазине: " + fishingStore.getBalance(productName));
        }
    }
}
