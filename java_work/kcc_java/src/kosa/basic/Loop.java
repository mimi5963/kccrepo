package kosa.basic;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {

//		int i=1;
//		
//		while(i<=9) {
//			System.out.println("7 * "+i+" = "+(7*i));
//			i++;
//		}
//		
//		
		Scanner sc = new Scanner(System.in);
//		int n =0;
//		do {
//			System.out.print("�Է�");
//			n = sc.nextInt();
//		}while(n<0);
//		
//		System.out.println("�Է� ���: "+n);
//		
		//����> 2���� ���� �Է¹޾� b-a ����� ������� 
		//b�� a���� ũ���� �Է� �޾ƾ��� a�� b���� ũ�� ���� �Է��� ����
		
//		int a=0;
//		int b=0;
//		
//		do {
//			System.out.print("a�� �Է����ּ��� : ");
//			a = Integer.parseInt(sc.nextLine());
//			System.out.print("b�� �Է����ּ��� : ");
//			b = Integer.parseInt(sc.nextLine());
//		}while(b>a);
		
		 
		
		//���� 4x+5y = 60�� ���� �� �ִ� ��� �ظ� ���ض� (��� ����� ��) 
		
//		for(int x=0; x<=15; x++) {
//			for(int y=0;y<=12;y++) {
//				if(4*x + 5*y == 60) {
//					System.out.println(x+", "+y);
//				}
//			}
//		}
		
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=5; i>0; i--) {
			for(int j=i; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}