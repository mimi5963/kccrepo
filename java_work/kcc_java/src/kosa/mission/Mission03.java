package kosa.mission;

import java.util.Scanner;

public class Mission03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int odd = 0;
		int even = 0;
//		for (char ch : input.toCharArray()) {
//			if ((ch - '0') % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//		}
//
//		System.out.println("Â¦¼ö : " + even);
//		System.out.println("È¦¼ö : " + odd);
		
		even += ((input /10000)%2 == 0) ? 1:0;
		even += ((input)/1000 %10 %2 ==0) ? 1:0;
		//.. ¹Ýº¹
	}
}
