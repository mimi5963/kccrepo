package kosa.sortexams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Person p = new Person(90,"�ڱ浿");
		Person p1 = new Person(90,"��浿");
		Person p2 = new Person(90,"ȫ�浿");
		Person p3 = new Person(90,"�ֱ浿");
		Person p4 = new Person(90,"��浿");
		
		List<Person> lists = new ArrayList<>();
	
		lists.add(p);
		lists.add(p1);
		lists.add(p2);
		lists.add(p3);
		lists.add(p4);
		
		
		Collections.sort(lists, (o1,o2) -> {
		 Person o =	(Person)o1;
		 Person ok = (Person)o2;
		 return o.getName().compareTo(ok.getName());
		});
		
		System.out.println(lists.toString());
		
	}
}