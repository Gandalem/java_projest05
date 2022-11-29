package chapter12.ex06;

interface A {
	
//	기준의 와이파이 기능의 메소드만 구현된상테에서 새로운 기능인 블루투스 기능이 추가됨
//	2022년에 세로운 기능 추가.
//	default메소드 : 인터페이스 내에서 구현부가 있는 메소드,
//		모든 자식 클래스에서 상속되어 내려감. 새로운 기능을 추가 할때 자식 클래스에서 오류 없이 기능추가

	
	default void cde() { //	default 메소드 앞에는 public이 생략되어있다.
		System.out.println("블루투스 기능이 추가됨");
	};
//	추상메소드  : public abstract 가 생략됨 <= 실랭부가 없는 메소드 {}
//		자식 클레스 에서는 선언만된 메소드를 구현해야될 의무
	void abc();//2000년에 구현된 메소드
	void bcd();//2005년에 구현된 메소드
//	void cde();//2010년에 구현된 메소드
}
// 부모를 상속하지 않으면 Object를 상속한다.
class B implements A{ //extends Object가 생략되어 있다.
	@Override
	public void abc() {
		System.out.println("와이파이 기능1");
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능2");
	}
	public void def() {// 자식 클래스에서 부모의 인터페이스의 메소드 호출 A:super.메소드명
//		인터페이스의 메소드를 호출시 : 
		A.super.cde(); // 인터페이스 A의 cde()메소드 호출
//		super.cde(); //Object 클래스의 cde의 메소드 호출
	}
}


public class Interface_Super_Use {

	public static void main(String[] args) {
//		자식클래스에서 인터페이스에 구현된 default 메소드 호출시 : 

//		1.객체 생성
		A a1 = new B();
		a1.abc(); //A 인터페이스에 존재함. //B클래스에 서 오버라이딩됨
		a1.bcd(); //A 인터페이스에 존재함. //B클래스 에서 오버라이딩됨
		a1.cde(); //A 인터페이스에 존재함. //default 메소드
		
//		a1을 B타입으로 다운 캐스팅해야 def()메소드를 호출할수 있다.
		B b1 = (B) a1;
		b1.def();
		
	}

}
