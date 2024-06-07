package kosa.mission2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
public class Mission3_1Map {
	public static void main(String[] args) {
		//이름, 정수 한쌍으로 Map 자료구조로 구현하자
		Map<String,Integer> map = new HashMap<>();
		//1 시험 응시자만 출력
		//2. 총정 폄균 최고점수 최저점수 출력, Collections => max, min
		
		map.put("김자바",80);
		map.put("신서블릿", 60);
		map.put("박스피링", 70);
		map.put("장부트", 90);
		
		//시험 응시자만 출력 (key)
		for(String s : map.keySet()) {
			System.out.print("응시자 :"+s+" ");
		}
		int total=0;
		int avg = 0;
		int max = Collections.max(map.values());
		int min = Collections.min(map.values());
		
		for(int i : map.values()) {
			total += i;
		}
		avg = total/map.size();
		System.out.println();
		System.out.println("총점 : "+total+" 평균 : "+avg +" 최고점수 : "+max+" 최저점수 : "+min);
		
		Map.Entry<String,Integer> minPerson = map.entrySet().stream().filter((m) ->{return m.getValue()==Collections.max(map.values());}).findAny().get();
		Map.Entry<String, Integer> maxPerson = map.entrySet().stream().filter((m)->{return m.getValue()==Collections.min(map.values());}).findAny().get();
		
		System.out.println(minPerson.getKey()+" "+minPerson.getValue());
		System.out.println(maxPerson.getKey()+" "+maxPerson.getValue());
		
		
		
		//키보드로부터 수학 수식 입력 -> 괄호 일치 불일치 판단
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Stack<Character> s = new Stack<>(); 
		for(char c : input.toCharArray()) {
			if(c == '(')s.push(c);
			else if(c == ')') {
				s.pop();
				if(s.isEmpty()) {
					System.out.println("불일치");
					return;
				}else {
					s.pop();
				}
				}
			}
		if(!s.isEmpty()) {
			System.out.println("불일치");
		}
		
		///
	}
}
