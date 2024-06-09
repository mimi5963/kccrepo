package kosa.shop.domain;

import kosa.shop.domain.Order;
import kosa.shop.domain.Product;
import kosa.shop.util.DateParser;

public class OrderItem {
    private static int orderItemNumCount=0;
    private int orderItemNum;
    private Product product;
    private Order order;
    private int orderPrice;
    private int count;

    public OrderItem(){}
    public OrderItem(Product product, Order order, int count){
        this.orderItemNum = ++OrderItem.orderItemNumCount;
        this.order =order;
        this.count =count;
        this.product =product;
    }
    public int getTotalOrderPrice(){
        return 0;
    }
    public void showInfo(){

        System.out.println("상품명 : "+product.getProductName());
        System.out.println("총 주문 가격 : "+product.getPrice()*this.count);
        System.out.println("상품 등록일 : "+ DateParser.dateParser.format(product.getRegDate()));
        System.out.println("카테고리 : "+product.getCategory().getCategoryName());

    }
}
