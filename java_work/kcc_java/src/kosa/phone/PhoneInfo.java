package kosa.phone;

public class PhoneInfo {

	private String name;
	private String phoneNo;
	private String birth;

	public PhoneInfo() {
	}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getBirth() {
		return birth;
	}
	
	public void show() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phoneNo);
		System.out.println("생년월일 : "+birth);
	}

}
