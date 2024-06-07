package kosa.queueMisson;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {
	private Deque<Order> orderQueue;
	private int totalSales;
	private static int orderNumber;
	public OrderManager() {
		this.orderQueue = new LinkedList<>();
		this.totalSales=0;
	}
	
	public void addOrder() {
		Order order=new Order(++this.orderNumber);
		
		
		
		add:while(true) {
		System.out.print("주문하실 메뉴를 골라주세요");
		System.out.println("1.김종수의 황금산 열무 막국수, 2.박석철의 서산 쌀 베이글, 3. 김귀순의 서산육쪽마늘 알리오올리오 4. 최석현의 서산간월도 어리굴젓  5. 종료");
		
		switch(KeyBoardInput.sc.nextLine()){
		case "1":
			order.addMenuToMenuList(Food.noddle);
			break;
		case "2":
			order.addMenuToMenuList(Food.bagle);
			break;
		case "3":
			order.addMenuToMenuList(Food.Pasta);
			break;
		case "4":
			order.addMenuToMenuList(Food.Salted);
			break;
		case "5":
			break add;
			}
		}
		
		System.out.println("빠른 주문을 신청하시겠습니까? 1. 예 , 2. 아니오");
		if(KeyBoardInput.sc.nextLine().equals("1")) {
			order.setFastOrder(true);
		}
		
		
		if(order.getIsFastOrder()) {
			orderQueue.addFirst(order);
			return;
		}
		orderQueue.addLast(order);
	}
	
	public boolean opOrder() {
		if(orderQueue.isEmpty()) {
			return false;
		}
		addTotalSalse(orderQueue.pop());
		return true;
	}
	private void addTotalSalse(Order order) {
		this.totalSales += order.getTotalFoodPrice();
	}
	
	public void showWaittingList() {
		if(orderQueue.isEmpty()) {
			System.out.println("대기 중인 주문이 없습니다.");
		}
		System.out.println("대기 주문 수 : "+orderQueue.size());
		for(Order o : orderQueue) {
			o.showOrderInfo();
		}
		
	}

	public void showTotalSalse() {
		System.out.println("총 매출액은 : "+totalSales+"입니다.");
		
	}
}
