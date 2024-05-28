package Mission_NumberBook;


/*
 * ����� ã�� ������ ���ϴ� �߻� Ŭ�����̴�.
 * findPhoneInfo�� ���ǵ� ������ ����ڸ� ã�� �����̴�. �ش� �������� ���ϴ� �κи� �ٸ���.
 * ���� �̸� ����Ͽ� compare�޼��带 �����������ν� ���ϴ� ������ �߰��� �� �ִ�.
 * 
 * */
abstract public class FindPolicy {
	
	
	
	public final PhoneInfo findPhoneInfo(PhoneInfo[] phoneInfoArray, int cursize, String target) {
		
		for(int i=0; i<=cursize;i++) {
			if(compare(phoneInfoArray[i],target)) {
				return phoneInfoArray[i];
			}
		}
		
		return null;
	}
	
	
	
	abstract public boolean compare(PhoneInfo phoneInfo, String target);
}
