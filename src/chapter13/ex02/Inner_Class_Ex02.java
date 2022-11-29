package chapter13.ex02;

// 이너 클래스에서 외부 클래스의 필드와 메소드 접근
//메소드 오버라이딩 : 
//	1.반드시 상속관계가 있어야한다.
//	2. 인스턴스 메소드 오버라이딩
//	3. 인스턴스필드, 정적필드, 정적 메소드는 오버라이딜 되지 않는다. 

class A{ //outer class 
	//필드
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
//	메소드
	void abc() { //오버라이딩 되지 않는다.
		System.out.println("A클래스의 메소드abc()");
	}
	void def() {
		System.out.println("A클래스의 def메소드");
	}
	
	class B{
		//
		int a = 5;
		int b = 6;
		
//		이너 클래스의 메소드
		void abc() { //오버라이딩 되지 않는다.
			System.out.println("B클래스의 abc()");
		}
		void bcd() {
			//필드의 값 호출
			System.out.println(a);
			System.out.println(b);
			System.out.println("=========");
//			이너클래스에서 Outer클래스의 필드호출
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			
			System.out.println();
			
			//메소드 호출
			abc(); //this.abc : 이너클래스의 메소드
			
			System.out.println("========");
			
			A.this.abc(); // 아웃터 클래스의 abc();
			
//			이너 클래스와 아웃터 클래스에서 중복되지 않는 필드 호출
			System.out.println("==========");
			System.out.println(c); //이읏터 클래스 필드 : 
			System.out.println(d);
			
//			외부의 주복되지않는 메소드
			def();
		}
	}
	
}

public class Inner_Class_Ex02 {

	public static void main(String[] args) {
		A a1 = new A();
		A.B b1 = a1.new B();
		
		b1.bcd();

	}

}
