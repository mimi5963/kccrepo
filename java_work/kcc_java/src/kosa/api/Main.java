package kosa.api;

public class Main {
	public static void main(String[] args) {
			Person p1 = new Person("ȫ�浿",20);
			Person p2 = new Person("ȫ�浿",20);
			
			if(p1 == p2) {
				System.out.println("����");
			}else {
				System.out.println("�ٸ���");
			}
			
			
			//���� �����~~~? 
			String s = "abc"; //  > ���Ǯ  �����޷� "abc"
			String s2 ="abc";
			
			String s3 = new String("abc");
			String s4 = new String("abc");
			
			if(s == s2) {
				System.out.println("����");
			}else {
				System.out.println("�ٸ���");
			}
			
	}
}