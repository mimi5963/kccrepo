package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private List<Student> students;
	
	public Course() {}
	public Course(String name) {
		super();
		this.name = name;
		students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	public void deleteStudent(Student student) {
		if(students.contains(student)) {
			students.remove(student);
		}
	}
	
	public void printCourse() {
		System.out.println("과목명: "+name);
		for(Student s : students) {
			System.out.println("수강신청 학생명:"+s.getName());
		}
	}
}
