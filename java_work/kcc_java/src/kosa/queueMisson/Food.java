package kosa.queueMisson;

public class Food {
	
	public static Food noddle =new Food("����������",5000);
	public static Food bagle =new Food("���̱�",6000);
	public static Food Salted =new Food("�����",7000);
	public static Food Pasta =new Food("�Ľ�Ÿ",7000);
	
	
	private final String foodName;
	private final int price;
	public Food(String name, int price ) {
		this.foodName = name;
		this.price = price;
	}
	
	public String getName() {
		return foodName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public Food getFood(String name) {
		if(name.equals("noddle")) {
			return this.noddle;
		}else if(name.equals("bagle")) {
			return this.bagle;
		}else if(name.equals("salted")) {
			return this.Salted;
		}else {
			return this.Pasta;
		}
	}
	
	public void showFoodInfo() {
		System.out.println("�̸� : "+this.foodName);
		System.out.println("���� : "+this.price);
		
	}

	
}