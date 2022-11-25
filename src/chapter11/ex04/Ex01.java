package chapter11.ex04;

abstract class Car { //트럭 , 자가용 ,굴삭기 <- 추상 메소드 구현한 클래스 생성
	abstract void run();
	abstract void eat();
}
class Car1 extends Car{
	@Override
	void run() {
		System.out.println("트럭은 굴러갑니다");
	}
	@Override
	void eat() {
		System.out.println("트럭의 주유합니다.");
	}
}
class Car2 extends Car{
	@Override
	void run() {
		System.out.println("자가용차가 굴러갑니다.");
	}
	@Override
	void eat() {
		System.out.println("자가용의 주유합니다.");
	}
}
class Car3 extends Car{
	@Override
	void run() {
		System.out.println("굴삭기는 굴러갑니다.");
	}
	@Override
	void eat() {
		System.out.println("굴삭기의 주유합니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		System.out.println("트럭 콘크리드 클래스 출력 : ");
		Car c1 = new Car1();
		c1.eat();
		c1.run();
		System.out.println("======================");
		System.out.println("자가용 콘크리드 클래스 출력 : ");
		Car c2 = new Car2();
		c2.eat();
		c2.run();
		System.out.println("======================");
		System.out.println("굴삭기 콘크리드 클래스 출력 : ");
		Car c3 = new Car3();
		c3.eat();
		c3.run();
		
		
		
	}

}
