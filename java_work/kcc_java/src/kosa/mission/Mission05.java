package kosa.mission;

import java.util.Scanner;

public class Mission05 {	
	public static void main(String[] args) {

		//�޴��� �����ؼ� �޴� ��ɹ��� �����غ��� 
		
		Scanner sc = new Scanner(System.in);
			
		//�߰�, ���, �˻�, ���� 
		//���ڿ��� �߰��϶�°� ���Ҹ���?
		StringBuffer sb = new StringBuffer();
		
		while(true) {
		
			System.out.println("�ϰ���� �۾��� �������ּ���\n");
			System.out.println("1.�߰� 2.��� 3.�˻� 4.����");
			int input = Integer.parseInt(sc.nextLine());
			String inputString="";
			
			switch(input) {
			
			case 1:
				System.out.print("�߰� �ϰ� ���� �޴��� �Է��ϼ��� : ");
				inputString = sc.nextLine();
				sb.append(inputString+",");
				break;
			case 2:
				System.out.println("���ݱ��� �Է� ���� �޴� : "+sb.toString());
				break;
			case 3:
				System.out.print("�˻��ϰ���� �޴��� �Է��ϼ��� :");
				inputString = sc.nextLine();
				int find = sb.indexOf(inputString);
				if(find < 0) System.out.println("�ش� �޴��� �߰��� �� �����");
				else System.out.println("�ش� �޴��� �̹� �߰��Ǿ����ϴ�.");
			case 4: return;
			default:
				System.out.println("�޴��� ���� ������ �Դϴ� �ٽ� �������ּ���");
				break;
			}
			
			
			
			
			
			
//			try {
//				
//				
//				
//				
//			}catch(NumberFormatException e) {
//				
//			}
			
			
		}
		
	}
}
