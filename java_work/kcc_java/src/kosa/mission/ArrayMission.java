package kosa.mission;

public class ArrayMission {

	public static void main(String[] args) {
			
		
		int number = 5;
		
		// 1~5, 6~10 �̷��� ���
		for(int i=0; i<number;i++) {
			for(int j=(i*number)+1; j<= (i+1)*number;j++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		// 21 ~25 ���� ���
		
		//5*3+1
		
		for(int i=number;i>0;i--) {
			for(int j=number*(i-1)+1;j<=number*i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//1,3,5,7,9
		//Ȧ���� ��� 
		for(int i=0;i<number;i++) {
			for(int j=(10*i)+1; j<10*(i+1);j++) {
				if(j%2 !=0)System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//1 -> 2,3 ,4,5,6
		System.out.println();
		int cnt=1;
		for(int i=0; i<number;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(cnt++ +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<number;i++) {
			for(int j=1;j<=number-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int cnt2=1;
		for(int i=number; i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(cnt2++ +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<number;i++) {
			for(int j=0; j<number;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<number;i++) {
			for(int j=0;j<(number-1)-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//��
		for(int i=0; i<number;i++) {
			for(int j=0; j<(number-1)-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//���̾� 
		for(int i=0; i<number;i++) {
			for(int j=0; j<(number-1)-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=number; i>0;i--) {
			for(int j=0; j<=(number-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<((i-2)*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		//���̾� ���� �ΰ� 
		
		
			
			
			
			
			
			
			
		}
		
		
		
	}
