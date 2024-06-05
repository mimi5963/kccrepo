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
		//�޴� �� �ϳ� ���� 
		System.out.println("������ �޴� ī�װ��� ����ּ���");
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
		System.out.print("�޴� �̸��� �Է����ּ��� :");
		String name = KeyBoardInput.sc.nextLine();
		System.out.print("�޴� ������ �Է����ּ��� :");
		int price = KeyBoardInput.sc.nextInt();
		System.out.print("�޴� ������ �Է����ּ��� :");
		String description = KeyBoardInput.sc.nextLine();
		return new MenuItem(name, price, description);
	}
	
	private MenuItem createAppetizer() {
		MenuItem basic = createMenuItem();
		System.out.print("�߰� ������ �Է����ּ���");
		int extraPrice = Integer.parseInt(KeyBoardInput.sc.nextLine());
		System.out.println("���� Į�θ� ���θ� ������ �ּ���");
		System.out.print("1. ���� Į�θ�, 2. ���� Į�θ� �ƴ�");
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
		System.out.print("�߰� ������ �Է����ּ���");
		int extraPrice = Integer.parseInt(KeyBoardInput.sc.nextLine());
		System.out.println("��� ���θ� ������ �ּ���");
		System.out.print("1. ���, 2. ��� �ƴ�");
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
		System.out.print("�߰� ������ �Է����ּ���");
		int extraPrice = Integer.parseInt(KeyBoardInput.sc.nextLine());
		System.out.println("�۷��� ���� ���θ� ������ �ּ���");
		System.out.print("1. �۷��� ����, 2. �۷��� ���� �ƴ�");
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
		System.out.println("������ �޴��� �̸��� �Է����ּ���");
		String input = KeyBoardInput.sc.nextLine();
		for (MenuItem menuItem : basket) {
			if(menuItem.getName().equals(input)){
				basket.remove(menuItem);
				System.out.println("�޴� ������ �Ϸ��߽��ϴ�.");
				return;
			}
		}
		
		System.out.println("�ش� �̸��� �޴��� �����ϴ�.");
		return;
	}

	public void pay() {
		int amount=0;
		System.out.println("���� ������ �޴� ���");
		System.out.println("==================");
		for (MenuItem menuItem : basket) {
			amount += menuItem.getPrice();
			menuItem.showInfo();
		}
		System.out.println("===================");

		System.out.println("������ �Ϸ��Ͻðڽ��ϱ�?");
		System.out.print("1. ����, 2. ���Ʊ��");
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
		System.out.println("�� �Ǹ��� �޴� ");
		System.out.println("==============");
		for (MenuItem menuItem : basket) {
			menuItem.showInfo();
		}
		System.out.println("==============");
		System.out.println("�� �Ǹ��� �޴� �� : "+totalSalesMenu.size());
		System.out.println("�Ѹ��� �հ� : "+totalSales);
	}
	public void showAllMenus(){
		if(menuItemList.size() == 0){
			System.out.println("��ϵ� �޴��� �����ϴ�.");
			return;
		}
		for (MenuItem menuItem : menuItemList) {
			menuItem.showInfo();
		}

	}
}
