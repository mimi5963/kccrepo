package mssionPhoneBook.findPolicy;


import java.util.ArrayList;
import java.util.List;

import missionPhoneBook.PhoneInfo;

/*
 * 사용자 찾기 기준을 정하는 추상 클래스이다.
 * findPhoneInfo에 정의된 내용이 사용자를 찾는 로직이다. 해당 로직에서 비교하는 부분만 다르다.
 * 따라서 이를 상속하여 compare메서드를 재정의함으로써 원하는 기준을 추가할 수 있다.
 *
 * */
abstract public class FindPolicy {


    public final List<PhoneInfo> findPhoneInfo(List<PhoneInfo> phoneInfoArray, String target) {
        List<PhoneInfo> temp = new ArrayList<>();
      
        
        for(PhoneInfo p : phoneInfoArray) {
        	if(compare(p,target)) {
        		temp.add(p);
        	}
        }

        return temp;
    }


    abstract public boolean compare(PhoneInfo phoneInfo, String target);
}
