package chapter06;

//외부클래스 : 객체를 생겅하기위한 설계도,탬플릿(틀)
class A{
	int m = 3;
	int n = 7;
	double d = 10.5;
	
//	생성자 : 리턴 타입이 존재하지 않는다.
//	메고드 이름이 클래스이름과 동일한 메소드

//	기본생성자 : 생략될 수 있다
	A() {
//		기본 생성자 : 인풋 메게 변수가 비어있는 생성자를 기본 생선자.
	}
//	메소드 : 함수
//	리턴타입 메소드명(인풋메게변수) {메소드 호출시 프로그램 실행 코드}
//	void : 메소드 호출시 리턴을 돌려주지 않음을 정의
	public void print() {
		System.out.println("A클래스의 print 메소드를 호출했습니다.");
	}
	
}

class B {
	int m =6;
	int n =14;
	double d =21.0;
	
	public void print() {
		System.out.println("B클래스의 print 메소드를 호출했습니다.");
	}
}


public class Object02 { //Object02라는 클래스

	public static void main(String[] args) {
//		변수[지역] : 메소드 내에서만 유지
		int a =10;
		
		
//		자료형
//		클래스명 참조변수 = new A();
//		A : 객체 자료형 , 동일한 패키지 내에 클래스가 존재할때 import 없이 사용가능
//		b : 참조변수 (stack(주소)) : heap(필드,메소드)
//		new : heap공간에 필드와 메소드를 저장하다.
//		A() : 클래스 생성자 호출
		
		
//		1. 객체 생성 : A : Class,b : Object(객체)
//		
		A b = new A();
//		2.필드 출력
		System.out.println("===b 객체의 필드의 값을 출력===");
		System.out.println(b.m);
		System.out.println(b.n);
		System.out.println(b.d);
		
		
//		3.메소드출력
		System.out.println("===b 겍체의 메소드 호출===");
		b.print(); //b 겍체의 print() 메소드 호출
		
		System.out.println("======");
//		하나의 클래스를 생성하면 클래스를 기준으로 여러게의 객체를 생성할수있다.
		
//		A클래스를 기준으로 2번째 생성
//		1. 객체생성
		A bb = new A();
		
//		2. bb객체의 필드 호출
		System.out.println(bb.m);
		System.out.println(bb.n);
		System.out.println(bb.d);
		
//		3.bb객체의 메소드 호출
		bb.print();
		
//		===========
		
		
		
	}

}
