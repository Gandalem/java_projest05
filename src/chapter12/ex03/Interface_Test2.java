package chapter12.ex03;

interface Animal1{
	void cry();
}
interface Animal2{
	void run();
}
interface Animal3{
	void eat();
}

//interface extends interface
interface k extends Animal1,Animal2,Animal3{
	
}

class G implements k{
	@Override
	public void cry() {}
	@Override
	public void eat() {}
	@Override
	public void run() {}
}

class Aa{	//일반 클래스: 모든메소드는 실행부가 존재해야한다.
	void abc() {
		System.out.println("Aa의 abc메소드");
	}
}

abstract class Bb{	//추상 클래스 : 추상메소드가 1개하도 존재하면
	abstract void bcd();
}
// extends 키 다음에는 1개의 클래스만 올수 만 있다. // 클래스는 하나의 부모만 가진다/
//	일반클래스, 추상클래스
//implements 키가 다음에는 여러게의 인터페이스가 올수있다.//인터페이스는 다중상속이 가능
//extends가 먼저 오고 implement : 순서가 바뀌면 안됨
class Cc extends Bb implements Animal1,Animal2,Animal3{
	@Override
	void bcd() {
		
	}
	@Override
	public void cry() {
		
	}
	@Override
	public void eat() {
		
	}
	@Override
	public void run() {
		
	}
}


public class Interface_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
