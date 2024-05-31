package kosa.video;

public class SpecialMember extends GeneralMember {
	
	private int bonus;

	public SpecialMember(String id, String name, String address) {
		super(id, name, address);
		this.bonus = 0;
	}
	
//	public void printSpecialMember() {
//		super.printLentalVideoInfo();
//		System.out.println("ȸ�� ���ʽ� ����Ʈ ���� :"+bonus);
//	}

	
	public void plusBonus(int amount) {
		bonus += amount;
	}

	@Override
	public void printLentalVideoInfo() {
		super.printLentalVideoInfo();
		System.out.println("ȸ���� ���ʽ� ����Ʈ ���� : "+bonus);
	}

	@Override
	public void lentalVide(Video video) {
		// TODO Auto-generated method stub
		super.lentalVide(video);
		this.bonus += 10;
	}

}