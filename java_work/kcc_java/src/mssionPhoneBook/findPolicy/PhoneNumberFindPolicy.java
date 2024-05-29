package mssionPhoneBook.findPolicy;


import missionPhoneBook.PhoneInfo;

/*
 * �޴��� ���θ� �������� ����ڸ� ã�� ���� Ŭ�����̴�.
 * �ش� Ŭ������ �ν��Ͻ��� �ѹ� ������� �� �ٽ� ������� �ʿ� �������� �ʱ�ȭ�� �ѹ��� �����Ѵ�.
 *
 * */
public class PhoneNumberFindPolicy extends FindPolicy {

    private static PhoneNumberFindPolicy phoneNumberFindPolicy;

    private PhoneNumberFindPolicy() {

    }

    public static PhoneNumberFindPolicy getInstance() {
        if (phoneNumberFindPolicy == null) phoneNumberFindPolicy = new PhoneNumberFindPolicy();
        return phoneNumberFindPolicy;
    }

    @Override
    public boolean compare(PhoneInfo phoneInfo, String target) {
        if (target.equals(phoneInfo.getPhoneNumber()))
            return true;

        return false;
    }


}
