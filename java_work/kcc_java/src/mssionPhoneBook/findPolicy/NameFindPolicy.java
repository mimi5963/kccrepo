package mssionPhoneBook.findPolicy;


import missionPhoneBook.PhoneInfo;

/*
 * �̸��� �������� ����ڸ� ã�� ���� Ŭ�����̴�.
 * �ش� Ŭ������ �ν��Ͻ��� �ѹ� ������� �� �ٽ� ������� �ʿ� �������� �ʱ�ȭ�� �ѹ��� �����Ѵ�.
 *
 * */
public class NameFindPolicy extends FindPolicy {
    private static NameFindPolicy nameFindPolicy;

    private NameFindPolicy() {

    }

    public static NameFindPolicy getInstance() {
        if (nameFindPolicy == null) {
            nameFindPolicy = new NameFindPolicy();
        }
        return nameFindPolicy;
    }

    @Override
    public boolean compare(PhoneInfo phoneInfo, String target) {
        if (target.equals(phoneInfo.getName()))
            return true;

        return false;
    }

}