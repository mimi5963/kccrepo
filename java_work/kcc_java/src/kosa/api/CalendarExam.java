package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarExam {
	public static void main(String[] args) {
		Calendar gc = Calendar.getInstance();
		
		String now = gc.get(Calendar.YEAR)+"년 "+(gc.get(Calendar.MONTH)+1)+"월 "+gc.get(Calendar.DATE)+"일 "
		+gc.get(Calendar.HOUR)+"시 "
		+gc.get(Calendar.MINUTE)+"분";
		System.out.println(now);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY년 MM월 dd일");
		
		gc.add(Calendar.DATE, 100);
		
		String future = gc.get(Calendar.YEAR)+"년 "+(gc.get(Calendar.MONTH)+1)+"월 "+gc.get(Calendar.DATE)+"일 "
				+gc.get(Calendar.HOUR)+"시 "
				+gc.get(Calendar.MINUTE)+"분";
		System.out.println(future);
		
		gc.set(2022,5,4);
		gc.add(Calendar.DATE, 1000);
		
		String str = simpleDateFormat.format(gc.getTime());
		
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("E"); 
		
		//2024부터 2030년 까지 생일이 무슨 요일인지 찾아 내라 
		String days = "일월화수목금토";
		for(int i=1; i<=6;i++) {
			gc.set(2023+i, 3,2);
			//int result = gc.get(Calendar.DAY_OF_WEEK);
			//System.out.println(simpleDateFormat2.format(gc.getTime()));
			System.out.println(days.charAt(gc.get(Calendar.DAY_OF_WEEK)-1));
		}
		
	}
}
