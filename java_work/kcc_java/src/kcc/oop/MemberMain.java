package kcc.oop;

public class MemberMain {
	public static void main(String[] args) {
		
		Member m1 = new Member("���", 28, "ȫ����", "mimi5963");
		
		m1.getMemberInfo();
		
		m1.changeAddress("���빮��");
		m1.changeEmail("jaja@gamil.com");
		
		m1.getMemberInfo();
		
		Member m2 = new Member("����",26,"����","����");
	}
}
