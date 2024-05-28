package kcc.oop;

public class PriceDiscount implements DiscountPolicy{
	private static PriceDiscount priceDiscount = new PriceDiscount();
	private PriceDiscount() {
		//priceDiscount = new PriceDiscount();
	}
	@Override
	public int discount(Book book) {
		int price = book.getPrice();
		if(price >=30000) {
			return (int)(price*0.75);
		}else if(price >= 20000) {
			return (int)(price*0.80);
		}else if(price >=15000) {
			return (int)(price*0.85);
		}else return price;
		
	}
	
	public static PriceDiscount getInstance() {
		return priceDiscount;
	}

}
