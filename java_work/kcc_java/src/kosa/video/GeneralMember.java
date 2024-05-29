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
		System.out.println("ȸ�� ���̵� :"+this.id);
		System.out.println("ȸ�� �̸� :"+this.name);
		System.out.println("ȸ�� �ּ� :"+this.address);
		
		if(video == null) {
			System.out.println("���� ������ �����ϴ�.");
		}else {
			System.out.println("ȸ���� �뿩�� ���� ��ȣ :"+this.video.getVideoNum());
			System.out.println("ȸ���� �뿩�� ���� ���� :"+this.video.getTitle());
			System.out.println("ȸ���� �뿩�� ���� ���ΰ� :"+this.video.getActor());
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