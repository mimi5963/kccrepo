package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarExam {
	public static void main(String[] args) {
		Calendar gc = Calendar.getInstance();
		
		String now = gc.get(Calendar.YEAR)+"�� "+(gc.get(Calendar.MONTH)+1)+"�� "+gc.get(Calendar.DATE)+"�� "
		+gc.get(Calendar.HOUR)+"�� "
		+gc.get(Calendar.MINUTE)+"��";
		System.out.println(now);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY�� MM�� dd��");
		
		gc.add(Calendar.DATE, 100);
		
		String future = gc.get(Calendar.YEAR)+"�� "+(gc.get(Calendar.MONTH)+1)+"�� "+gc.get(Calendar.DATE)+"�� "
				+gc.get(Calendar.HOUR)+"�� "
				+gc.get(Calendar.MINUTE)+"��";
		System.out.println(future);
		
		gc.set(2022,5,4);
		gc.add(Calendar.DATE, 1000);
		
		String str = simpleDateFormat.format(gc.getTime());
		
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("E"); 
		
		//2024���� 2030�� ���� ������ ���� �������� ã�� ���� 
		String days = "�Ͽ�ȭ�������";
		for(int i=1; i<=6;i++) {
			gc.set(2023+i, 3,2);
			//int result = gc.get(Calendar.DAY_OF_WEEK);
			//System.out.println(simpleDateFormat2.format(gc.getTime()));
			System.out.println(days.charAt(gc.get(Calendar.DAY_OF_WEEK)-1));
		}
		
	}
}