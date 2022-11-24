package chapter10.ex06;

import chapter08.ex01.B;

class Aa{
	void abc() {
		System.out.println("Aa 클래스의 abc()메소드");
	}
	void ab() {
		System.out.println("Aa클래스의 ab()");
	}
}

class Bb extends Aa{
	@Override
	void abc() {
		System.out.println("Bb 클래스의 abc()메소드");
	}
	
	void bcd() {
		abc(); 	//this.abc(); 자신의 클래스의 abc();
	}
	void cde() {
		super.abc(); //부모클래스의 abc();
	}
	void def() {
		super.ab(); //부모 클래스의 ab();
	}
}






public class Super_KeyWord {

	public static void main(String[] args) {
//		1. 객체 생성
//		bb : Aa,Bb가 내포되어있고, 타입을 BB타입으로 호출
		Bb bb = new Bb();
		
//		2. 메소드 호출
		bb.bcd();
		bb.cde();
		bb.def();
		

	}

}
