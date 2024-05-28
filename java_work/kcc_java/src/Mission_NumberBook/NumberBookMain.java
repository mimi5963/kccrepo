package Mission_NumberBook;

import java.util.Scanner;

public class NumberBookMain {
	
	public static void main(String[] args) {
		//메뉴 선택 로직	
		
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		UserView uv = new UserView();
		//입력 분기 처리 
		// 
		while(true) {
			uv.printMenu();
			try {
			int userInput = Integer.parseInt(sc.nextLine());
			
			switch(userInput) {
			case 1: System.out.println("메뉴 1");
					PhoneInfo info = uv.createUserView(sc);
					if(info == null) continue;
					manager.addPhoneInfo(info);
					break;
			case 2: System.out.println("메뉴 2");
			  		if(!manager.listPhoneInfo()) {
			  			
			  		}
					
			}
			
			
			
			}catch(NumberFormatException e) {
				System.out.println("정수로 입력해주세요");
				continue;
			}
		}
			
	}
	
	
}
