package kosa.mission2;

import java.util.Arrays;
import java.util.Scanner;

public class Mission2_5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String result="";
		
		for(char ch : input.toCharArray()) {
			if(Character.isDigit(ch)) {
				result += ch+"";
			}
		}
		
		int decimalResult=0;
		int len = result.length();
		for(int i=0;i<len;i++) {
			decimalResult *= 10;
			decimalResult += Integer.parseInt(result.charAt(i)+"");
		}
		
		System.out.println(decimalResult);
		
		
		
		 
		
		
	}
	
}
