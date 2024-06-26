package kcc.oop;

public class Book {
	private String name;
	private int price;
	private DiscountPolicy discount;
	public Book() {}
	
	public Book(String name, int price, DiscountPolicy discountPolicy) {
		this.name = name;
		this.price = price;
		this.discount = discountPolicy;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getDiscountPrice() {
		return discount.discount(this);
	}
	
	public void printBookInfo() {
		System.out.println("책 이름 : "+this.name+" 정가 :"+this.price+" 할인된 가격: "+this.getDiscountPrice());
	}
	
}
