package kcc.inter;

public class Reader extends Man implements Speakable {
	public Reader() {}
	public Reader(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	@Override
	public String speak() {
		
		return super.getName()+"자바 화이팅";
	}
	
	
}
