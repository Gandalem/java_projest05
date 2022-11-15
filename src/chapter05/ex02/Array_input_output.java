package chapter05.ex02;

import java.util.Arrays;

public class Array_input_output {

	public static void main(String[] args) {
//		배열에 값을 넣고, 출력 하기
		System.out.println("===1. 직접 값을 넣고 출력===");
//		배열변수 선언 및 방크기 초기화
		int[] arr1 = new int[5];
		
//		직접 해당방 번호에 값을 할당
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
//		직접 방의 번호를 출력
		System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2] + " "+ arr1[3] + " "+ arr1[4]);
		
		System.out.println("===1. for 문을 사용해서 대량으로 값을 넣고 값을 출력하기===");
//		arr2 에 방을 100개 선언, for 문을 사용해서 각방1부터 시작해서 1씩증가
		int[] arr2 =new int[100];
		for(int i=0; i<100; i++) {
			arr2[i] = i+1;
		}
//		for 문을 사용해서 넣은 값을 출력하기
		for(int i=0;i<100;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("=== 3. enhanced for 문(향샹된 for 문)===");
//		enhanced for : 배열의 각방의 값을 출력할때 쉽게 출력 할수 있다.
//			- 0 ~ 마지막 방까지 한꺼번에 출력
		
		int[] arr3 = new int[100];
//		for 문을 사용해서 7의 배수만 저장 
		for(int i = 0 , j = 7 ; i < 100; i++, j+=7) {
			arr3[i] = j;
		}
//		각방의 내용을 for문을 사용해서 출력
		for(int i = 0; i<100; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		System.out.println("===향상된 for 문:Enhanced for===");
//		0번부터 마지막 방 까기 모두 출력
		for(int k : arr3) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.println("===Array.toString(배열 변수)===");
//		Array.toString(arr3);
//		Array : 객체
//		toString(): 메소드(함수)
//			메소드 : 객체지향 언어에서 함수를 메소드라고 한다
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("===배열의 방의 갯수를 출력 메소드===");
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		System.out.println("======");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3.length+" ");
		}
	}

}
