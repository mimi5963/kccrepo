package resturant;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<MenuItem> menuList;
	
	public Order() {
		menuList = new ArrayList<>();
	}
	
	public void addMenu() {
		//�޴� �� �ϳ� ���� 
		System.out.println("������ �޴� ī�װ��� ����ּ���");
		System.out.print("1. Appetizer, 2. MainCourse, 3. Dessert");
		String menu = KeyBoardInput.sc.nextLine();
		switch (menu) {
		case "1":
			
			break;
		case "2": 
			
			break;
			
		case "3":
			
			break;
		default:
			break;
		}
	}
	
	private MenuItem createMenuItem() {
		System.out.print("�޴� �̸��� �Է����ּ��� :");
		String name = KeyBoardInput.sc.nextLine();
		System.out.print("�޴� ������ �Է����ּ��� :");
		int price = KeyBoardInput.sc.nextInt();
		System.out.print("�޴� ������ �Է����ּ��� :");
		String description = KeyBoardInput.sc.nextLine();
		return new MenuItem(name, price, description);
	}
	
//	private MenuItem createAppetize() {
//		MenuItem basic = createMenuItem();
//		System.out.print("����");
//	}
//	
//	private MenuItem createMainCourse() {
//		
//	}
//	
//	private MenuItem createDessert() {
//		
//	}
	
	public void removeMenu() {
		
	}
	
	public void pay() {
		
	}
	
	public void totalSales() {
		
	}
}
