package fishing.products;

import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;

public class Suit implements Product {
    @Override
    public ProductName name() {
        return ProductName.SUIT;
    }
}
