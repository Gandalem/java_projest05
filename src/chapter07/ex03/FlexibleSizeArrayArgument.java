package chapter07.ex03;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
//		가변 길이 배열 매게변수 처리 ,Argument 로 전송되는 배열의 길이가 다이나믹하게 가변적으로 변화됨
//		int[] b = new int[2];
//		int[] a = new int[1];
		method1 (1,2);
//		method1 (a,b);
		for(int i=0;i<10;i++) {
			int j =1;
			method1(i+j);
		}
		method2("안녕");
		method2("안녕","반갑","습니다.");
		method2("안녕","땡큐","베리","감사","합니다.");
	}
	
//	가변길이 배열 메소드 선언 : 정수를 인풋받는 가변 길이 배열
	public static void method1(int...values) { //길이, 개수가 정해지지 않음
		System.out.print(Arrays.toString(values)+" ");
		System.out.println();
	}
//	가변길이 배열 메소드 선언 : 정수를 인풋받는 가변 길이 배열
	public static void method2(String...values) { 
		for(int i=0;i<values.length;i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
	}

}
