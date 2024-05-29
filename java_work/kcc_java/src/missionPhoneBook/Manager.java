package missionPhoneBook;


import mssionPhoneBook.findPolicy.FindPolicy;
import mssionPhoneBook.findPolicy.NameFindPolicy;
import mssionPhoneBook.findPolicy.PhoneNumberFindPolicy;

/*
 * 	����Ͻ� ������ ����ϴ� Ŭ�����̴�.
 * */
public class Manager {

    private PhoneInfo[] phoneInfoArray;
    private int curBookSize;
    private int maxBookSize;
    private FindPolicy findPolicy;


    /*
     * ����ڰ� ���� �Է������ʴ´ٸ�, 10���� size�� �迭�� �����Ѵ�.
     * */
    public Manager() {
        this(10);
    }


    /*
     * ����ڰ� �迭�� ũ�⸦ ���� �� �ִ�.
     * */
    public Manager(int size) {
        phoneInfoArray = new PhoneInfo[size];
        curBookSize = 0;
        maxBookSize = size;
    }

    /*
     * ����ڸ� �߰��Ѵ�.
     * ����� �� �ִ� ������� ���� �������ִ�. ����, ������ �Ѿ�� ����ڴ� ����� �� ����.
     *
     * */
    public boolean addPhoneInfo(PhoneInfo phoneInfo) {
        if (maxBookSize <= curBookSize) {
            return false;
        } else {

            phoneInfoArray[curBookSize++] = phoneInfo;
        }
        return true;
    }

    /*
     *
     * ��ü ����ڸ� ����Ѵ�.
     * ���� ��ϵ� ����ڰ� ������ ����� �� �������� false �����Ѵ�.
     *
     * */
    public boolean listPhoneInfo() {
        if (curBookSize == 0) {
            return false;
        }

        for (int i = 0; i < curBookSize; i++) {
            phoneInfoArray[i].printPhoneInfo();
            System.out.println();
        }

        return true;
    }

    /*
     * ��ϵ� ���ؿ� �°� ����ڸ� ã�´�.
     * */
    public PhoneInfo[] searchPhoneInfo(String target) {
        return findPolicy.findPhoneInfo(phoneInfoArray, curBookSize, target);
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