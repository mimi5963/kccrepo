package resturant;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<MenuItem> menuList;
	
	public Order() {
		menuList = new ArrayList<>();
	}
	
	public void addMenu() {
		//메뉴 중 하나 저장 
		System.out.println("저장할 메뉴 카테고리를 골라주세요");
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
		System.out.print("메뉴 이름을 입력해주세요 :");
		String name = KeyBoardInput.sc.nextLine();
		System.out.print("메뉴 가격을 입력해주세요 :");
		int price = KeyBoardInput.sc.nextInt();
		System.out.print("메뉴 설명을 입력해주세요 :");
		String description = KeyBoardInput.sc.nextLine();
		return new MenuItem(name, price, description);
	}
	
//	private MenuItem createAppetize() {
//		MenuItem basic = createMenuItem();
//		System.out.print("에피");
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
