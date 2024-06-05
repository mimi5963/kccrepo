package kosa.api;

import java.util.Calendar;

public class CalendatExam02 {
	public static void main(String[] args) {
		
		Calendar gc = Calendar.getInstance();
		
		String year = gc.get(Calendar.YEAR)+"";
		String month = (gc.get(Calendar.MONTH)+1)+"";
		gc.set(2024, 5,1);
		int firstDay = gc.get(Calendar.DAY_OF_WEEK); // 첫째날의 토
		int n = gc.getActualMaximum(Calendar.DATE);
		
		
		System.out.println();
		System.out.println("                   <"+year+"년 "+month+"월"+">");
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int line=firstDay-1;
		for(int i=1;i<=n;i++) {
			if(line%7==0) {
				System.out.println();
			}
			if(i == 1) {
			System.out.print("\t".repeat(firstDay-1)+i);	
			}else 
			System.out.print(i+"\t");
			
			line++;
			
		}
		
		
		
	}
}
