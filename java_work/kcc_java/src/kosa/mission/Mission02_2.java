package kosa.mission;

import java.util.Scanner;

public class Mission02_2 {
	
	public static void main(String[] args) {
		//����,����,���� -> Ű����� �Է¹޾� �迭�� ����
		// �ش��ϴ� ������ ����� ������ �� �޼��� ���� ���� 
		int[] arr = new int[5];
		getScore(arr);
		getAvg(arr);
		System.out.println("����\t����\t����\t����\t���");
		for(int n : arr) {
			System.out.print(n+"\t");
		}
		
	}
	
	public static void getScore(int[] arr) {
		String[] menu = {"���� ������ �Է��� �ּ��� :","���� ������ �Է��� �ּ��� :","���� ������ �Է��� �ּ��� :"};
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