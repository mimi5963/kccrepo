package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; //학생이 수강신청한 과목들
	
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}
	
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	
	public void deleteCourse(Course course) {
		if(courses.contains(course)) {
			courses.remove(course);
			course.deleteStudent(this);
		}
		
	}

	public String getName() {
		return name;
	}

	
	
}
