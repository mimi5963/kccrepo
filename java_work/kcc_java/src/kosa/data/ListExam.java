package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {
	public static void main(String[] args) {
			//1!45 중복되지 않은 로또번호 6개 출력 
		
		//1번 배열로 
//		int[] arr = new int[6];
//		arr[0] = (int)(Math.random()*45)+1;
//		int idx=1;
//		
//		
//		while(idx < arr.length) {
//			int randNum = (int)(Math.random()*45)+1;
//			if(duple(arr,randNum,idx)) {
//				arr[idx++]=randNum;
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0; i<arr.length;i++) {
//			arr[i] =  (int)(Math.random()*45)+1;
//			for(int j=0; j<i;j++) {
//				if(arr[i] == arr[j]) {
//					i -= 1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		List<Integer> list = new ArrayList<>();
		
		
		Set<Integer> sets = new TreeSet<>();
		
		for(int i=0;sets.size()<6;i++) {
			sets.add((int)(Math.random()*45)+1);
		}
		
		Iterator<Integer> iter = sets.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

	private static boolean duple(int[] arr, int randNum,int idx) {
		for(int i=0;i<idx;i++) {
			if(arr[i] == randNum) {
				return false;
			}
		}
		return true;
	}
	private enum Apple{
		PIE,JAM;
	}
	private enum Grape{
		PIE,JAM;
	}

}

