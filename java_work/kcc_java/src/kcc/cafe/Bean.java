package kcc.cafe;

// 케냐원두, 에티오피아 원두 
public class Bean { //2가지 
	private String name;
	private int price;
	
	public Bean() {}
	public Bean(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void beanInfo() {
		System.out.println(name+":"+price+"원");
		
	}
}
