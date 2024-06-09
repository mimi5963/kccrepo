package kosa.shop.util.findpolicy;

import kosa.shop.domain.Category;
import kosa.shop.domain.Product;

public class FindProductByCategory extends FindProductPolicy{
    @Override
    public boolean compare(Product product, Object target) {
        if(target instanceof Category){
            return product.getCategory() == target;
        }
        return false;
    }
}
