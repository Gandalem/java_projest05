package chapter12.ex06.a;

// 자식 클래스에서 인터페이스의 메소드 호출 : 
//	default, static 메소드 호출 < = 인터페이스 내에서 기능이 구현된 메소드
interface A{ //인터페이스 : 추상 메소드만 존재해야함(default, static메소드 예외)
	default void abc1() { //인터페이스 //	A인터페이스와 B 인터페이스의 메소드 이름이 동일시오류
		System.out.println("A 인터페이스의 default메소드");
	}
}
interface B{
	default void abc2() { //인터페이스 //	A인터페이스와 B 인터페이스의 메소드 이름이 동일시 오류
		System.out.println("B 인터페이스의 default메소드");
	}
}
abstract class C{ //추상클래스
	C(){}
	void cde() {
		System.out.println("추상클래스의 일반메소드");
	}
}

//class D는 C클래스를 상속하고 있고 A,B인터페이스를 구현하고 있다.
//	extands : 하나의 부모만 상속받을수있다. 클래스 : 하나의 부모만 가능(다중상속이 불가능)
//	implements : 여러 부모를 상속받을수있다. 인터페이스 : 다중 상속받을수있다.
class D extends C implements A,B{ // 일반 클래스 : 추상 메소드 + 일반 메소드+ 일반필드

//	부모의 메소드 호출
//	super : 클래스의 부모 메소드 호출
//	A.super:인터페이스의 부모의 메소드 호출
	void hij() {
		super.cde(); //C클래스의 cde()메소드 호출
	}
	void lmn() {
		A.super.abc1();
		B.super.abc2();
	}
}

public class Interface_Super_Use02 {

	public static void main(String[] args) {
//		객체 생성 후 확인 
		D d1 = new D();
		d1.hij(); //클래스의 메소드 호출
		d1.lmn(); //인터페이스의 메소드 호출
	}

}
