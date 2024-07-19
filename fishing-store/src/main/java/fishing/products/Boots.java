package fishing.products;

import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;

public class Boots implements Product {

    @Override
    public ProductName name() {
        return ProductName.BOOTS;
    }
}
