package chapter05.ex05;

import java.util.Arrays;

public class RectangleArrayDefinition {

	public static void main(String[] args) {
//		다차원 배열(2차원 배열)
//			- 정방향 배열 : row(형) 에 대해서 열 (column,field) 이 동일한 배열
//			- 비정방향 배열 : row(형) 에대해서 열 (column,field) 이 동일 하지 않는 배열
		
//		1.정방향 배열 선언 방법
		int[][] arr1 = new int[3][4];
//							  [행][열]
		
//		배열의 각방의 값을 넣기
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
		
		arr1[1][0] = 50;
		arr1[1][1] = 60;
		arr1[1][2] = 70;
		arr1[1][3] = 80;
		
		arr1[2][0] = 90;
		arr1[2][1] = 100;
		arr1[2][2] = 110;
		arr1[2][3] = 120;
		
//		2차원배열 의 방의 값 출력하기
		System.out.println(arr1[0][0]);
		
//		선언 후 사용하기
		int[][] arr2;
		arr2 = new int[3][4];
		
//		2.정방향 배열 선언
		int arr3[][] = new int [3][4];
//		선언후 사용하기
		int arr4[][];
		arr4 = new int[3][4];
		
//		3. 정방향 배열 선언
		int[] arr5[] = new int [3][4];
//		선언후 사용하기
		int[] arr6[];
		arr6 = new int[3][4];
		
//		4. 정방향 배열 선언과 동시에 값넣기 : <주위> 방크기를 지정하면 오류 발생
		int[][] arr11 = new int[][] {{1,2,3},{4,5,6}};
//							   [2][3]
		System.out.println(arr11[1][0]);
		
		int[][] arr12;
		
		arr12 = new int[][] {{11,12,13,14},{21,22,23,24},{31,32,33,34}};
		
		System.out.println(arr12[1][0]);
		
		
//		4.다양한 타입의 배열 변수 선언 하기
		boolean[][] arr7 = new boolean[3][4];
		int[][] arr8 = new int [3][4];
		double[][] arr9 = new double[3][4];
		String[][] arr10 = new String [3][4];
		
//		5. 정방향 배열 선언과 동시에 값넣기 : 선언 , 값을 분리 할수 없다.
		int[][] arr13 = {{110,120,130,140},{210,220,230,240}};
		System.out.println(arr13[0][0]);
		
/*		선언과 값을 분리해서 넣을수없다.
		int[][] arr14;
		arr14 = {{1,2,3},{4,5,6}};
*/
		System.out.println("테스트");
		
		for(int i=0;i<arr13.length;i++) {
			
			for(int j=0;j<4;j++) {
				
				System.out.print(arr13[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("테스트2");
		for(int i=0;i<arr13.length;i++) {
			
			int[] inarr13 = arr13[i];
			
			for(int j=0;j<inarr13.length;j++) {
				
				System.out.print(inarr13[j]+" ");
			}
			System.out.println();
		}
		System.out.println("테스트3");
		System.out.println(Arrays.deepToString(arr13));
		
		
		
		
		
	}

}
