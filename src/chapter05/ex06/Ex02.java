package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
//		<문제>
/*		
 * 		2차원 배열 변수 : arr1
 * 		arr1[0] <== 2의 배수만 저장
 * 		arr2[1] <== 5의 배수만 저장
 * 		arr3[2] <== 3의 배수와 8의 배수를 저장
 * 		arr3[3] <== 1부터 시작해서 1씩 증가하는데 7의 배수만 제외시키고 저장
 * 		
 * 		행의 개수 : 4
 * 		열의 개수 : 100
 * 
 * 		1.for문으로 출력, 2.Enhanced For, Arrays.toString
 * 
*/	
		int[][] arr1 = new int[5][100];
		for(int i=0;i<arr1.length;i++) {
			int a=0;
			for(int j=2;;j++) {
				if(a==100) {
					break;
				} else if(j%2==0){
					arr1[0][a] = j;
					a++;
				}
			}
		}
		
		int[][] arr2 = arr1;
		for(int i=0;i<arr2.length;i++) {
			int a=0;
			for(int j=5;;j++) {
				if(a==100) {
					break;
				} else if(j%5==0){
					arr2[1][a] = j;
					a++;
				}
			}
		}
		
		int[][] arr3 = arr2;
		for(int i=0;i<arr3.length;i++) {
			int a=0;
			for(int j=3;;j++) {
				if(a==100) {
					break;
				} else if(j%3==0||j%8==0){
					arr3[2][a] = j;
					a++;
				}
			}
		}
		for(int i=0;i<arr3.length;i++) {
			int a=0;
			for(int j=1;;j++) {
				if(a==100) {
					break;
				} else if(j%7!=0){
					arr3[3][a] = j;
					a++;
				}
			}
		}
		System.out.println("arr1[0] <== 2의 배수만 저장");
		for(int i=0;i<arr1[0].length;i++) {
			System.out.print(arr1[0][i]+" ");
		}
		System.out.println();
		System.out.println("arr2[1] <== 5의 배수만 저장");
		for(int inarr2 : arr2[1]) {
				System.out.print(inarr2+" ");
		}
		System.out.println();
		
		System.out.println("arr3[2] <== 3의 배수와 8의 배수를 저장");
		System.out.println("arr3[3] <== 1부터 시작해서 1씩 증가하는데 7의 배수만 제외시키고 저장");
		for(int i=2;i<arr3.length-1;i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		System.out.println("=====");
		System.out.println(Arrays.deepToString(arr3));
	}

}
