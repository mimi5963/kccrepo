package kosa.mission2;

import java.util.Scanner;

public class Mission2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n];
		
		//입력받기 
		for(int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		//바로 앞수보다 큰 수만 출력 
		for(int i=0; i<arr.length;i++) {
			if(i==0 || arr[i-1] < arr[i] ) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
