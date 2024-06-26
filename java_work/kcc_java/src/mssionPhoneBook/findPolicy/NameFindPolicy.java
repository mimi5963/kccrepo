package mssionPhoneBook.findPolicy;


import missionPhoneBook.PhoneInfo;

/*
 * 이름을 기준으로 사용자를 찾기 위한 클래스이다.
 * 해당 클래스의 인스턴스는 한번 만들어진 후 다시 만들어질 필요 없음으로 초기화를 한번만 진행한다.
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
