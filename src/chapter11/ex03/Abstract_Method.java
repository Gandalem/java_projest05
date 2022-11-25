package chapter11.ex03;

abstract class Animal{ //클래스 내부에 추상 메소드가 1개라도 존재 하면 , 추상 클래스가 되어야한다.
	int a;
	int b;
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
//	추상 메소드 : 실행블락이 존재하지 않는 메소드
//		반드시 자식 클래스에서 오버라이딩해서 구현부를 만들어야 한다.
//		프로잭트 설계시 메소드 이름을 다른이름으로 사용하지 못하도록 할수있다.
//		부모 클래스에서는 메소드 이름을 선언만 해주고, 자식 클래스에서 구현하도록 함.
//		자식 클래스에서는 메소드 이름을 변경 할수 없다. 
	abstract void run();
		
	
}

class Cat extends Animal { //콘크리드 클래스, 부모의 추상메소드를 모두 구현한 클래스 
//	부모 클래스에서 추상메소드가 존재할경우 자식에서는 추상메소드를 오버라이딩 해서 구현해야한다.
//	부모 클래스의 추상메소드를 구현하지않는 경우는 자신도 추상 클래스가 되어야 한다.
	
	@Override
	void run() {
		System.out.println("고양이가 달립니다.");
	}
}
abstract class Dog extends Animal{
	
}

public class Abstract_Method {

	public static void main(String[] args) {
		

	}

}
