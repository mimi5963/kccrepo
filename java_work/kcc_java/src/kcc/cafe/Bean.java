package kcc.cafe;

// �ɳĿ���, ��Ƽ���Ǿ� ���� 
public class Bean { //2���� 
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
		System.out.println(name+":"+price+"��");
		
	}
}