package chapter13.ex05;

//인터페이스를 상속하는 이너클래스
//1.인터페이스를 구현한 자ㅅ

interface C {
//	public abstract 생략됨
	void bcd();
	
}

class A{
//	B를 객체화 해서 C타입으로 선언
	C c = new B();
//	메소드
	void abc() {
		c.bcd(); //C 인터페이스 bcd()호출 , 구현한 클래스의 B의 bcd()호출
	}
	
//	이너 클래스 : 인터페이스를 상속하는 이너 클래스
	class B implements C {
		@Override
		public void bcd() {
		System.out.println("인스턴스 이너 클래스");	
		}
	}
}


public class AnonimousClass01 {

	public static void main(String[] args) {
//		1. 객체를 생성후 메소드 호출
		A a = new A();
		a.abc(); //인터페이스 의 구현한 클래스 메소드호출 
	}

}
