package kosa.mission;

public class Mission06 {
	public static void main(String[] args) {
		
		//1~100RKwl 2�� ����� 3�� ����� �ƴ� ���ڸ� ����Ͻÿ� 
		
		boolean[] checked = new boolean[101];
		
		for(int i=1; i<=100;i++) {
			if((i%2==0)||(i%3==0))
				continue;
			
		}
		
		for(int i=2; i<=100;i++) {
			if(i%2 ==0 || i%3==0)checked[i] = true;
			
		}
		
		for(int i=2; i<=100;i++) {
			if(!checked[i]) System.out.print(i+" ");
		}
		
		
	}
}