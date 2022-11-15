package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		스캐너로 배영의 방 개수를 입력받습니다.
//		배열 변수 : arr1, 2의 배수를 저장한후 출력 enhances for 문을 사용해서 출력
//		배열 변수 : arr2, 3의 배수를 입력받아서 출력 for 문을 사용해서 출력
//		arr1.length
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2의배수 배열길이를 입력 :");
		int a = sc.nextInt();
		
		System.out.println("3의배수 배열길이를 입력 :");
		int b = sc.nextInt();
		sc.close();
		
		int[] arr1 = new int[a];
		int[] arr2 = new int[b];
		
		int n1 = 2;
		int n2 = 3;
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = n1;
			n1 +=2;
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = n2;
			n2 +=3;
		}
		
		System.out.println("2의 배수 배열");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		System.out.println("3의 배수 배열");
		for(int i =0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
