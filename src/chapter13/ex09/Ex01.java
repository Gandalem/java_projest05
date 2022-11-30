package chapter13.ex09;

interface Car{
	void run();
	void stop();
	void start();
}

class CarPlay{
	void abc(Car c1) {
		c1.run();
		c1.start();
		c1.stop();
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		4번째 방법으로 출력, car클래스의 abc()호출
//		1. 메소드 호출하기위한 객체 생성
		CarPlay cp = new CarPlay();
		
		
//		2. 메소드 호출시 car인터페이스의 메소드를 구현해서 매게변수로 인풋 
		Car c1 = new Car() { // <= 말이 안되는 코드
			@Override
			public void run() {
				System.out.println("자동차 달림");
			}
			@Override
			public void start() {
				System.out.println("자동차 출발");
			}
			@Override
			public void stop() {
				System.out.println("자동차 멈춤");
			}
		};
		
		cp.abc(c1);
		
		cp.abc(new Car() {
			@Override
			public void run() {
				System.out.println("자동차 달림");
			}
			@Override
			public void start() {
				System.out.println("자동차 출발");
			}
			@Override
			public void stop() {
				System.out.println("자동차 멈춤");
			}
		});
		
	}

}
