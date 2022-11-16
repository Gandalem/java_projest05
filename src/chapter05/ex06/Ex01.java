package chapter05.ex06;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
//		<3:40분까지>
		
		int[][] arr1 = new int[][] {{10,20,30,40,50},{11,12,13,14,15},{111,112,113,114,115}};
		
		System.out.println("1. 이중 for 문 을 사용해서 2차원 배열의 값을 출력");
//		1. 이중 for 문 을 사용해서 2차원 배열의 값을 출력
		for(int i=0;i<arr1.length;i++) {
			
			int[] inarr13 = arr1[i];
			
			for(int j=0;j<inarr13.length;j++) {
				
				System.out.print(inarr13[j]+" ");
			}
			System.out.println();
		}
		System.out.println("2. 향상된 for문을 사용해서 출력");
//		2. 향상된 for문을 사용해서 출력
		for(int[] i : arr1) {
			int[] inarr1 = i;
			for(int j:inarr1) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("======");
		for(int[] i : arr1) {
			for(int j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("3. Arrays.toString()사용해서 출력");
//		3. Arrays.toString()사용해서 출력
		System.out.println(Arrays.deepToString(arr1));
		System.out.println("======");
		for(int[]arr3:arr1) {
			System.out.println(Arrays.toString(arr3));
		}
		
	}

}
