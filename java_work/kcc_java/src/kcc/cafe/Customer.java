package kcc.cafe;

public class Customer {
	private String name;
	private Coupon coupon;
	
	
	public Customer() {}
	public Customer(String name) {
		this.name = name;
		this.coupon = createCoupon();
	}
	
	//���� ���� 
	private Coupon createCoupon() {
		//���� �������� ���� ��
		return new Coupon("����������",0.1);
	}
	public int useCoupon(int totalPrice) {
		return (int)(totalPrice*coupon.getRate());
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}