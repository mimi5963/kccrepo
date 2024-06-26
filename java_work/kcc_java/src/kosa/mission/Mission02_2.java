package kosa.mission;

import java.util.Scanner;

public class Mission02_2 {
	
	public static void main(String[] args) {
		//국어,영어,수학 -> 키보드로 입력받아 배열로 구현
		// 해당하는 총점과 평균을 구현할 때 메서드 정의 구현 
		int[] arr = new int[5];
		getScore(arr);
		getAvg(arr);
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int n : arr) {
			System.out.print(n+"\t");
		}
		
	}
	
	public static void getScore(int[] arr) {
		String[] menu = {"국어 점수를 입력해 주세요 :","영어 점수를 입력해 주세요 :","수학 점수를 입력해 주세요 :"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3;i++) {
			System.out.print(menu[i]);
			arr[i] = Integer.parseInt(sc.nextLine());
			arr[3] += arr[i];
		}
	}
	
	public static int getTotalScore(int[] arr) {
		int total=0;
		for(int sc : arr) {
			total += sc;
		}
		return total;
	}
	
	public static void getAvg(int[] arr) {
		arr[4] = arr[3]/3;
	}
	
}
