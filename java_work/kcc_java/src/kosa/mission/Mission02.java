package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요: ");
		int korean = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수를 입력해주세요: ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수를 입력해주세요: ");
		int math = Integer.parseInt(sc.nextLine());
		
		int total = korean+eng+math;
		int avg2 = (int)(total/3.0);
		//int avg = (int)((total/3.0)*100);  
		
		
		//System.out.printf("총점 : %d 평균: %d\n",total,avg);
		//System.out.print(" 평균 : "+(avg/100.0));
		
		
		//학점 90이상이면, A -> B학점
		   // 80이상 B
		   // 70이상 C
		  // 60이상 D 
		 // 60이하 F
		
//		if(avg2 < 60) {
//			System.out.println("F");
//		}else if(avg2 <70) {
//			System.out.println("D");
//		}else if(avg2 <80) {
//			System.out.println("C");
//		}else if(avg2 <90) {
//			System.out.println("B");
//		}else if(avg2 <100) {
//			System.out.println("A");
//		}
		
		
		
	}

}
