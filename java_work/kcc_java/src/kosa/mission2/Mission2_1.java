package kosa.mission2;

import java.util.Scanner;

public class Mission2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n];
		
		//�Է¹ޱ� 
		for(int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		//�ٷ� �ռ����� ū ���� ��� 
		for(int i=0; i<arr.length;i++) {
			if(i==0 || arr[i-1] < arr[i] ) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
