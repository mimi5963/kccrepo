package kcc.oop;

public class Member {
	//ȸ�������� ���� Ŭ������ ��ü�� ������ ����� ���ô�.
	//����
	String name;
	int age;
	String address;
	String email;
	public Member() {}  //default ������
	//�ൿ 
	public Member(String name, int age, String address, String email) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	
	public Member(String address, int age) {
		this.address = address;
		this.age = age;
	}
	
	public void changeEmail(String email) {
		this.email = email;
	}
	
	public void changeAddress(String address) {
		this.address =address;
	}
	
	public void getMemberInfo() {
		System.out.println("�̸� :"+name+"\t"+"���� :"+age+"\t"+"�ּ� :"+address+"\t"+"�̸��� : "+email);
	}
	
}
