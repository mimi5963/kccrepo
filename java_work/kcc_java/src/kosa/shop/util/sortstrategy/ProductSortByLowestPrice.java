package kosa.shop.util.sortstrategy;

import kosa.shop.domain.Product;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class ProductSortByLowestPrice implements ProductSort {
   
    public Collection<Product> sortProduct(Collection<Product> targets) {
        Collection<Product> temp= List.copyOf(targets);

        return temp.stream()
                .sorted((o1, o2) -> {
                    return Integer.compare(o1.getPrice(), o2.getPrice());})
                .collect(Collectors.toList());
    }
}
