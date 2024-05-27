package kosa.mission2;

import java.util.Scanner;

public class Mission2_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		while(cnt++ < n) {
			int day=0;
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			while(n1 >= n2) {
				n1 *=2;
				n2 *=3;
				day++;
			}
			
			System.out.println("# "+cnt+" "+day);
		}
	}
	
}
