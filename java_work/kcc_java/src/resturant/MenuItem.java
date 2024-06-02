package resturant;

 public class MenuItem {
	private String name;
	private int price;
	private String description;

	public MenuItem(){}

	public MenuItem(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public int calcPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("name : "+name);
		System.out.println("price : "+price);
		System.out.println("description : "+description);
	}

	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}
	

	public String getDescription() {
		return description;
	}

	
	
}
