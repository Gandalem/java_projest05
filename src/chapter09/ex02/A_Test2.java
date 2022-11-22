package chapter09.ex02;

import chapter09.ex01.A;

public class A_Test2 {

	public static void main(String[] args) {
//		A클래스와 다흔 패키지에 존재하는 클래스
		A a1 = new A();
		System.out.println(a1.a); //public		: 외부패키지에서 접근이 가능
//		System.out.println(a1.b); //protected	: 외부패키지에서 접근이 가능(상속관계일때만가능)해서 오류발생
//		System.out.println(a1.c); //default		: 같은 패키지 내에서 만 접근이 가능해서 오류발생
//		System.out.println(a1.d); //private 	: 같은 파일에서만 접근 가능해서 오류발생

		a1.abc();//public		: 외부패키지에서 접근이 가능
//		a1.bcd();//protected	: 외부패키지에서 접근이 가능(상속관계일때만가능)
//		a1.cde();//default		: 같은 패키지 내에서 만 접근이 가능
//		a1.def();//private 		: 같은 파일에서만 접근 가능해서 오류발생
	}

}
