package kosa.queueMisson;

public class Main {
	public static void main(String[] args) {
			
		
		
		//주문을 입력을 받음, 메뉴 출력
		// order 하나의 주문에 여러 주문 메뉴를 포함하고 싶음 
		  //List로 menu를 가지게 하면될 듯하다.
		//manager가 queue로 order로 가지고 있도록 하자 
		// 주문처리를 누르면 일단 맨 앞에 있는 메뉴 처리되도록하고,
		//fast order를 받아서 추가금액을 넣자!! 
		OrderManager om = new OrderManager();
		while(true) {
			System.out.println("1. 주문요청, 2.주문처리, 3. 대기주문 , 4. 매출 총액, 5. 종료");
			String input = KeyBoardInput.sc.nextLine();
			
			switch(input) {
				case "1": om.addOrder(); break;
				case "2" : om.opOrder(); break;
				case "3" :om.showWaittingList(); break;
				case "4" : om.showTotalSalse(); break;
				case "5" : return;
			}
		}
	}
}
