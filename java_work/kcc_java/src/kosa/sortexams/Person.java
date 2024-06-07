package kosa.sortexams;

public class Person implements Comparable<Person>{
	private int age;
	private String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		
		return Integer.compare(this.age, o.age);
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
