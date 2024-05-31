package kosa.video;

public class SpecialMember extends GeneralMember {
	
	private int bonus;

	public SpecialMember(String id, String name, String address) {
		super(id, name, address);
		this.bonus = 0;
	}
	
//	public void printSpecialMember() {
//		super.printLentalVideoInfo();
//		System.out.println("회원 보너스 포인트 적립 :"+bonus);
//	}

	
	public void plusBonus(int amount) {
		bonus += amount;
	}

	@Override
	public void printLentalVideoInfo() {
		super.printLentalVideoInfo();
		System.out.println("회원의 보너스 포인트 적립 : "+bonus);
	}

	@Override
	public void lentalVide(Video video) {
		// TODO Auto-generated method stub
		super.lentalVide(video);
		this.bonus += 10;
	}

}
