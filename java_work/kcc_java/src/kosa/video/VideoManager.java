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
		System.out.print("ȸ�� ���̵�:");
		String id = sc.nextLine();
		System.out.print("ȸ�� �̸�:");
		String name = sc.nextLine();
		System.out.print("ȸ�� �ּ�:");
		String address = sc.nextLine();
		members.add(new GeneralMember(id,name,address));
	}
	
	public void showMemberInfo() {
		
		GeneralMember findMember = findMember();
		if(findMember == null) {
			System.out.println("�׷� ȸ���� �����");
		}else {
			findMember.printLentalVideoInfo();
		}
		
	}
	
	public void lentalVideo() {
		GeneralMember member = findMember();
		Video findVideo = findVideo();
		if(findVideo == null || member == null) {
			System.out.println("��ϵ� ������ ���ų� ȸ�� ������ �����ϴ�.");
		}else {
			member.lentVideo(findVideo);
		}
		
	}
	
	private GeneralMember findMember() {
		System.out.println("ȸ�� ���̵� �Է����ּ���: ");
		String id = sc.nextLine();
		for(GeneralMember m : members) {
			if(m.getId().equals(id)) {
				return m;
			}
		} 
		return null;
	}
	
	private Video findVideo() {
		System.out.println("���� ��ȣ�� �Է����ּ���: ");
		int num = Integer.parseInt(sc.nextLine());
		for(Video v : videos) {
			if(v.getVideoNum() == num) {
				return v;
			}
		} 
		return null;
		
	}
	
	public void enrollVideo() {
		System.out.print("���� ��ȣ:");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("���� ����:");
		String title = sc.nextLine();
		System.out.print("�ֿ� ���:");
		String actoer = sc.nextLine();
		videos.add(new Video(num,title,actoer));
	}
}