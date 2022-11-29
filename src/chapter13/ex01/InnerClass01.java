package chapter13.ex01;

/*
이너 클래스(Inner Class) : 클래스 내부의 클래스
	1. instance inner class : static 키가 붙지 않는 내부 클래스
		//외부 클래스의 객체를 먼저 생성후 사용이 가능
	2. 정적(static) 이너 클래스 : static 키가 붇어 있으는 내부 클래스
	3. 지역 이너클래스 : 메소드 내부의 선언된 이너 클래스
	
이너클래스 특징 : 
	1.outer class의 접근제어자의 제한 없이 모두 접근이 가능(필드,메소드)
	2. 다른 객체를 생성하지 않고, 내부에서 객체를 만들어서 빠르게 사용하지 위해서.
	 	클래스의 필드와 메소드는 객체화해야 사용이 가능하다.
 */

class A{ //outer class : 필드 , 메소드에 접근 제어자가 붙어 있고,
			//Inner Class를 생성하면 Outer Class의 접근제어자 상관없이 접근
	public int a = 3;	//다른패키지 에서 접근가능, 같은 패키지 에서도 접근 가능
	protected int b= 4;	//다른 패키지에서 접근가능(상속),같은 패키지에서도 접근가능
	int c = 5;			//default , 다른패키지에서 접근 불가능, 같은 패키지에서 만 접근
	private int d = 6;	//다른 패키지 , 같은 패키지 내에서도 접근 불가능 , 같은 클래스 에서만 접근 가능
	
	void abc() {
		System.out.println("A 클래스의 메소드 abc()입니다.");
	}
//	이너 클래스 : 인스턴스 클래스,
//				1.Outer Class의 접근제어자 상관없이 접근 
//				2.기능 구현을 외부의 객체생성 없이 내부 에서 바로 처리
//	class B내부에 outer class의 필드와 메소드를 활용해서 기능 구현을함.
	class B { //Inner Class
		void bcd() {
			//1. Outer Class 의 필드 접근 : 접근 제어자 와 상관없이 모든 필드 접근
			System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
			//2.Outer Class의 모든 메소드 접근 가능 : 접근 제어자 상관 없이 접근
			abc();
		}
		
	}
}

public class InnerClass01 {

	public static void main(String[] args) {
		// 1. 이너 클래스를 사용하지 위해서는 outer클래스의 객체를 먼전 생성해야한다.
		A a = new A(); //outer class 객체 생성
//		아웃터객체 만들고 아웃터 객체 활용해서 내부객체생성 
//		2. 내부 클래스의 객체 생성
		A.B b = a.new B(); // A.B : 외부글래스.내부클래스 : A.B : 내부 클래스의 타입
						   //b : 참조 변수
						   //a.new B(); <= 외부인스턴스명.new 내부 클래스생성자 호출;
		b.bcd();

	}

}
