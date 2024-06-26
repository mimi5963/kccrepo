package kcc.cafe;

import java.util.Scanner;

public class Kiosk_Main {
	
	private static Coffee[] coffees = new Coffee[2]; 
	private static int orderNumber=0;
	public static void main(String[] args) {
		
		preprocess();
		
		
		//손님 생성
		Customer customer = new Customer("장원");
		
		//주문 생성 
		Order order = new Order(customer,++orderNumber,"24-05-30");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("커피를 선택해 주세요");
			System.out.println("커피를 선택해 주세요 1. 아메리카노 2. 카라멜 마끼야또 3. 종료 : ");
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
				System.out.println("종료");
				return; 
			}
		}
		
	}
	
	public static void preprocess() {
		//커피생성
		coffees[0] = new Coffee("아메리카노",new Bean("케냐",500),2000); 
		coffees[1] = new Coffee("카라멜마키야또",new Bean("에티오피아",600),2400); 
		
	}
	
	
}
