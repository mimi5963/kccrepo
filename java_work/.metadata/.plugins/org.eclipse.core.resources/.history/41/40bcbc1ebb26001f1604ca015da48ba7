package kosa.shop.util.sortstrategy;

import kosa.shop.domain.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//미리 추가된 방식으로만 사용하도록 map에 저장함

abstract public class ProductSort {
    public final static Map<Integer,ProductSort> productSortMap;
    static {
        productSortMap = new HashMap<>();
        productSortMap.put(1,new ProductSortByProductName());
        productSortMap.put(2,new ProductSortByHighestPrice());
        productSortMap.put(3,new ProductSortByLowestPrice());
        productSortMap.put(4,new ProductSortByProductRegistration());
    }
    abstract public Collection<Product> sortProduct(Collection<Product> targets);


}
