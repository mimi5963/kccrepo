package mssionPhoneBook.findPolicy;


import missionPhoneBook.PhoneInfo;

/*
 * 사용자 찾기 기준을 정하는 추상 클래스이다.
 * findPhoneInfo에 정의된 내용이 사용자를 찾는 로직이다. 해당 로직에서 비교하는 부분만 다르다.
 * 따라서 이를 상속하여 compare메서드를 재정의함으로써 원하는 기준을 추가할 수 있다.
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
