package chapter11.ex04;

abstract class Animal { //자식 클래스에서 반드시 구현하라는 의미
	abstract void eat();
	abstract void run();
	abstract void cry();
}
class Cat extends Animal{ //콘크리트 클래스란: 추상메소드를 모두 구현한 메소드
	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다");
		
	}
	@Override
	void run() {
		System.out.println("고양이가 달린다.");
		
	}
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}
}

abstract class Dog extends Animal{ // 추상클래스의 추상메소드 일부만 구현한경우 추상클래스가 된다 왜냐 추상 메소드가 하나라도 존재 하기 때문이다 
	@Override
	void eat() {
		System.out.println("개는 뼈다귀를 먹는다.");
		
	}
	
	@Override
	void cry() {
		System.out.println("개는 멍멍");
		
	}
}

class DogChild extends Dog{ //추상클래스의 미구현 부분을 구현하면 곤크리드 클래스가 된다
	@Override
	void run() {
		System.out.println("강아지는 달린다");
		
	}
}

public class Abstract_Method {

	public static void main(String[] args) {
//		추상 클래스는 객세를 생성하지 못한다. 타입으로 지정은 가능하다.
//		Animal. Dog 는 추상 클래스이므로 객체생성이 안된다.
		
//		1.Animal 객체 생성
		
//		Animal a1 = new Animal(); //오루 발생: 추상클래스는 객체화 하지 못한다.
//		animal 의 메소드 호출시 오버라이딩 된 cat의 메소드 호출
		Animal a2 = new Cat();
		a2.eat();
		a2.run();
		a2.cry();

		System.out.println("========");
//		cat객체화 해서 cat타입으로 지정
		Cat c2 = new Cat();
		c2.cry();
		c2.run();
		c2.eat();
		
		System.out.println("=========");
//		Dog는 추상클래스이므로 객체화 할수없다(타입으로는 지정 가능)
//		Dog d1 = new Dog(); //오류 발생
		Animal a3 = new DogChild();
		a3.cry();
		a3.run();
		a3.eat();
		
		System.out.println("========");
//		dogChild를 객체화 해서 Dog 타입으로 지정
		Dog d3 = new DogChild();
		d3.cry();
		d3.eat();
		d3.run();
		
		System.out.println("=========");
//		DogChild를 객체화해서 Dog Child 타입으로 지정
		DogChild dh1 = new DogChild();
		dh1.cry();
		dh1.eat();
		dh1.run();
	}
	

}
