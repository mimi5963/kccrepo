package kcc.oop3;
interface A{
	void abc();
}
class B{
	void bcd() {
		System.out.println("�޼��� ȣ��");
	}
}
public class Main2 {
	
	public static void main(String[] args) {
		
		A a = () -> {new B().bcd();};
		a.abc();
	
		
		
		A a2 = new B()::bcd;
		a2.abc();
	}
	
}