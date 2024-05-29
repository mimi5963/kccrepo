package kosa.video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoManager {
	private List<GeneralMember> members;
	private List<Video> videos;
	private Scanner sc;
	public VideoManager() {
		members = new ArrayList<>();
		videos = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	public void enrollMember() {
		System.out.print("회원 아이디:");
		String id = sc.nextLine();
		System.out.print("회원 이름:");
		String name = sc.nextLine();
		System.out.print("회원 주소:");
		String address = sc.nextLine();
		members.add(new GeneralMember(id,name,address));
	}
	
	public void showMemberInfo() {
		
		GeneralMember findMember = findMember();
		if(findMember == null) {
			System.out.println("그런 회원은 없어요");
		}else {
			findMember.printLentalVideoInfo();
		}
		
	}
	
	public void lentalVideo() {
		GeneralMember member = findMember();
		Video findVideo = findVideo();
		if(findVideo == null || member == null) {
			System.out.println("등록된 비디오가 없거나 회원 정보가 없습니다.");
		}else {
			member.lentVideo(findVideo);
		}
		
	}
	
	private GeneralMember findMember() {
		System.out.println("회원 아이디를 입력해주세요: ");
		String id = sc.nextLine();
		for(GeneralMember m : members) {
			if(m.getId().equals(id)) {
				return m;
			}
		} 
		return null;
	}
	
	private Video findVideo() {
		System.out.println("비디오 번호를 입력해주세요: ");
		int num = Integer.parseInt(sc.nextLine());
		for(Video v : videos) {
			if(v.getVideoNum() == num) {
				return v;
			}
		} 
		return null;
		
	}
	
	public void enrollVideo() {
		System.out.print("비디오 번호:");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("비디오 제목:");
		String title = sc.nextLine();
		System.out.print("주연 배우:");
		String actoer = sc.nextLine();
		videos.add(new Video(num,title,actoer));
	}
}
