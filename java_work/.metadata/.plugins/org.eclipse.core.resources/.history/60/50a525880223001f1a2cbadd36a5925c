package missionPhoneBook;

import java.time.DateTimeException;
import java.util.Scanner;

import javax.xml.crypto.Data;

/*
 *  사용자 입력을 받을 수 있는 뷰와 입력에 따른 처리 결과를 알려주는 클래스이다.
 * */
public class UserFormView {

    private Manager manager;
    private final String FAILMESSAGE = "> 전화번호 등록에 실패 했습니다 :";
    
    public UserFormView(Manager manager) {
        this.manager = manager;
    }

    
    public boolean createUserFormView() {
    	System.out.println("추가 번호의 그룹을 선택해 주세요");
    	System.out.print("1. 일반, 2.회사, 3.동창");
    	String input = DataInput.sc.nextLine();
    	
    	PhoneInfo info = null;
    	switch (input) {
		case "1":
			info= createUser();
			
			break;
		case "2":
			info = createCompany();
			
			break;
		case "3":
			info = createUniverse();
			break;
		
		}
    	
    	boolean result = manager.addPhoneInfo(info);
    	
    	if (!result) {
          System.out.println(FAILMESSAGE + "전화번호부가 꽉 찼습니다.");
      } else {
          System.out.println(">전화번호 등록에 성공했습니다.");
      }
    	
    	
    	return result;
    	
    	
    }
    
    private PhoneInfo createUniverse() {
    	
    	PhoneInfo info = createUser();
    	
		System.out.print("전공을 입력해주세요 : ");
		String major = DataInput.sc.nextLine();
		System.out.print("학번을 입력해주세요 : ");
		String year = DataInput.sc.nextLine();
		
		return new Universe(info.getName(), info.getPhoneNumber(), info.getBirth(), major, year);
	}


	private PhoneInfo createCompany() {
		
		PhoneInfo info = createUser();
		
		System.out.print("부서를 입력해주세요 : ");
		String dept = DataInput.sc.nextLine();
		System.out.print("직책을 입력해주세요 : ");
		String position = DataInput.sc.nextLine();
		
		return new Company(info.getName(),info.getPhoneNumber(),info.getBirth(),dept,position);
	}


	/*
     *  사용자 입력을 받아 전화번호를 등록한다.
     *   사용자 입력값의 유효성 검사를 통과하지 못하면, 등록되지 않는다.
     * */

    public PhoneInfo createUser() {
    	
    	
        System.out.println("전화번호는 010-1234-4567의 형식을 지켜주시고, 날짜는 24/05/29 형식을 지켜서 입력해주세요");
        System.out.print("이름 : ");
        String name = DataInput.sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = DataInput.sc.nextLine();
        System.out.print("생년월일 : ");
        String birth = DataInput.sc.nextLine();
        PhoneInfo userInfo = null;
      
        try {
             userInfo = PhoneInfo.createPhoneInfo(name, phoneNumber, birth);
        } catch (IllegalArgumentException e) {
            System.out.println(FAILMESSAGE + "error! 전화번호 형식이 맞지 않습니다. 010-1234-4567의 형식으로 입력해주세요");
            return null;
        } catch (DateTimeException ex) {
            System.out.println(FAILMESSAGE + "error! 날짜 형식이 맞지 않거나, 등록할 수 없는 날짜를 입력하셨습니다. 24/05/29 형식을 지켜서 입력해주세요");
            return null;
        }
        return userInfo;
    }


    /*
     *   등록된 모든 사용자 정보를 출력한다.
     *   이때 등록된 정보가 없다면, 정보 없음을 출력한다.
     *
     * */

    public void printAllPhoneInfo() {
        boolean result = manager.listPhoneInfo();
        if (!result) {
            System.out.println(">등록된 전화번호가 없습니다.");
        }

    }

    /*
     *  사용자가 입력한 값을 토대로 정보를 검색한다.
     *
     * */
    public void findPhoneInfo() {
        String[] findMenu = {"이름", "전화번호"};
        System.out.println("> 검색 기준을 선택해 주세요");
        for (int i = 0; i < findMenu.length; i++) {
            System.out.print((i + 1) + "." + findMenu[i] + " ");
        }
        System.out.println();

        try {
            int findOption = Integer.parseInt(DataInput.sc.nextLine());
            boolean result = manager.setFindPolicy(findOption);
            if (!result) {
                System.out.println("error! 등록된 기준에서 선택하셔야합니다.");
            } else {

                System.out.println(">" + findMenu[findOption - 1] + "을 입력해 주세요:");
                String findSource = DataInput.sc.nextLine();
                PhoneInfo[] findInfo = manager.searchPhoneInfo(findSource);

                if(findInfo == null) {
                	System.out.println("존재하지 않습니다.");
                }else {
                
                System.out.println(">검색결과:");
                for (PhoneInfo ph : findInfo) {
                    
                     ph.printPhoneInfo();
                    
                    System.out.println();
                }
                System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("> error! 정수로 입력하셔야 합니다.");
        }


    }


	public void updatePhoneInfo() {
		System.out.println("이름을 입력해주세요");
		//
		
	}


	public void deletePhoneInfo() {
		// TODO Auto-generated method stub
		
	}
}
