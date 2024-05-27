package kosa.mission2;

import java.util.Scanner;

public class Mission2_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//앞에 서있는 사람들보다 크면 보이고 작거나 같으면 보이지 않는다.
		int maxidx =0;
		int cnt=1;
		for(int i=1; i<arr.length;i++) {
			if(arr[i-1] < arr[i] && arr[maxidx] <= arr[i]) {
				cnt++;
			}
			if(arr[i] > arr[maxidx]) {
				maxidx=i;
			}
		}
		
		//앞에 서있는 사람들보다 크면 보이고 작거나 같으면 보이지 않습니다.
		System.out.println(cnt);
		
		
		
	}
	
	public void name(Mission2_2 hi) {
		
	}
}
