package kosa.video;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video video;
	
	public GeneralMember() {}
	public GeneralMember(String id, String name, String address) {
		this.id =id;
		this.name = name;
		this.address=address;
	}
	
	public void lentVideo(Video video) {
		this.video = video;
	}
	
	public void printLentalVideoInfo() {
		System.out.println("회원 아이디 :"+this.id);
		System.out.println("회원 이름 :"+this.name);
		System.out.println("회원 주소 :"+this.address);
		
		if(video == null) {
			System.out.println("빌린 비디오가 없습니다.");
		}else {
			System.out.println("회원이 대여한 비디오 번호 :"+this.video.getVideoNum());
			System.out.println("회원이 대여한 비디오 제목 :"+this.video.getTitle());
			System.out.println("회원이 대여한 비디오 주인공 :"+this.video.getActor());
		}
		
	}
	
	public void lentalVide(Video video) {
		this.video = video;
	}
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	
	
}
