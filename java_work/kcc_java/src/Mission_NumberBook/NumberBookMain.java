package Mission_NumberBook;

import java.util.Scanner;

public class NumberBookMain {
	
	public static void main(String[] args) {
		//�޴� ���� ����	
		
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		UserView uv = new UserView();
		//�Է� �б� ó�� 
		// 
		while(true) {
			uv.printMenu();
			try {
			int userInput = Integer.parseInt(sc.nextLine());
			
			switch(userInput) {
			case 1: System.out.println("�޴� 1");
					PhoneInfo info = uv.createUserView(sc);
					if(info == null) continue;
					manager.addPhoneInfo(info);
					break;
			case 2: System.out.println("�޴� 2");
			  		if(!manager.listPhoneInfo()) {
			  			
			  		}
					
			}
			
			
			
			}catch(NumberFormatException e) {
				System.out.println("������ �Է����ּ���");
				continue;
			}
		}
			
	}
	
	
}
