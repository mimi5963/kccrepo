package kcc.board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		BoardManager bm = new BoardManager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printMenu();
			String input = sc.nextLine();
			
			switch(input) {
			case "1": bm.insertBoard();
					  break;
			case "2": bm.printBoard();
					  break;
					
			case "3": bm.printAllBoard();
					  break;
			case "4": bm.updateBoard();
					  break;
			case "5": bm.deleteBoard();
					  break;
			case "6": return;	
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("1.�Խñ� ���, 2.�Խñ� ����,3.��� �Խñ� ����,4.�Խñ� ����,5.�Խñ� ����,6.����");
	}
}
