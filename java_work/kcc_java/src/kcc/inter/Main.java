package kcc.inter;

public class Main {
	public static void main(String[] args) {
			
		
		Object[] obj = {new Reader("둘리"), new Work("길공"), new Student("마이콜")};
		
		for(int i=0; i<obj.length;i++) {
			if(obj[i] instanceof Speakable) {
				System.out.println(((Speakable)obj[i]).speak());
			}
		}
	}
}
