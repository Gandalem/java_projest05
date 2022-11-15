package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
//		<문제> 배열 변수 : arr1, 배열의 방의 개수 500개
//		배열방에 3의 배수또는 5의 배수를 저장
//		출력 : 1. for 2.Enhanced for, 3. Arrays.toString() 를 사용해서 출력
		System.out.println("for");
		int[] arr1 = new int[500];
		int a=0;
		pos1 : for(int i=0;i<2000;i++) {
			if(((i%3) == 0)||((i%7)==0)) {
				arr1[a] = i;
				a++;
			} else if(a==500) {
				break;
			} else {
				continue pos1;
			}
		}
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
			
		System.out.println();
		System.out.println("Enhanced for");
		for(int j:arr1) {
				System.out.print(j+" ");
		}
		
		
		System.out.println("");
		System.out.println("Arrays.toString()");
		System.out.println(Arrays.toString(arr1)+ " ");

	}

}
