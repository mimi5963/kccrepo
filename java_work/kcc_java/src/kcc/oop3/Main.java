package kcc.oop3;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("����",new Work());
		p1.personDoing();
		p1.setNewRole(new Student());
		p1.personDoing();
		
		MyType m = (x) -> {return Integer.parseInt(x);};
		
		System.out.println(m.map("1"));
		
		prints((x) -> {return Integer.parseInt(x);});
		prints((x)->{return Integer.parseInt(x) + 1;});
		
		
		MyNumber x = (k, y) -> {return Math.max(k, y);};
		
		System.out.println(x.max(1, 2));
	}
	
	public static void prints(MyType m) {
		System.out.println(m.map("1"));
	}
}
