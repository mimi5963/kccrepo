package kosa.mission;

public class Mission07 {
	public static void main(String[] args) {
		
		//임의의 난수 3개를 받아서 서로 중첩되지 않고 출력하기
		
		int a1=0;
		int a2=0;
		int a3=0;
		do {
			a1 = (int)(Math.random()*9)+1;
			a2 = (int)(Math.random()*9)+1;
			a3 = (int)(Math.random()*9)+1;
		}while(a1 == a2 || a1 == a3 || a2 == a3);
		
		System.out.println(a1+", "+a2+", "+a3);
	}
}
