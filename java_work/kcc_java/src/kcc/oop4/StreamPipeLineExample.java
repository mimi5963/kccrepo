package kcc.oop4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
			List<Student>list = Arrays.asList(new Student("홍길동", 50),new Student("신용권", 20),new Student("유미선", 30));
			
			Stream<Student> studentStream = list.stream();
			
			IntStream scoreStream = studentStream.mapToInt(s -> s.getScore());
			double avg = scoreStream.average().getAsDouble();
			
			double avg2 = list.stream().mapToInt(st -> st.getScore()).average().getAsDouble();
			
			printName(s -> System.out.printf(s+"출력하기 싫어요"));
		    printName (s -> {return;});
			
	}
	
	public static void printName(MyInterface mf){
		  String name = "내이름";
		  mf.print(name);
		}
}
