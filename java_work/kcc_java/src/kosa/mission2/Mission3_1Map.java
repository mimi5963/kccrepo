package kosa.mission2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
public class Mission3_1Map {
	public static void main(String[] args) {
		//�̸�, ���� �ѽ����� Map �ڷᱸ���� ��������
		Map<String,Integer> map = new HashMap<>();
		//1 ���� �����ڸ� ���
		//2. ���� ��� �ְ����� �������� ���, Collections => max, min
		
		map.put("���ڹ�",80);
		map.put("�ż���", 60);
		map.put("�ڽ��Ǹ�", 70);
		map.put("���Ʈ", 90);
		
		//���� �����ڸ� ��� (key)
		for(String s : map.keySet()) {
			System.out.print("������ :"+s+" ");
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
		System.out.println("���� : "+total+" ��� : "+avg +" �ְ����� : "+max+" �������� : "+min);
		
		Map.Entry<String,Integer> minPerson = map.entrySet().stream().filter((m) ->{return m.getValue()==Collections.max(map.values());}).findAny().get();
		Map.Entry<String, Integer> maxPerson = map.entrySet().stream().filter((m)->{return m.getValue()==Collections.min(map.values());}).findAny().get();
		
		System.out.println(minPerson.getKey()+" "+minPerson.getValue());
		System.out.println(maxPerson.getKey()+" "+maxPerson.getValue());
		
		
		
		//Ű����κ��� ���� ���� �Է� -> ��ȣ ��ġ ����ġ �Ǵ�
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Stack<Character> s = new Stack<>(); 
		for(char c : input.toCharArray()) {
			if(c == '(')s.push(c);
			else if(c == ')') {
				s.pop();
				if(s.isEmpty()) {
					System.out.println("����ġ");
					return;
				}else {
					s.pop();
				}
				}
			}
		if(!s.isEmpty()) {
			System.out.println("����ġ");
		}
		
		///
	}
}
