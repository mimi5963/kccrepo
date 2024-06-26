package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortEx {
	public static void main(String[] args) {
		
		//배열 내용 정렬 
		int arr[] = {4,2,5};
		System.out.println(Arrays.toString(arr));
		
		//오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순 출력
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		} 
		
		//내림차순 정렬 (버블) 
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] =temp;
				}
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//기준을 우리가 해주어야 한다는 디유
		int[][] arr2 = {{2,90},{1,60},{3,20}}; //3,2
		
		Arrays.sort(arr2,new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				//2차원 배열 안에 1차원 첫번째 인덱스를 기준으로 오름차순
				if(o1[0] < o2[0]) {
					return 1;
				}else if(o1[0] > o2[0]) {
					return -1;
				}
				return 0;
			}
		});
		
		System.out.println(Arrays.deepToString(arr2));
		
	}
}
