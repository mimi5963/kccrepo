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
		System.out.println("글 번호 :" + boardNum);
		System.out.println("게시글 제목:" + title);
		System.out.println("작성자 이름 :" + userName);
		System.out.println("글 내용 : " + content);
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
