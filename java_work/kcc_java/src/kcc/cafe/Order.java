package kcc.cafe;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int totalPrice;
	private int salePrice;
	private int orderPrice;
	private List<Coffee> coffeeList;
	private Customer customer;
	private String date;
	private int orderNumber;
	
	public Order() {
		
	}
	
	public Order(Customer customer,int orderNumber, String date) {
		this.customer = customer;
		this.orderNumber = orderNumber;
		this.date = date;
		coffeeList = new ArrayList<>();
	}

	public void printOrder() {
		calcOrder();
		System.out.println("-----------영수증-------------");
		System.out.println();
		System.out.println("주문번호 : "+orderNumber+" 손님이름 :"+customer.getName());
		System.out.println();
		for(Coffee coffee : coffeeList) {
			coffee.getInfo();
			
		}
		
		System.out.println("-----------------------------");
		System.out.println("총가격 : "+totalPrice+"원");
		System.out.println("할인 적용 가격 : "+salePrice+"원");
		System.out.println("결제가격 : "+orderPrice+"원");
		System.out.println("-----------------------------");
		
	}
	private void calcOrder() {
		for(Coffee coffee : coffeeList) {
			totalPrice+= coffee.getPrice();
		}
		
		salePrice = customer.useCoupon(totalPrice);
		
		orderPrice = totalPrice-salePrice;
	}

	public void addCoffee(Coffee coffee) {
		coffeeList.add(coffee);
	}

	
	
	
}
