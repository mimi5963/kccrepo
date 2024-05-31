package missionPhoneBook;

import java.time.LocalDate;

public class Company extends PhoneInfo{
	
	private String dept;
	private String position;
	
	public Company() {
		
	}

	public Company(String name, String phoneNumber, LocalDate birth, String dept, String position) {
		super(name, phoneNumber, birth);
		this.dept = dept;
		this.position = position;
	}

	@Override
	public void printPhoneInfo() {
		// TODO Auto-generated method stub
		super.printPhoneInfo();
		System.out.println("dept : "+dept);
		System.out.println("position: "+position);
	}
	
	
	
	
	
	
	
}
