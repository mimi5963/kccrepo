package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class DateExam {
	public static void main(String[] args) {
		//키보드 => 날짜 입력 2024/06/04
		Scanner sc = new Scanner(System.in);
		
		DateFormat dt = new SimpleDateFormat("yyyy/mm/dd");
		Date date = null;
		
		try {
			date = dt.parse("2024/06/04");
		}catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
