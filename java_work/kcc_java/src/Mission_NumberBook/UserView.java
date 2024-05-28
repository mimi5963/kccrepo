package Mission_NumberBook;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
 * 
 * */
public class UserView {

	private String[] menuList;
	private int curIdx;
	private int maxLen;

	public UserView() {
		menuList = new String[10];
		curIdx = 3;
		maxLen = 10;

		setDefaultMenu(menuList);
	}

	public void printMenu() {
		for (int i = 0; i <= curIdx; i++) {
			System.out.println((i+1) + ". " + menuList[i]);
		}
	}

	public void printInputError(String cause) {
		
	}
	
	public PhoneInfo createUserView(Scanner sc) {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		PhoneInfo userInfo = null;
		try {
			userInfo = PhoneInfo.createPhoneInfo(name, phoneNumber, birth);
		}catch(IllegalArgumentException e) {
			System.out.println("전화번호 형식이 맞지 않습니다. 010-1234-4567의 형식으로 입력해주세요");
		}catch (DateTimeException ex) {
			System.out.println("날짜 형식이 맞지 않거나, 등록할 수 없는 날짜를 입력하셨습니다. 20/01/01 형태로 입력해주세요");
		}
		return userInfo;
	}

	public void setNewMenu(String menu) {
		menuList[curIdx++] =menu;
		menuList[curIdx] = "종료";
	}
	
	private void setDefaultMenu(String[] menuList) {
		menuList[0] ="추가";
		menuList[1] ="전체출력";
		menuList[2] ="검색";
		menuList[3] ="종료";
	}
	
	

}
