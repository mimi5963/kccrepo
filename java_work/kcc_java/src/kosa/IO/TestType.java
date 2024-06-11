package kosa.IO;

import java.io.Serializable;

public class TestType implements Serializable{
	private String name;
	private int age;
	
	public TestType() {
		
	}
	
	public TestType(String name, int age) {
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TestType [name=" + name + ", age=" + age + "]";
	}
	
}
