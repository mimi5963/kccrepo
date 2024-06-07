package missionPhoneBook;

import java.util.Scanner;


public class PhoneBookMain {
    private static UserFormView userFormView;
    //private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        //메뉴 선택 로직

        String[] menuList = preprocess();


        //입력 분기 처리
        boolean result = false;
        System.out.println("안녕하세요 전화번호북 프로그램을 시작합니다.");
        while (true) {
            printMenu(menuList);
            try {
                int userInput = Integer.parseInt(DataInput.sc.nextLine());

                switch (userInput) {
                    case 1:
                        System.out.println(">메뉴 1");
                        result = userFormView.createUserFormView();
                        break;
                    case 2:
                        System.out.println(">메뉴 2");
                        userFormView.printAllPhoneInfo();
                        break;
                    case 3:
                        System.out.println(">메뉴 3");
                        userFormView.findPhoneInfo();
                        break;
                    case 4:
                    	System.out.println(">메뉴 4");
                    	userFormView.updatePhoneInfo();
                    	break;
                    case 5:
                    	System.out.println(">메뉴 5");
                    	userFormView.deletePhoneInfo();
                    	break;
                    case 6:	
                    	 System.out.println(">메뉴 6");
                    	 userFormView.sort();
                         
                    case 7:
                    	System.out.println(">메뉴7");
                    	 System.out.println(">프로그램을 종료합니다.");
                         return;
                    default:
                        System.out.println("메뉴에 있는 기능만 선택 가능합니다.");

                }
            } catch (NumberFormatException e) {
                System.out.println("error! 정수로 입력해주세요");
                continue;
            }
        }

    }

    private static void printMenu(String[] menu) {
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + "." + menu[i]);
        }
        System.out.println();
    }

    private static String[] preprocess() {
        userFormView = new UserFormView(new Manager());
        
        return new String[]{"추가", "전체출력", "검색","수정","삭제","정렬","종료"};
    }


}
