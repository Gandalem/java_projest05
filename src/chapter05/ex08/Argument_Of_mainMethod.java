package chapter05.ex08;

import java.util.Arrays;

public class Argument_Of_mainMethod {

	public static void main(String[] args) {
//		main Method 로 배의 값 인풋 하기

//		1. args : main 메소드로 String[] 배열을 담은 [배열]변수,
		System.out.println(args.length); //args 배열의 열개수
		System.out.println();
		
		
		System.out.println("===For 문을사용해서 출력===");
//		2.args 배열변수에 담긴 각방의 값을 for문을 사용해서 출력하기
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
		System.out.println("===Enhanced For문을 사용해서 출력===");
		
		for(String i :args) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===Arrays.toString()을 사용해서 출력===");
		System.out.println(Arrays.toString(args));
		
		System.out.println("======");
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		System.out.println(a + b + c + d); //a,b,c,d : 정수가 아니라 String
		
		
//		String 타입의 숫자를 정수로 변환해서 변수에 할당
		int e = Integer.parseInt(a); //String 타입의 숫자를 정수로 변환
		int f = Integer.parseInt(b);
		int g = Integer.parseInt(c);
		int h = Integer.parseInt(d);
		
		System.out.println(e+f+g+h); // e,f,g,h 정수
		
		
		
		
		
	}

}
