package kcc.board;

import java.util.Scanner;

public class BoardManager {
	private Board[] boards;
	private int curNum;
	private Scanner sc;
	private static int boardNumberGen;

	public BoardManager() {
		this(10);
	}

	public BoardManager(int maxNum) {
		boardNumberGen =1;
		boards = new Board[maxNum];
		curNum = 0;
		sc = new Scanner(System.in);
	}

	public boolean insertBoard() {
		if (curNum >= boards.length) {
			System.out.println("�Խ����� �� ���� �� �̻� ���� �� �����ϴ�.");
			return false;
		} else {

			System.out.print("�Խñ� ������ �Է��ϼ��� :");
			String title = sc.nextLine();
			System.out.print("�Խñ� �ۼ��ڸ� �Է��ϼ��� :");
			String name = sc.nextLine();
			System.out.print("������ �Է��ϼ��� :");
			String content = sc.nextLine();
			this.boards[curNum++] = new Board(boardNumberGen++, title, name, content);
			System.out.println("�Խñ� ��� ����! ");
			return true;

		}
	}

	public boolean updateBoard() {
		System.out.println("�����Ͻ� �� ��ȣ�� �Է����ּ���");
		int findNum = Integer.parseInt(sc.nextLine());
		Board findBoard = selectBoard(findNum);
		if (findBoard == null) {
			return false;
		} else {
			System.out.print("������ �� ������ �Է����ּ���: ");
			String newTitle = sc.nextLine();
			System.out.print("������ �Խñ� ������ �Է����ּ��� :");
			String newContent = sc.nextLine();
			findBoard.setNewTitleAndContent(newTitle, newContent);
			System.out.println("�Խñ� ���� ����");
			return true;
		}
	}

	public boolean deleteBoard() {
		System.out.print("�����Ͻ� �Խñ��� ��ȣ�� �Է����ּ��� : ");
		int deleteNum = Integer.parseInt(sc.nextLine());
		Board deleteBoard = selectBoard(deleteNum);
		if (deleteBoard == null) {
			return false;
		} else {
			// 1 3 4 null cnt -- 
			for (int i = deleteNum; i <= curNum; i++) {
				boards[i] = boards[i + 1];
			}
			this.curNum--;
		 System.out.println("�Խñ� ���� ����!");
			return true;
		}
	}

	public void printBoard() {
		System.out.print("����Ͻ� �Խñ��� ��ȣ�� �Է����ּ��� :");
		int printNum = Integer.parseInt(sc.nextLine());
		Board printBoard = selectBoard(printNum);
		if (printBoard != null) {
			printBoard.printBoard();
		}
	}

	public Board selectBoard(int boardNum) {
		Board temp = null;
		for (int i = 0; i < curNum; i++) {
			if (this.boards[i].getBoardNum() == boardNum) {
				temp = boards[i];
				break;
			}
		}

		if (temp == null) {
			System.out.println("�ش� ��ȣ�� �Խñ��� �����ϴ�.");
		}

		return temp;
	}

	public void printAllBoard() {
		for (int i = 0; i < curNum; i++) {
			boards[i].printBoard(); //NullpointException 
		}
	}
}