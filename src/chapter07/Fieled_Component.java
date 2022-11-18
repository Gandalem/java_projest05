package chapter07;

class A {

//	필드 : 객체를 생성시 Heap영역에 필드의 값이 저장됨
//		Heap변수 [필드]의 값이 비어 있을 강제 초기화
	
	int a;
	boolean b;
	double c;
	String d;
	
//	생성자 : A(){} : 기본생성자 생략되서 다른클래스에서 호출할때는 넣어줘야한다
	
//	필드의 기본값을 출력 하는 메소드
	void defaultValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
}

class B {
//	필드 선언 : heap
	int m = 3;
	int n = 4;
//	기본 생성자 생략됨 : B(){}
	
//	메소드 선언
	void work1() {
		int k = 5; //지역변수 : stack
		System.out.println(k);
		work2(3); // 메소드 호출 (work2(3))
	}
	void work2(int i) {
		int j =4; //지역변수 : stack
		System.out.println(j+i);
		
	}
}

public class Fieled_Component {

	public static void main(String[] args) {
//		클래스 내부 구성요소.
//		- Field : 필드
//		- Method : 메소드
//		- Constructor : 생성자
		
//		메소드 내부에서 선언된 변수의 값은 Stack
		int e; //메소드 내부에서 stack 값이 저장되
		
//		1. 객체 생성
		A a = new A(); //new A() : 기본 생성자 호출
		
		a.defaultValue(); //메소드 호출
		
		a.a = 1;
		a.b = true;
		a.c = 5.5;
		a.d = "hi";
		
		a.defaultValue();
		
		System.out.println("===B===");
		
		B b = new B(); //new B() : 기본 생성자 호출
		
		b.work1(); //메소드 호출
		b.work2(1);
	}

}
