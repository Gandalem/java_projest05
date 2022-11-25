package chapter10.ex10;

//java.lang 패키지의 모든 클래스는 import 없이 사용이 가능하다

class A { //extends Object 모든 자바의 최상위 부모 클래스는 Object이며 생략되어있다
//	자식클래스는 하나의 부모만 상속할수있다.
//	자바는 다중 상속이 불자
//	인터페이스는 다중 Implements 가 가능하다.
	int m = 3;
	int n = 4;
	String name;
		
//	toString() : Object 클래스의 메소드,
//	객체 출력시 toString() 이 작동이 되고, 기본적으로는 패키지 이름. 클래스@HeshCode()
//	객체 자체를 출력시 객체의 필드의 값을 출력하도록 재정의 해서 사용
	
	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}
	
	
	
}


public class Inheritance_Object01 {

	public static void main(String[] args) {
		
		A a = new A();
		
//		겍체 자체를 출력시 Object 클래스의 toString() 
//		패키지 이름. 클래스@HeshCode()
//		HeshCode -> 참조주소 : 객체에 저장된 Heap 메모리의 주소
		
		System.out.println(a);
		System.out.println(a.toString());
		
//		String 클래스는 toString()가 재정의 되어져 있다.
		String s1 = new String("안녕");
		System.out.println(s1);

	}

}
