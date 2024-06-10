package mssionPhoneBook.findPolicy;


import java.util.ArrayList;
import java.util.List;

import missionPhoneBook.PhoneInfo;

/*
 * ����� ã�� ������ ���ϴ� �߻� Ŭ�����̴�.
 * findPhoneInfo�� ���ǵ� ������ ����ڸ� ã�� �����̴�. �ش� �������� ���ϴ� �κи� �ٸ���.
 * ���� �̸� ����Ͽ� compare�޼��带 �����������ν� ���ϴ� ������ �߰��� �� �ִ�.
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
