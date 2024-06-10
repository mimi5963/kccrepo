package kcc.oop4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
			List<Student>list = Arrays.asList(new Student("ȫ�浿", 50),new Student("�ſ��", 20),new Student("���̼�", 30));
			
			Stream<Student> studentStream = list.stream();
			
			IntStream scoreStream = studentStream.mapToInt(s -> s.getScore());
			double avg = scoreStream.average().getAsDouble();
			
			double avg2 = list.stream().mapToInt(st -> st.getScore()).average().getAsDouble();
			
			printName(s -> System.out.printf(s+"����ϱ� �Ⱦ��"));
		    printName (s -> {return;});
			
	}
	
	public static void printName(MyInterface mf){
		  String name = "���̸�";
		  mf.print(name);
		}
}
