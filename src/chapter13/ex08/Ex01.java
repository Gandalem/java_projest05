package chapter13.ex08;

interface Animal{
	void cry();
	void fly();
}

//인터페이스를 사용해서 4가지 형테로 출력
//1. animal을 구현한 inner클래스 생성후 메소드 출력
//2. animal을 익명 클래스로 생성해서 출력
//3. 객체 메소드의 인풋메게 변수로 animal타입을 인풋 받아서 출력 : 참조 변수 생성
//4. 객체 메소드의 인풋메게 변수로 animal타입을 인풋 받아서 출력 : 참조 변수 없이 출력 

class A1{
	Animal a1 = new B1();
	void abc() {
		a1.cry();
		a1.fly();
	}
	
	
	class B1 implements Animal{
		@Override
		public void cry() {
			System.out.println("드래곤 포효");
			
		}
		@Override
		public void fly() {
			System.out.println("드래곤 날다");
		}
		
	}
	
}

class A2{
	Animal a2 = new Animal() {
		@Override
		public void cry() {
			System.out.println("드래곤 포효");
			
		}
		@Override
		public void fly() {
			System.out.println("드래곤 날다");
			
		}
	};
	void bcd() {
		a2.cry();
		a2.fly();
	}
}

class A3{
	void cde(Animal a) {
		a.cry();
		a.fly();
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		System.out.println("====이너클래스===");
		A1 a1 = new A1();
		a1.abc();
		
		System.out.println("====익명클래스===");
		A2 a2 = new A2();
		a2.bcd();
		
		System.out.println("====참조변수 생성===");
		A3 a3 = new A3();
		
		Animal an = new Animal() {
			@Override
			public void cry() {
				System.out.println("드래곤 포효");
			}
			@Override
			public void fly() {
				System.out.println("드래곤 날다");
			}
		};
		a3.cde(an);
		
		System.out.println("===참조변수 없이 출력====");
		a3.cde(new Animal() {
			@Override
			public void cry() {
				System.out.println("드래곤 포효");
			}
			@Override
			public void fly() {
				System.out.println("드래곤 날다");
			}
		});
	}

}
