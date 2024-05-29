package mssionPhoneBook.findPolicy;


import missionPhoneBook.PhoneInfo;

/*
 * 휴대폰 번로를 기준으로 사용자를 찾기 위한 클래스이다.
 * 해당 클래스의 인스턴스는 한번 만들어진 후 다시 만들어질 필요 없음으로 초기화를 한번만 진행한다.
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
