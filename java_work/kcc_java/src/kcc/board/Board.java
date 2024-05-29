package kcc.board;

public class Board {
	private int boardNum;
	private String title;
	private String userName;
	private String content;

	public Board() {
	}

	public Board(int boardNum,String title, String userName, String content) {
		this.boardNum = boardNum;
		this.title = title;
		this.userName = userName;
		this.content = content;
	}

	public void printBoard() {
		System.out.println("�� ��ȣ :" + boardNum);
		System.out.println("�Խñ� ����:" + title);
		System.out.println("�ۼ��� �̸� :" + userName);
		System.out.println("�� ���� : " + content);
	}
	
	public void setNewTitleAndContent(String newTitle, String newContent) {
		this.title = newTitle;
		this.content = newContent;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public String getTitle() {
		return title;
	}

	public String getUserName() {
		return userName;
	}

	public String getContent() {
		return content;
	}

}
