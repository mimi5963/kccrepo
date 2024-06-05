package kcc.oop3;

interface A1{
	B1 abc(int a);
}

class B1{
	int a;
	B1(int a){
		this.a = a;
	}
	B1(){
		
	}
}

public class Main3 {
	public static void main(String[] args) {
		A1 a = B1::new;
		B1 b = a.abc(1);
		System.out.println(b.a);
	}
}
