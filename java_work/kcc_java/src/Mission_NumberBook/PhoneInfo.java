package Mission_NumberBook;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;

import javax.xml.crypto.Data;

public class PhoneInfo {
	private static DateTimeFormatter datetimeFormatter;
	private String name;
	private final String phoneNumber;
	private LocalDate birth;

	private PhoneInfo(String name, String phoneNumber, LocalDate birth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}

	/*
	 * ��ü�� �����ϱ� ������ �Է¹��� ������ ��ȿ���� �˻��մϴ�. ���� ��ȿ�� �˻翡�� Ż���ϸ�, ��ü�� �������� �ʽ��ϴ�.
	 */
	public static PhoneInfo createPhoneInfo(String name, String phoneNumber, String birth)
	throws IllegalArgumentException, DateTimeException {

		if (datetimeFormatter == null) {
			datetimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd");
		}
		
		
		phoneValidation(phoneNumber);
		dateValidation(birth);
		

		return new PhoneInfo(name, phoneNumber, LocalDate.parse(birth, datetimeFormatter));
	}

	private static void phoneValidation(String phoneNumber) throws IllegalArgumentException{
		String[] phoneNumberArray = phoneNumber.split("-");
		if(phoneNumberArray.length != 3 || phoneNumberArray[0].length() != 3 
				|| phoneNumberArray[1].length() !=4 || phoneNumberArray[2].length() !=3 ) {
		
			throw new IllegalArgumentException();
			
		}
		
	}

	/*
	 * ����ڿ��� �Է¹��� ��¥ ���İ� ��ȿ���� �˻��մϴ�. 1. ��¥ ������ ���� ���� -> DateTimeParseException�� �߻�
	 * -> return false 2. ���ú��� �̷� ��¥�� �¾ �Է� -> return false;
	 * 
	 */
	private static void dateValidation(String birth) throws DateTimeException{
		
			LocalDate date = LocalDate.parse(birth, datetimeFormatter);

			LocalDate curDate = LocalDate.now();

			// ���� ���� ���� ��¥�� �¾ �� ����
			if (date.isAfter(curDate))
				throw new DateTimeException("�̷� ��¥�� ����� �� �����ϴ�.");

	}

	public void printPhoneInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("������� : " + birth.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));

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

}