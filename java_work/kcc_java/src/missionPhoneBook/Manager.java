package missionPhoneBook;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import mssionPhoneBook.findPolicy.FindPolicy;
import mssionPhoneBook.findPolicy.NameFindPolicy;
import mssionPhoneBook.findPolicy.PhoneNumberFindPolicy;

/*
 * 	비즈니스 로직을 담당하는 클래스이다.
 * */
public class Manager {

    //private PhoneInfo[] phoneInfoArray;
    private List<PhoneInfo> phoneInfoList;
//	private int curBookSize;
//    private int maxBookSize;
    private FindPolicy findPolicy;


    /*
     * 사용자가 따로 입력하지않는다면, 10개의 size로 배열을 생성한다.
     * */
   

    /*
     * 사용자가 배열의 크기를 정할 수 있다.
     * */
    public Manager() {
        phoneInfoList = new LinkedList<PhoneInfo>();
//        curBookSize = 0;
//        maxBookSize = size;
    }

    /*
     * 사용자를 추가한다.
     * 등록할 수 있는 사용자의 수는 정해져있다. 따라서, 범위를 넘어가는 사용자는 등록할 수 없다.
     *
     * */
    public boolean addPhoneInfo(PhoneInfo phoneInfo) {
        if (this.phoneInfoList == null) {
            return false;
        } 
        this.phoneInfoList.add(phoneInfo);
        return true;
    }

    /*
     *
     * 전체 사용자를 출력한다.
     * 만약 등록된 사용자가 없으면 출력할 수 없음으로 false 리턴한다.
     *
     * */
    public boolean listPhoneInfo() {
        if (this.phoneInfoList.size() == 0) {
            return false;
        }

//        for (int i = 0; i < curBookSize; i++) {
//            phoneInfoArray[i].printPhoneInfo();
//            System.out.println();
//        }
        Iterator<PhoneInfo> iter = this.phoneInfoList.iterator();
        while(iter.hasNext()) {
        	iter.next().printPhoneInfo();
        }
//        for(PhoneInfo p : this.phoneInfoList) {
//        	p.printPhoneInfo();
//        	System.out.println();
//        }

        return true;
    }

    /*
     * 등록된 기준에 맞게 사용자를 찾는다.
     * */
    public List<PhoneInfo> searchPhoneInfo(String target) {
        return findPolicy.findPhoneInfo(phoneInfoList, target);
    }
    
    public void searchPhoneInfos() {
    	System.out.println("이름 : ");
    	//String name = sc.nextLine();
    	int idx = -1;
    	//for문을 count 까지 돌면서 값 찾기 idx값이 계속 -1이면, 존재하지 않는다, 찾으면 바꾼다 로직
    }

    /*
     * 기준을 사용자로부터 입력받는다.
     * */
    public boolean setFindPolicy(int num) {

        switch (num) {
            case 1:
                findPolicy = NameFindPolicy.getInstance();
                break;
            case 2:
                findPolicy = PhoneNumberFindPolicy.getInstance();
                break;
            default:
                return false;
        }

        return true;
    }

}
