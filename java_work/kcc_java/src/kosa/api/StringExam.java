package kosa.api;

public class StringExam {
	public static void main(String[] args) {
		//1. String 객체 생성 방법 차이점 
		
		
		//문자열 부분추출 
		//퀴즈 : sql 변수 "board"문자열만 출력
		
		String sql =" SELECT * FROM BOARD WHERE BOARD.id = 1";
		
		int idx = sql.indexOf("B");
		String board = sql.substring(idx,idx+5);
		System.out.println(board);
		
		
		String[] fileName = "kosa.jpg".split(".");
		String fileName2 = "kosa.jpg";
//		String head=fileName[0];
//		String pattern = fileName[1];
		
		int idx2 =fileName2.indexOf(".");
		String head2 = fileName2.substring(0,idx2);
		String pattern2 = fileName2.substring(idx2+1);
		
		System.out.println(head2+" "+pattern2);
		
		
	}
}	
