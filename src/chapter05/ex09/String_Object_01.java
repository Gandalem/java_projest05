package chapter05.ex09;

import java.util.Arrays;

public class String_Object_01 {

	public static void main(String[] args) {
//		참조 자료형 : 객체(String)
		
//		String 문자영 저장하는 자바에서 생성해놓은 객체 (첫글자가 대문자로 시작됨)
//			- 다른 객체와 다른 특수한 기능들이 들어있다.
		
//		1. String 으로 객체생성 방법 <= 값을 수정할수 없다
		String str1 = new String("안녕"); //생성자를 사용해서 값을 넣는 방법
		System.out.println(str1);
		
//		2. String 으로 객체 생성방법 <= 다른객체와 공유해서 사용이 가능하다
		String str2 = "안녕하세요"; //리터럴 형식으로 값을 넣는 방법
		System.out.println(str2);
		
		System.out.println("======");
		
//		3, 문자열 수정(객체내의 내용 변경 불가  => 새로운 객체가 생성)
		String str3 =new String("안녕");
		String str4 = str3;
		
		str3 = "안녕하세요";
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("======");
		
//		배열의 참조 변수
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;
		
		arr1[0]=7;
		arr1[1]=8;
		arr1[2]=9;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		

	}

}
