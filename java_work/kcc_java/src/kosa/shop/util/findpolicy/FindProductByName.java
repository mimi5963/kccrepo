package kosa.shop.util.findpolicy;

import kosa.shop.domain.Product;


 class FindProductByName extends FindProductPolicy {


    @Override
    public boolean compare(Product product, Object target) {
        if(target instanceof String){
            return product.getProductName().contains((String)target);
        }

        return false;
    }
}
