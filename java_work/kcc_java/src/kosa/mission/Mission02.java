package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է����ּ���: ");
		int korean = Integer.parseInt(sc.nextLine());
		System.out.print("���� ������ �Է����ּ���: ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("���� ������ �Է����ּ���: ");
		int math = Integer.parseInt(sc.nextLine());
		
		int total = korean+eng+math;
		int avg2 = (int)(total/3.0);
		//int avg = (int)((total/3.0)*100);  
		
		
		//System.out.printf("���� : %d ���: %d\n",total,avg);
		//System.out.print(" ��� : "+(avg/100.0));
		
		
		//���� 90�̻��̸�, A -> B����
		   // 80�̻� B
		   // 70�̻� C
		  // 60�̻� D 
		 // 60���� F
		
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