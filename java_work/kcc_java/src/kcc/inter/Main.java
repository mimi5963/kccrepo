package kcc.inter;

public class Main {
	public static void main(String[] args) {
			
		
		Object[] obj = {new Reader("�Ѹ�"), new Work("���"), new Student("������")};
		
		for(int i=0; i<obj.length;i++) {
			if(obj[i] instanceof Speakable) {
				System.out.println(((Speakable)obj[i]).speak());
			}
		}
	}
}