package fishing.stores;

import ru.ds.education.fishing.api.FishingStore;
import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;

import java.util.ArrayList;
import java.util.List;

public class Store implements FishingStore {
    List<Product> products = new ArrayList<>();
    @Override
    public void receiveProduct(List<Product> pallet) {
        if(pallet.size() != 0)
            products.addAll(pallet);
    }

    @Override
    public int getBalance(ProductName productName) {
        int balance = 0;
        for(Product product : products)
        {
            if(product.name() == productName)
                balance++;
        }
        return balance;
    }

    @Override
    public Product buy(ProductName productName) {
        for(Product product : products)
        {
            if(product.name() == productName)
            {
                products.remove(product);
                return product;
            }
        }
        return null;
    }
}
