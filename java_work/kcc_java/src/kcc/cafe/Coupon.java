package kcc.cafe;

public class Coupon {
	private String name;
	private double rate;
	
	public Coupon() {
		
	}
	public Coupon(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}
	public double getRate() {
		
		return this.rate;
	}
}
