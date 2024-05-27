package kosa.mission2;

import java.util.Scanner;

public class Mission2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[n][n];
		
		int maxNum = 0;
		
		//입력받으면서 행방향 구함
		for(int i=0; i<n;i++) {
			int sum=0;
			String[] sinput = sc.nextLine().split(" ");
			for(int j=0; j<n;j++) {
				arr[i][j] = Integer.parseInt(sinput[j]);
				sum += arr[i][j];
			}
			if(sum > maxNum) {
				maxNum = sum;
			}
		}
		
		
		//열방향 최댓값 
		for(int i=0; i<n;i++) {
			int sum=0;
			for(int j=0; j<n;j++) {
				sum += arr[j][i];
			}
			if(maxNum < sum) {
				maxNum = sum;
			}
		}
		
		//왼쪽 아래 대각선 최댓감
		int sum=0;
		for(int i=0; i<n;i++) {
			sum += arr[i][i];
		}
		if(maxNum < sum) {
			maxNum = sum;
		}
		sum=0;
		for(int i=n-1;i>=0;i--) {
			sum += arr[i][i];
		}
		if(maxNum < sum) {
			maxNum = sum;
		}
		
		System.out.println(maxNum);
		
		
		//quiz 1 2 4 5 done 
		
	}
	
	public static void ex() throws Exception{
		
	}
}
