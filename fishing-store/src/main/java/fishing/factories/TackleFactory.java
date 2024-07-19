package fishing.factories;

import fishing.products.Tackle;
import ru.ds.education.fishing.api.FishingGoodFactory;
import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;

import java.util.ArrayList;
import java.util.List;

public class TackleFactory implements FishingGoodFactory {
    @Override
    public List<Product> getPallet(int size) {
        List<Product> tackles = new ArrayList<Product>(size);
        for(int i = 0; i < size; i++)
        {
            tackles.add(new Tackle());
        }
        return tackles;
    }

    @Override
    public ProductName productName() {
        return ProductName.TACKLE;
    }
}
