package mssionPhoneBook.findPolicy;


import missionPhoneBook.PhoneInfo;

/*
 * ����� ã�� ������ ���ϴ� �߻� Ŭ�����̴�.
 * findPhoneInfo�� ���ǵ� ������ ����ڸ� ã�� �����̴�. �ش� �������� ���ϴ� �κи� �ٸ���.
 * ���� �̸� ����Ͽ� compare�޼��带 �����������ν� ���ϴ� ������ �߰��� �� �ִ�.
 *
 * */
abstract public class FindPolicy {


    public final PhoneInfo[] findPhoneInfo(PhoneInfo[] phoneInfoArray, int cursize, String target) {
        PhoneInfo[] temp = new PhoneInfo[cursize];
        for (int i = 0; i <= cursize; i++) {
            if (phoneInfoArray[i] != null && compare(phoneInfoArray[i], target)) {
                temp[i] = phoneInfoArray[i];
            }
        }

        return temp;
    }


    abstract public boolean compare(PhoneInfo phoneInfo, String target);
}
