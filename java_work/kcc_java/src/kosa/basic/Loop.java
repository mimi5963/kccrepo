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
//			System.out.print("입력");
//			n = sc.nextInt();
//		}while(n<0);
//		
//		System.out.println("입력 결과: "+n);
//		
		//퀴즈> 2개의 정수 입력받아 b-a 결과를 출력하자 
		//b가 a보다 크도록 입력 받아야함 a가 b보다 크면 새로 입력을 받자
		
//		int a=0;
//		int b=0;
//		
//		do {
//			System.out.print("a를 입력해주세요 : ");
//			a = Integer.parseInt(sc.nextLine());
//			System.out.print("b를 입력해주세요 : ");
//			b = Integer.parseInt(sc.nextLine());
//		}while(b>a);
		
		 
		
		//퀴즈 4x+5y = 60이 나올 수 있는 모든 해를 구해라 (모든 경우의 수) 
		
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
