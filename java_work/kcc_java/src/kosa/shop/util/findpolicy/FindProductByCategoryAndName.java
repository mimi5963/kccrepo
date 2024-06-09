package kosa.shop.util.findpolicy;

import kosa.shop.domain.Category;
import kosa.shop.domain.Product;


class FindProductByCategoryAndName extends FindProductPolicy {

    @Override
    public boolean compare(Product product, Object target) {
        if(target instanceof CategoryAndName){
            return product.getCategory() == ((CategoryAndName) target).category && product.getProductName().contains(((CategoryAndName)target).productName);
        }
        return false;
    }

    public static class CategoryAndName{
        private String productName;
        private Category category;

        public CategoryAndName(String productName, Category category){
            this.productName = productName;
            this.category = category;
        }


    }
}
