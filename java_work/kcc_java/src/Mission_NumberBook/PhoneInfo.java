package Mission_NumberBook;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class PhoneInfo {
	private String name;
	private final String phoneNumber;
	private LocalDate birth;
	
	public PhoneInfo(String name, String phoneNumber, LocalDate birth) {
		//�̸��� ������µ�, phonenumber�� birth�� �˻�����
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	
	public void printPhoneInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+phoneNumber);
	    System.out.println("������� : "+birth.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
		
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneInfo other = (PhoneInfo) obj;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}


	
	
}
