package resturant;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<MenuItem> basket;
	private List<MenuItem> totalSalesMenu;
	private List<MenuItem> menuItemList;
	private int totalSales;
	
	public Order() {
		basket = new ArrayList<>();
		totalSalesMenu = new ArrayList<>();
		menuItemList = new ArrayList<>();
		totalSales = 0;
	}
	
	public void addMenu() {
		//메뉴 중 하나 저장 
		System.out.println("저장할 메뉴 카테고리를 골라주세요");
		System.out.print("1. Appetizer, 2. MainCourse, 3. Dessert");
		String menu = KeyBoardInput.sc.nextLine();

		MenuItem result=null;
		switch (menu) {
		case "1":
			result = createAppetizer();
			break;
		case "2": 
			result = createMainCourse();
			break;
			
		case "3":
		 result = createDessert();
			break;
		default:
			break;
		}
		menuItemList.add(result);
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
	
	private MenuItem createAppetizer() {
		MenuItem basic = createMenuItem();
		System.out.print("추가 가격을 입력해주세요");
		int extraPrice = Integer.parseInt(KeyBoardInput.sc.nextLine());
		System.out.println("제로 칼로리 여부를 선택해 주세요");
		System.out.print("1. 제로 칼로리, 2. 제로 칼로리 아님");
		int zero = Integer.parseInt(KeyBoardInput.sc.nextLine());

		MenuItem result=null;
		switch (zero){
			case 1 : result = new Appetizer(basic,extraPrice,true);
					 break;
			case 2 : result = new Appetizer(basic,extraPrice,false);
		}
		return result;
	}

	private MenuItem createMainCourse() {
		MenuItem basic = createMenuItem();
		System.out.print("추가 가격을 입력해주세요");
		int extraPrice = Integer.parseInt(KeyBoardInput.sc.nextLine());
		System.out.println("비건 여부를 선택해 주세요");
		System.out.print("1. 비건, 2. 비건 아님");
		int zero = Integer.parseInt(KeyBoardInput.sc.nextLine());

		MenuItem result=null;
		switch (zero){
			case 1 : result = new Appetizer(basic,extraPrice,true);
				break;
			case 2 : result = new Appetizer(basic,extraPrice,false);
		}
		return result;
	}

	private MenuItem createDessert() {
		MenuItem basic = createMenuItem();
		System.out.print("추가 가격을 입력해주세요");
		int extraPrice = Integer.parseInt(KeyBoardInput.sc.nextLine());
		System.out.println("글루텐 프리 여부를 선택해 주세요");
		System.out.print("1. 글루텐 프리, 2. 글루텐 프리 아님");
		int zero = Integer.parseInt(KeyBoardInput.sc.nextLine());
		MenuItem result=null;
		switch (zero){
			case 1 : result = new Appetizer(basic,extraPrice,true);
				break;
			case 2 : result = new Appetizer(basic,extraPrice,false);
		}
		return  result;
	}
	
	public void removeMenu() {
		System.out.println("삭제할 메뉴의 이름을 입력해주세요");
		String input = KeyBoardInput.sc.nextLine();
		for (MenuItem menuItem : basket) {
			if(menuItem.getName().equals(input)){
				basket.remove(menuItem);
				System.out.println("메뉴 삭제를 완료했습니다.");
				return;
			}
		}
		
		System.out.println("해당 이름의 메뉴는 없습니다.");
		return;
	}

	public void pay() {
		int amount=0;
		System.out.println("현재 결제할 메뉴 목록");
		System.out.println("==================");
		for (MenuItem menuItem : basket) {
			amount += menuItem.getPrice();
			menuItem.showInfo();
		}
		System.out.println("===================");

		System.out.println("결제를 완료하시겠습니까?");
		System.out.print("1. 결제, 2. 돌아기기");
		boolean paying = KeyBoardInput.sc.nextLine().equals("1") ? true :false;
		if(paying) {
			totalSales(amount);
			addBasketToTotalSalesMenuList(basket);
		}
	}

	private void addBasketToTotalSalesMenuList(List<MenuItem> basket) {
		for (MenuItem menuItem : basket) {
			totalSalesMenu.add(menuItem);
		}
		basket.clear();
	}

	public void totalSales(int amount) {
		this.totalSales+=amount;
	}
	public void totalSalesInfo(){
		System.out.println("총 판매한 메뉴 ");
		System.out.println("==============");
		for (MenuItem menuItem : basket) {
			menuItem.showInfo();
		}
		System.out.println("==============");
		System.out.println("총 판매한 메뉴 수 : "+totalSalesMenu.size());
		System.out.println("총매출 합계 : "+totalSales);
	}
	public void showAllMenus(){
		if(menuItemList.size() == 0){
			System.out.println("등록된 메뉴가 없습니다.");
			return;
		}
		for (MenuItem menuItem : menuItemList) {
			menuItem.showInfo();
		}

	}
}
