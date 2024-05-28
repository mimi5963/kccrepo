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
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = sc.nextLine();
		System.out.print("������� : ");
		String birth = sc.nextLine();
		PhoneInfo userInfo = null;
		try {
			userInfo = PhoneInfo.createPhoneInfo(name, phoneNumber, birth);
		}catch(IllegalArgumentException e) {
			System.out.println("��ȭ��ȣ ������ ���� �ʽ��ϴ�. 010-1234-4567�� �������� �Է����ּ���");
		}catch (DateTimeException ex) {
			System.out.println("��¥ ������ ���� �ʰų�, ����� �� ���� ��¥�� �Է��ϼ̽��ϴ�. 20/01/01 ���·� �Է����ּ���");
		}
		return userInfo;
	}

	public void setNewMenu(String menu) {
		menuList[curIdx++] =menu;
		menuList[curIdx] = "����";
	}
	
	private void setDefaultMenu(String[] menuList) {
		menuList[0] ="�߰�";
		menuList[1] ="��ü���";
		menuList[2] ="�˻�";
		menuList[3] ="����";
	}
	
	

}