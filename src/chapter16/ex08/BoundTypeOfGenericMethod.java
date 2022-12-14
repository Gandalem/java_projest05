package chapter16.ex08;

class A{
//	Number : boolean,charter 를 제외 정수,실수를 처리하는
//		byte,short,Integer,Long,Float,Double
	public <T extends Number>void method1(T t){ //Number로 타입 제한
//		Object 클래스의 메소드외의 Number의 메소드를 사용가능함.
		System.out.println(t.intValue()); // intvalue() : Number의 메소드
	}
}
//인터페이스
interface MyInterface{
	void print(); //public abstract
}

class B{
//	T : MyInterface 하위의 구현 클래스가 올수 있다. , 주위 : 타입을 제한 할때는 extends를 사용.
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}


public class BoundTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<Double>method1(10.11);
		a.method1(8.8); //Double 생략
		a.<Integer>method1(100);
		a.method1(200); //Integer 생략
// (오류)	a.<String>method1("안녕");
		
		B b = new B();
		b.<MyInterface>method1(new MyInterface() { //많이쓰임
			
			@Override
			public void print() {
				System.out.println("print() 구현됨");
				
			}
		});
		
		b.method1(new MyInterface() { //많이쓰임 <MyInterface> 생략됨
			
			@Override
			public void print() {
				System.out.println("print() 구현됨");
				
			}
		});
		
		

	}

}
