package fishing.factories;

import fishing.products.Suit;
import ru.ds.education.fishing.api.FishingGoodFactory;
import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;

import java.util.ArrayList;
import java.util.List;

public class SuitFactory implements FishingGoodFactory {
    @Override
    public List<Product> getPallet(int size) {
        List<Product> suits = new ArrayList<Product>(size);
        for(int i = 0; i < size; i++)
        {
            suits.add(new Suit());
        }
        return suits;
    }

    @Override
    public ProductName productName() {
        return ProductName.SUIT;
    }
}
