package kcc.inter;

public class Student extends Man{
	public Student() {}
	public Student(String name) {
		super(name);
	}
	public String getName() {
		return super.getName()+"���γ� ��������";
	}
}
