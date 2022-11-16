package chapter05.ex06;

import java.util.Arrays;

public class Ex021 {

	public static void main(String[] args) {
		int[][] arr1 = new int[5][100];
		
		for(int i=0;i<arr1.length;i++) {
			int arr2[][] = Arrayss(arr1,2,i);
		}
		System.out.println(Arrays.deepToString(arr2));
		

	}
	
	public static int[][]  Arrayss(int arr[][],int num,int row) {

		for(int i=0;i<arr.length;i++) {
			int a=0;
			int[] arrcp = arr[i];
			for(int j=num;;j++) {
				if(a==arrcp.length) {
					break;
				} else if(j%num==0){
					arr[row][a] = j;
					a++;
				}
			}
		}
		return arr;

	}

}
