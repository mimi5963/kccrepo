package kosa.mission;

import java.util.Scanner;



public class Mission04 {
	public static void main(String[] args) {

		
		//두 정수와 문자열을 입력받아 
		//사칙연산 결과를 출력하시오 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		
		int decimal1 = Integer.parseInt(sc.nextLine());
		
		int decimal2 = Integer.parseInt(sc.nextLine());
		
		String operation = sc.nextLine();
		
		int result = 0;
		
		
		if("+".equals(operation)) {
			result = decimal1+decimal2;
		}else if("-".equals(operation)) {
			result = decimal1-decimal2;
		}else if("/".equals(operation)) {
			
			result = decimal1/decimal2;
			
		}else if("*".equals(operation)) {
			result = decimal1*decimal2;
		}
		
		System.out.println(result);
		
		
	}
}
