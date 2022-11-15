package chapter05.ex01;

public class Ex01 {

	public static void main(String[] args) {
//		<문제> 
//		배열선언 4가지 방법 : 
//		1. 배열 변수 이름 : arr1, 정수로 방3개 지정, 40,50,60 넣고 출력 <배열 선언 1>
//		2. 배열 변수 이름 : arr2, 실수로 방5개 지정, 40,50,60 넣고 출력 <배열 선언 2>
//		3. 배열 변수 이름 : arr3, 문자열 3 , "오늘","날씨","흐림" <배열 선언 3>
//		4. 배열 변수 이름 : arr4 문자 3, 'A','B','C' <배열 선언4>
		System.out.println("<배열 선언 1>");
		int[] arr1 = new int[3];
		int a = 40;
		for(int i:arr1) {
			arr1[i] = a;
			a += 10;
			System.out.println(arr1[i]);
		}
		System.out.println("<배열 선언 2>");
		double[] arr2 = new double[5];
		double b = 40;
		for(int i =0; i<arr2.length;i++) {
			arr2[i] = b;
			b += 10;
			System.out.println(arr2[i]);
		}
		System.out.println("<배열 선언 3>");
		String[] arr3 = new String[] {"오늘","날씨","흐림"};
		for(int i =0; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("<배열 선언 4>");
		char[] arr4 = {'A','B','C'};
		for(int i =0; i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
	}

}
