package kosa.api;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}else {
			Person o = (Person)obj;
			return this.age == o.age && this.name.equals(o.name);
		}
	}
	
}
