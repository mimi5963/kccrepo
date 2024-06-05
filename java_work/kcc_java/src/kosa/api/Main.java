package kosa.api;

public class Main {
	public static void main(String[] args) {
			Person p1 = new Person("홍길동",20);
			Person p2 = new Person("홍길동",20);
			
			if(p1 == p2) {
				System.out.println("같다");
			}else {
				System.out.println("다르다");
			}
			
			
			//문자 상수라~~~? 
			String s = "abc"; //  > 상수풀  정적메뢰 "abc"
			String s2 ="abc";
			
			String s3 = new String("abc");
			String s4 = new String("abc");
			
			if(s == s2) {
				System.out.println("같다");
			}else {
				System.out.println("다르다");
			}
			
	}
}
