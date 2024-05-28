package Mission_NumberBook;


import Mission_NumberBook.findPolicy.FindPolicy;
import Mission_NumberBook.findPolicy.NameFindPolicy;
import Mission_NumberBook.findPolicy.PhoneNumberFindPolicy;

/*
 * 	비즈니스 로직을 담당하는 클래스이다.
 * */
public class Manager {

    private PhoneInfo[] phoneInfoArray;
    private int curBookSize;
    private int maxBookSize;
    private FindPolicy findPolicy;


    /*
     * 사용자가 따로 입력하지않는다면, 10개의 size로 배열을 생성한다.
     * */
    public Manager() {
        this(10);
    }


    /*
     * 사용자가 배열의 크기를 정할 수 있다.
     * */
    public Manager(int size) {
        phoneInfoArray = new PhoneInfo[size];
        curBookSize = 0;
        maxBookSize = size;
    }

    /*
     * 사용자를 추가한다.
     * 등록할 수 있는 사용자의 수는 정해져있다. 따라서, 범위를 넘어가는 사용자는 등록할 수 없다.
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
     * 전체 사용자를 출력한다.
     * 만약 등록된 사용자가 없으면 출력할 수 없음으로 false 리턴한다.
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
     * 등록된 기준에 맞게 사용자를 찾는다.
     * */
    public PhoneInfo[] searchPhoneInfo(String target) {
        return findPolicy.findPhoneInfo(phoneInfoArray, curBookSize, target);
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
