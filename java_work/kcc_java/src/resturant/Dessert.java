package resturant;

public class Dessert extends MenuItem{
	private int extraPrice;
	private boolean glutenFree;


	public Dessert(MenuItem menuItem,int extraPrice,boolean glutenFree) {
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
		System.out.println("글루텐프리 : "+ (glutenFree == true ? "free" : "not free"));
	}
	@Override
	public int getPrice(){
		return super.getPrice()+extraPrice;
	}
}
