package kosa.mission;

import java.util.Scanner;



public class Mission04 {
	public static void main(String[] args) {

		
		//�� ������ ���ڿ��� �Է¹޾� 
		//��Ģ���� ����� ����Ͻÿ� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���");
		
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
