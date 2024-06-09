package kosa.shop.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderItem> items;
    private Customer customer;

    public Order(){

    }
    public Order(int orderNum, Customer customer){
        items = new ArrayList<>();
        this.orderNum =orderNum;
        this.customer = customer;
    }
    public int getOrderNum() {
        return orderNum;
    }
    public void addOrderItem(OrderItem orderItem){
        items.add(orderItem);
    }

    public boolean isCurCustomerOrder(Customer customer){
        return this.customer == customer;
    }

    public void showInfo() {
        System.out.println("주문번호:"+orderNum+"[" +
                "주문자"+customer.getName()+"" +
                "]");
        System.out.println("주문 상품 목록");
        for (OrderItem item : items) {
            System.out.println("--------------------------");
            item.showInfo();
            System.out.println("--------------------------");
        }
    }
}
