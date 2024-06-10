package kosa.shop.util.sortstrategy;

import kosa.shop.domain.Product;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class ProductSortByProductRegistration implements ProductSort {
    public Collection<Product> sortProduct(Collection<Product> targets) {
        Collection<Product> temp= List.copyOf(targets);

        return temp.stream()
                .sorted(Comparator.comparing(Product::getRegDate))
                .collect(Collectors.toList());
    }
}
