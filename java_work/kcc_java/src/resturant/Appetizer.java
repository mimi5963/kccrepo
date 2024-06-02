package resturant;

public class Appetizer extends MenuItem{
	private int extraPrice;
	private boolean zeroCalorie;
	public Appetizer(MenuItem menuItem,int extraPrice, boolean zeroCalorie) {
		super(menuItem.getName(),menuItem.getPrice(),menuItem.getDescription());

	}


	@Override
	public int calcPrice() {
		return super.calcPrice();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("추가 요금 : "+extraPrice);
		System.out.println("제로 칼로리 : "+(zeroCalorie == true ? "제로":"제로칼로리 아님"));
	}
	@Override
	public int getPrice(){
		return super.getPrice()+extraPrice;
	}
}
