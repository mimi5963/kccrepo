package kosa.shop.util.findpolicy;

import kosa.shop.domain.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// 찾기는 기준이 확장될 수 있다. 탬플릿 메서드 패턴  ex 이름, 가격, 이름 가격, 카테고리 가격
// 탬플릿 메서드 패턴
abstract public class FindProductPolicy {

    public final static Map<Integer,FindProductPolicy> findProductPolicyMap;
    static {
        findProductPolicyMap = new HashMap<>();
        findProductPolicyMap.put(1,new FindProductByName());
        findProductPolicyMap.put(2,new FindProductByCategoryAndName());
        findProductPolicyMap.put(3,new FindProductByCategory());
    }

    public final Collection<Product> findProduct(final Collection<Product> products, Object target){

        return products.stream().filter(product -> compare(product,target)).collect(Collectors.toList());

    }

    abstract public boolean compare(Product product,Object target);
    public boolean hook(){
        return true;
    };
}
