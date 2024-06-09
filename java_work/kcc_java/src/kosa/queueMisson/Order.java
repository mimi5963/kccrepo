package kosa.queueMisson;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Food> menuList;
	private boolean isFastOrder;
	private int orderNumber;
	private int fastOrderExtraPrice;
	public Order(int orderNumber) {
		this.menuList = new ArrayList<>();
		this.orderNumber = orderNumber;
	}
	
	public void setFastOrder(boolean isFast) {
		this.isFastOrder = true;
		setExtraPrice(10);
	}
	private void setExtraPrice(int price) {
		this.fastOrderExtraPrice = price;
	}
	
	public void addMenuToMenuList(Food menu) {
		menuList.add(menu);
	}
	public boolean getIsFastOrder() {
		return this.isFastOrder;
	}

	public int getTotalFoodPrice() {
		
		return menuList.stream().mapToInt(Food::getPrice).sum();
	}
	
	public void showOrderInfo() {
		System.out.println("-------------------------------------");
		for(Food food: menuList) {
			food.showFoodInfo();
			System.out.println("���� �ֹ� ����  : "+(isFastOrder == true ?"��":"�ƴϿ�"));
			if(isFastOrder) {
				System.out.println("�߰� �ݾ� : "+fastOrderExtraPrice);
			}
		}
		System.out.println("-------------------------------------");
	}
	
	
}