package chapter05.ex06;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
//		2차 정방향 배열

//		1. 배열의 선언
		int[][] arr1 = new int[5][100];
		
		System.out.println(arr1.length); //arr1.length : 행의 개수
		System.out.println(arr1[0].length); // arr1[row].length : row행의 개수
		
//		2차원 배열의 값넣기 : 이중 for (for-for)을 사용해서 값을 넣기
//		행을 정의 : i = 행의 방번호(index), arr1.length = 행의 개수
		int a=0;
		for(int i=0;i<arr1.length;i++) {
//			열의 정의 : j = 열의 방번호(index),arr1[i].length = i 행의 열의 개수
			for(int j =0;j<arr1[i].length;j++,a++) {
				arr1[i][j] = a+1;
			}
		}
//		3. 배열의 값을 출력하지(for-for)
		for(int i=0;i<arr1.length;i++) {
			for(int j =0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===Enhanced for 문으로 출력===");
//		4. Enhanced for 물을 사용해서 출력
		for(int[] i : arr1) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("===Arrays.toString()로 출력");
//		5. to String()
		for(int[] i: arr1) {
			System.out.println(Arrays.toString(i));
		}
		
		
		
		
		
		
	}

}
