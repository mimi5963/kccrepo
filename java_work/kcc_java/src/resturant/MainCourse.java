package resturant;

public class MainCourse extends MenuItem {
	private int extraPrice;
	private boolean vegetarian;

	MainCourse(MenuItem menuItem, int extraPrice, boolean vegetarian){
		super(menuItem.getName(),menuItem.getPrice(),menuItem.getDescription());

	}

	@Override
	public int calcPrice() {
		return super.calcPrice()+extraPrice;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("추가 요금 : "+extraPrice);
		System.out.println("비건음식여부 : "+ (vegetarian == true ? "비건" : "비건 아님"));
	}
	@Override
	public int getPrice(){
		return super.getPrice()+extraPrice;
	}
}
