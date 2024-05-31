package missionPhoneBook;

import java.time.LocalDate;

public class Universe extends PhoneInfo{
	private String major;
	private String year;
	public Universe(String name, String phoneNumber, LocalDate birth, String major, String year) {
		super(name, phoneNumber, birth);
		this.major = major;
		this.year = year;
	}
	@Override
	public void printPhoneInfo() {
		// TODO Auto-generated method stub
		super.printPhoneInfo();
		System.out.println("major : "+major);
		System.out.println("year : "+year);
	}
	
	
	
	
}
