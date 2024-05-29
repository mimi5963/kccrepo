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
			System.out.println("게시판이 꽉 차서 더 이상 넣을 수 없습니다.");
			return false;
		} else {

			System.out.print("게시글 제목을 입력하세요 :");
			String title = sc.nextLine();
			System.out.print("게시글 작성자를 입력하세요 :");
			String name = sc.nextLine();
			System.out.print("내용을 입력하세요 :");
			String content = sc.nextLine();
			this.boards[curNum++] = new Board(boardNumberGen++, title, name, content);
			System.out.println("게시글 등록 성공! ");
			return true;

		}
	}

	public boolean updateBoard() {
		System.out.println("수정하실 글 번호를 입력해주세요");
		int findNum = Integer.parseInt(sc.nextLine());
		Board findBoard = selectBoard(findNum);
		if (findBoard == null) {
			return false;
		} else {
			System.out.print("수정할 글 제목을 입력해주세요: ");
			String newTitle = sc.nextLine();
			System.out.print("수정할 게시글 내용을 입력해주세요 :");
			String newContent = sc.nextLine();
			findBoard.setNewTitleAndContent(newTitle, newContent);
			System.out.println("게시글 수정 성공");
			return true;
		}
	}

	public boolean deleteBoard() {
		System.out.print("삭제하실 게시글의 번호를 입력해주세요 : ");
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
		 System.out.println("게시글 삭제 성공!");
			return true;
		}
	}

	public void printBoard() {
		System.out.print("출력하실 게시글의 번호를 입력해주세요 :");
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
			System.out.println("해당 번호의 게시글이 없습니다.");
		}

		return temp;
	}

	public void printAllBoard() {
		for (int i = 0; i < curNum; i++) {
			boards[i].printBoard(); //NullpointException 
		}
	}
}
