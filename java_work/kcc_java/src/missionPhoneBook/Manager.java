package missionPhoneBook;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

	public void sortByName() {
		Collections.sort(this.phoneInfoList);
		
	}

	public void sortByPhoneNumber() {
		// TODO Auto-generated method stub
		
	}

	public void sortByAsc(SortGroup g, SortContent gc) {
		if(g == SortGroup.COMPANY) {
			//이러지 말았어야해~~ 
		}else if(g == SortGroup.TOTAL) {
			
		}else if(g == SortGroup.UNIVERSE) {
			
		}
		
	}

	public void sortByDesc(SortGroup g, SortContent gc) {
		// TODO Auto-generated method stub
		
	}
	
	//회사 사람만 모으기 
	public List<PhoneInfo> findUserInCompany(String name){
		
		
		return phoneInfoList.stream()
				.filter((s) -> {return s instanceof Company;})
				.filter(s-> {return s.getName().equals(name);})
				.collect(Collectors.toList());
	}
	//모든 폰인포 중에 회사의 부서별로 sort
	public List<PhoneInfo> sortPhoneInfoByCompanyPosittion(){
		return phoneInfoList.stream()
				.filter(info -> info instanceof Company)
				.sorted((o1,o2)->{return ((Company)o1).getPosition().compareTo(((Company)o2).getPosition());})
				.collect(Collectors.toList());
	}
	//이름 첫 글자로 그룹만들기 가-가충순
	public void groupByPhoneInfoFirstName() {
		Map<String, PhoneInfo> map = phoneInfoList.stream()
				.collect(Collectors.toMap(p -> (p.getName()).charAt(0)+"", p->p)); 
		
	}
//	//이름은 겹치는데, 그룹은 다른사람들
//	public List<PhoneInfo> findPhoneInfoBySameNameAndDifferentCategory(){
//		this.phoneInfoList.stream().
//		//
//	}

	public void savePhoneInfoList() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneInfo.ser",true));
			oos.writeObject(this.phoneInfoList);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void readPhoneInfoList() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("phoneInfo.ser"));
			List<PhoneInfo> temp = (List<PhoneInfo>)ois.readObject();
			temp.stream().forEach(s->{
				this.phoneInfoList.add(s);
			});
		
			
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
		
	}

}
