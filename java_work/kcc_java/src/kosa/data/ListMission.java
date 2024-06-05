package kosa.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {
	public static void main(String[] args) {
		
		//1. ������ �߰�, 2. ������ ���� 3. ������ ��� 4. ���� 
		
		List<String> StringList = new LinkedList<>();
		
		InputManager<String> ipm = new InputManager<String>(StringList);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
			
			switch(input) {
			case"1":
				ipm.addElements();
				break;
			case "2":
				ipm.removeElements();
				break;
			case "3":
				ipm.showElements();
				break;
			case "4":
				return;
			}
		}
	}
}