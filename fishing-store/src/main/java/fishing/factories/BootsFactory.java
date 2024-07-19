package fishing.factories;

import fishing.products.Boots;
import ru.ds.education.fishing.api.FishingGoodFactory;
import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;

import java.util.ArrayList;
import java.util.List;

public class BootsFactory implements FishingGoodFactory {

    @Override
    public List<Product> getPallet(int size) {
        List<Product> listBoots = new ArrayList<Product>(size);
        for(int i = 0; i < size; i++)
        {
            listBoots.add(new Boots());
        }
        return listBoots;
    }

    @Override
    public ProductName productName() {
        return ProductName.BOOTS;
    }
}
