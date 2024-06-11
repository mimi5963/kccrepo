package kosa.video;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class VideoMain {
	//video는 한개밖에 못빌려유
	public static void main(String[] args) {
			
		GeneralMember m1 = new GeneralMember("aaa","홍길동","동탄");
		Video v1 = new Video(1,"트랜스포머3","서봉수");
		
		m1.lentalVide(v1);
		m1.printLentalVideoInfo();
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("objectFile.ser"));
			oos.writeObject(v1);
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//Gen 멤버와 SpecialMember 함께 배열에 넣고 
		
		//각가의 
		GeneralMember[] members = {new SpecialMember("3","짱","사"),new GeneralMember("2","원","강"),new SpecialMember("1", "장", "홍제")};
		for(GeneralMember g : members) {
			g.lentalVide(new Video(1,"트렌스포머3","서봉수"));
		}
		
		for(GeneralMember g1 : members) {
			g1.printLentalVideoInfo();
		}
//		Scanner sc = new Scanner(System.in);
//		VideoManager vm = new VideoManager();
//		while(true) {
//			
//		}
	}
	
//	public static void printMenu() {
//		System.out.println("1.회원등록, 2.비디오 등록, 3.회원 비디오 대여, 4. 회원 정보 출력");
//	}
}
