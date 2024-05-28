package kcc.oop;

public class Member {
	//회원정보에 대한 클래스와 객체를 생성후 출력해 봅시다.
	//상태
	String name;
	int age;
	String address;
	String email;
	public Member() {}  //default 생성자
	//행동 
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
		System.out.println("이름 :"+name+"\t"+"나이 :"+age+"\t"+"주소 :"+address+"\t"+"이메일 : "+email);
	}
	
}
