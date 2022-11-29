package chapter13.ex05.a;
//1. 인터페이스를 구현한 클래스를 생성루 출력. < - 빈번하게 사용되는경우
interface A{
	void cry();
	void fly();
	
	
}

class B{
//	인터타입으로 객체 생성
	A c1 = new C();
	void abc() {
		c1.cry();
		c1.fly();
	}
//	이너 클래스 :외부파일에 별도로 생성하지 않고 클래스 내부에 생성후 바로 사용
	class C implements A {
		@Override
		public void cry() {
			System.out.println("투명드래곤은 포효했다");
		}
		@Override
		public void fly() {
			System.out.println("투명드래곤은 날았다");
		}
	}
}
//A클래스의 abc ()메소드 호출시 C클래스의 구현된 메소드 출력

public class Anonimous_Class01 {

	public static void main(String[] args) {
		B c1 = new B();
		c1.abc();

	}

}
