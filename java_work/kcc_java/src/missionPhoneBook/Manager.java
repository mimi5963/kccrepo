package missionPhoneBook;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import mssionPhoneBook.findPolicy.FindPolicy;
import mssionPhoneBook.findPolicy.NameFindPolicy;
import mssionPhoneBook.findPolicy.PhoneNumberFindPolicy;

/*
 * 	����Ͻ� ������ ����ϴ� Ŭ�����̴�.
 * */
public class Manager {

    //private PhoneInfo[] phoneInfoArray;
    private List<PhoneInfo> phoneInfoList;
//	private int curBookSize;
//    private int maxBookSize;
    private FindPolicy findPolicy;


    /*
     * ����ڰ� ���� �Է������ʴ´ٸ�, 10���� size�� �迭�� �����Ѵ�.
     * */
   

    /*
     * ����ڰ� �迭�� ũ�⸦ ���� �� �ִ�.
     * */
    public Manager() {
        phoneInfoList = new LinkedList<PhoneInfo>();
//        curBookSize = 0;
//        maxBookSize = size;
    }

    /*
     * ����ڸ� �߰��Ѵ�.
     * ����� �� �ִ� ������� ���� �������ִ�. ����, ������ �Ѿ�� ����ڴ� ����� �� ����.
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
     * ��ü ����ڸ� ����Ѵ�.
     * ���� ��ϵ� ����ڰ� ������ ����� �� �������� false �����Ѵ�.
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
     * ��ϵ� ���ؿ� �°� ����ڸ� ã�´�.
     * */
    public List<PhoneInfo> searchPhoneInfo(String target) {
        return findPolicy.findPhoneInfo(phoneInfoList, target);
    }
    
    public void searchPhoneInfos() {
    	System.out.println("�̸� : ");
    	//String name = sc.nextLine();
    	int idx = -1;
    	//for���� count ���� ���鼭 �� ã�� idx���� ��� -1�̸�, �������� �ʴ´�, ã���� �ٲ۴� ����
    }

    /*
     * ������ ����ڷκ��� �Է¹޴´�.
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
