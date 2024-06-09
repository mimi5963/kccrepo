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
		System.out.print("�ֹ��Ͻ� �޴��� ����ּ���");
		System.out.println("1.�������� Ȳ�ݻ� ���� ������, 2.�ڼ�ö�� ���� �� ���̱�, 3. ��ͼ��� �������ʸ��� �˸����ø��� 4. �ּ����� ���갣���� �����  5. ����");
		
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
		
		System.out.println("���� �ֹ��� ��û�Ͻðڽ��ϱ�? 1. �� , 2. �ƴϿ�");
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
			System.out.println("��� ���� �ֹ��� �����ϴ�.");
		}
		System.out.println("��� �ֹ� �� : "+orderQueue.size());
		for(Order o : orderQueue) {
			o.showOrderInfo();
		}
		
	}

	public void showTotalSalse() {
		System.out.println("�� ������� : "+totalSales+"�Դϴ�.");
		
	}
}