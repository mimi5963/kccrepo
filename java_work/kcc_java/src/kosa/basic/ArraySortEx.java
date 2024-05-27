package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortEx {
	public static void main(String[] args) {
		
		//�迭 ���� ���� 
		int arr[] = {4,2,5};
		System.out.println(Arrays.toString(arr));
		
		//�������� ����
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//�������� ���
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		} 
		
		//�������� ���� (����) 
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
		
		//������ �츮�� ���־�� �Ѵٴ� ����
		int[][] arr2 = {{2,90},{1,60},{3,20}}; //3,2
		
		Arrays.sort(arr2,new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				//2���� �迭 �ȿ� 1���� ù��° �ε����� �������� ��������
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