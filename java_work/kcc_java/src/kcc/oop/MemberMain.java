package kcc.oop;

public class MemberMain {
	public static void main(String[] args) {
		
		Member m1 = new Member("장원", 28, "홍제동", "mimi5963");
		
		m1.getMemberInfo();
		
		m1.changeAddress("서대문구");
		m1.changeEmail("jaja@gamil.com");
		
		m1.getMemberInfo();
		
		Member m2 = new Member("상학",26,"몰루","몰루");
	}
}
