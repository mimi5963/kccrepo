package kosa.shop.util.sortstrategy;

import kosa.shop.domain.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//誘몃━ 異붽��맂 諛⑹떇�쑝濡쒕쭔 �궗�슜�븯�룄濡� map�뿉 ���옣�븿

 public interface ProductSort {
    public static Map<Integer,ProductSort> productSortMap = new HashMap<>();
    
    public static void initMap() {
    	 
   productSortMap.put(1,new ProductSortByProductName());
   productSortMap.put(2,new ProductSortByHighestPrice());
   productSortMap.put(3,new ProductSortByLowestPrice());
   productSortMap.put(4,new ProductSortByProductRegistration());
    	 
    }
   
     Collection<Product> sortProduct(Collection<Product> targets);


}
