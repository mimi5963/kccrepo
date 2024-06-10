package kosa.shop.util.sortstrategy;

import kosa.shop.domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

 class ProductSortByProductName implements ProductSort {
    
    public Collection<Product> sortProduct(Collection<Product> targets) {
        Collection<Product> temp= new ArrayList<>(targets);
                //List.copyOf(targets);
        Collections.sort((List<Product>) temp);
        return temp;
    }
}
