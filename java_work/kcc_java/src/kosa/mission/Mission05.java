package kosa.mission;

import java.util.Scanner;

public class Mission05 {	
	public static void main(String[] args) {

		//메뉴를 선택해서 메뉴 명령문을 실행해보자 
		
		Scanner sc = new Scanner(System.in);
			
		//추가, 출력, 검색, 종료 
		//문자열을 추가하라는게 뭔소리여?
		StringBuffer sb = new StringBuffer();
		
		while(true) {
		
			System.out.println("하고싶은 작업을 선택해주세요\n");
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			int input = Integer.parseInt(sc.nextLine());
			String inputString="";
			
			switch(input) {
			
			case 1:
				System.out.print("추가 하고 싶은 메뉴를 입력하세요 : ");
				inputString = sc.nextLine();
				sb.append(inputString+",");
				break;
			case 2:
				System.out.println("지금까지 입력 받은 메뉴 : "+sb.toString());
				break;
			case 3:
				System.out.print("검색하고싶은 메뉴를 입력하세요 :");
				inputString = sc.nextLine();
				int find = sb.indexOf(inputString);
				if(find < 0) System.out.println("해당 메뉴는 추가한 적 없어요");
				else System.out.println("해당 메뉴는 이미 추가되었습니다.");
			case 4: return;
			default:
				System.out.println("메뉴에 없는 선택지 입니다 다시 선택해주세요");
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
