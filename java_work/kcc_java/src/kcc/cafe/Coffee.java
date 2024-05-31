package kcc.cafe;

public class Coffee {
  private String name;
  private Bean bean;
  private int price;
  
  public Coffee() {
	  
  }
  public Coffee(String name, Bean bean,int price) {
	  this.name = name;
	  this.bean = bean;
	  this.price = price;
  }
public int getPrice() {
	return this.price+bean.getPrice();
}
public void getInfo() {
	System.out.println(name+" : "+getPrice()+"원");
	bean.beanInfo();
	System.out.println("기본 가격 :"+price+"원");
	System.out.println();
}
}
