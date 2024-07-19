package fishing.providers;

import ru.ds.education.fishing.api.FishingGoodFactory;
import ru.ds.education.fishing.api.FishingGoodsProvider;
import ru.ds.education.fishing.api.Product;
import ru.ds.education.fishing.api.ProductName;
import fishing.factories.*;

import java.util.List;

public class GoodProvider implements FishingGoodsProvider {
    FishingGoodFactory[] factories = {
            new TackleFactory(),
            new SuitFactory(),
            new BootsFactory()
    };
    @Override
    public List<Product> orderProduct(ProductName productName, int size) {
        for(FishingGoodFactory factory : factories)
        {
            if(factory.productName() == productName)
                return factory.getPallet(size);
        }
        return null;
    }
}
