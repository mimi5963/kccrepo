package kcc.cafe;

import java.util.Scanner;

public class Kiosk_Main {
	
	private static Coffee[] coffees = new Coffee[2]; 
	private static int orderNumber=0;
	public static void main(String[] args) {
		
		preprocess();
		
		
		//�մ� ����
		Customer customer = new Customer("���");
		
		//�ֹ� ���� 
		Order order = new Order(customer,++orderNumber,"24-05-30");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Ŀ�Ǹ� ������ �ּ���");
			System.out.println("Ŀ�Ǹ� ������ �ּ��� 1. �Ƹ޸�ī�� 2. ī��� �����߶� 3. ���� : ");
			String input =sc.nextLine();
			
			switch (input) {
			case "1":
				order.addCoffee(coffees[0]);
				break;
			case "2":
				order.addCoffee(coffees[1]);
				break;
			case "3":
				order.printOrder();
				System.out.println("����");
				return; 
			}
		}
		
	}
	
	public static void preprocess() {
		//Ŀ�ǻ���
		coffees[0] = new Coffee("�Ƹ޸�ī��",new Bean("�ɳ�",500),2000); 
		coffees[1] = new Coffee("ī��ḶŰ�߶�",new Bean("��Ƽ���Ǿ�",600),2400); 
		
	}
	
	
}