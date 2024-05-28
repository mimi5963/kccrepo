package Mission_NumberBook;

import java.util.Optional;

public class Manager {
	//비즈니스 로직
	private PhoneInfo[] phoneInfos;
	private int curBookSize;
	private int maxBookSize;
	//기본 10개 생성
	public Manager() {
		this(10);
	}
	//사용자가 정할 수 있음
	public Manager(int size) {
		phoneInfos = new PhoneInfo[size];
		curBookSize=0;
		maxBookSize=size;
	}
	
	//추가가 안된다면 이유를 알아야해서 boolean
	public boolean addPhoneInfo(PhoneInfo phoneInfo) {
		if(maxBookSize <= curBookSize) {
			return false;
		}else {
			
			phoneInfos[curBookSize++] = phoneInfo;
		}
		return true;
	}
	
	//출력이 안된다면 이유를 알아야해서 boolean
	public boolean listPhoneInfo() {
		if(curBookSize == 0) {
			return false;
		}
		
		for (int i = 0; i < curBookSize; i++) {
			phoneInfos[i].printPhoneInfo();
		}
		
		return true;
	}
	
	//찾을 수 없다 있다 알려줘야함
	public PhoneInfo searchPhoneInfo(String phoneNumebr) {
		
		
		
		return null;
	}
	
	
}
