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
	 * 객체를 생성하기 이전에 입력받은 정보의 유효성을 검사합니다. 만약 유효성 검사에서 탈락하면, 객체를 생성하지 않습니다.
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
	 * 사용자에게 입력받은 날짜 형식과 유효성을 검사합니다. 1. 날짜 형식이 맞지 않음 -> DateTimeParseException이 발생
	 * -> return false 2. 오늘보다 미래 날짜에 태어남 입력 -> return false;
	 * 
	 */
	private static void dateValidation(String birth) throws DateTimeException{
		
			LocalDate date = LocalDate.parse(birth, datetimeFormatter);

			LocalDate curDate = LocalDate.now();

			// 오늘 보다 빠른 날짜에 태어날 수 없음
			if (date.isAfter(curDate))
				throw new DateTimeException("미래 날짜는 등록할 수 없습니다.");

	}

	public void printPhoneInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("생년월일 : " + birth.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));

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
