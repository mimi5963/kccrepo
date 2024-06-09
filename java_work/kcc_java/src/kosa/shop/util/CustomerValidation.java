package kosa.shop.util;

import kosa.shop.domain.Customer;

import java.text.ParseException;
import java.util.Collection;
import java.util.Date;

public class CustomerValidation {
    public static Date nowDate = new Date();
    public static Date limitDate = new Date(1920,1,1);
    public static <T> String getValidatedCustomerId(Collection<? extends Customer> customers, String id){

        while (!isDuplicated(customers,id)){
            System.out.println("이미 등록된 아이디 입니다. 다른 id를 입력해주세요 (q 를 누르시면 메인 화면으로 돌아갑니다.)");
            id = KeyBoardInput.scanner.nextLine();
            if("q".equals(id)) return "";
        }
        return id;
    }



    public static Date getValidatedCustomerBirth(String birth) {

        Date prseDate = null;
        while ((prseDate = isValidatedDate(birth)) == null){
            System.out.println("날짜를 잘못 입력하셨습니다. (날짜 형식 혹은 현재 이후 날짜를 입력하셨는지 다시한번 확인해주세요 (q를 누르시면 메인화면으로 돌아갑니다.");
            birth = KeyBoardInput.scanner.next();
            if("q".equals(birth)){
                return null;
            }

        }
        return prseDate;
    }



    public static String getValidatedCustomerSex(String sex) {

        while (!isValidatedSex(sex)){
            System.out.println("성별을 다시 입력해주세요 (남 혹은 여로 입력해주세요 q를 누르시면 메인화면으로 돌아갑니다.) ");
            sex = KeyBoardInput.scanner.nextLine();
            if("q".equals(sex)){
                return "";
            }
        }
        return sex;

    }

    private static boolean isValidatedSex(String sex) {
        return "남".equals(sex) || "여".equals(sex);
    }
    private static boolean isDuplicated(Collection<? extends Customer> customers, String id) {
        for (Customer customer : customers) {
            if(customer.getId().equals(id)){
                return false;
            }
        }
        return true;
    }
    private static Date isValidatedDate(String birth) {
        Date parseDate = null;

        if(birth.matches("[\\d]{4}/[\\d]{1,2}/[\\d]{1,2}")){
            try {
                parseDate = DateParser.dateParser.parse(birth);
                if(parseDate.after(nowDate) || limitDate.before(parseDate)){
                    throw new ParseException("날짜 입력 오류",1);
                }
            } catch (ParseException e) {
                return parseDate;
            }
        }

        return parseDate;
    }
}
