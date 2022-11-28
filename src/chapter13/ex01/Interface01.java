package chapter13.ex01;


public interface A{ //인터페이스 이름: 첫자는 반드시 영문 대문자. //정식표헌
//	모든 필드는 : public static final
//		static : 객체 생성 없이 호출이 가능하다. A.a
//		final : 변수를 상수로 만들고 값을수정할수없다.
	public static final int a = 3;
	
//	모든 메소드는 : public abstract
	public abstract void abc();// 모든 메소드는 실행블럭{}없어야한다 // abstract 가 들어가 서 이다
}

//인터페이스의 구현되어있지 않는 메소드를 구현한 클래스
class AA implements A {	//인터페이스를 구현한 클레스
	@Override
	public void abc() {
		System.out.println("A인터페스로 구현한 AA클래스");
	}
}

//일반적인 표현, 축약표현 <= 주로 사용
interface B{
//	public static final 이생략됨
	int a = 3;
//	public abstract 이생략되서 실행문이 들어가면 에러 :모든메소드는 서언부만 있고 구현부가 없어야 한다.(예외, default,static)
	void abc(); // default 가 아니하 public 이다!
		
}
class Bb implements B {	//인터페이스를 구현한 클레스
	
	@Override
	public void abc() { //public 을 반드시 붙여줘야한다.
		System.out.println("B인터페이스로 구현한 Bb클래스");
	}
}
// 추상 클래스 추상 메소드를 하나라도 포함한 클래스, 추상 클래스 내에 추상메소드는 abstract 키를 생략하면 안됨
abstract class C {
	
	int m = 4; //일반 인스턴스 필드 : 수정이 가능함
	
	void bcd() { //일반 인스턴스 메소드 : 구현부가 있는 인스턴스 메소드
		System.out.println("추상메소드 C클래스의 메소드");
	} 
	
	
//	추상 클래스 내에 추상메소드는 abstract 키를 붙여줘야한다 
	abstract void abc();
	
}

class Cc extends C{
	@Override
	void abc() {
		System.out.println("추상클래스로 구현한 메소드");	
	}
}

public class Interface01 {

	public static void main(String[] args) {
		/*
		 인터페이스 (Interface) : 내부와 외부를 연결시켜주는 접점, 콘샌트
		 	-객체 생성이 불가함. 타입으로 지정은 가능
		 	-모든필드는 public static final 이 생략되어있다
		 		: 값을 수정할수없다.
		 	-모든 메소드는 public abstract 이생략됨 (예외,default,static 메소드 :1.8 버전)
				: 모든 메소드는 선언부만 있어야 한다. 구현부가 있으면 안됨 : {}
				: 예외,default,static 메소드는 인터페이스 에서 유일하게 구현부를 가지는 메소드
			-하나의 클래스는 하나의 부모 클래스를 상속 해야한다.,자바는 다중상속 불가.
			-하나의 클래스는 여러개의 인터페이스를 다중상속이 가능하다.
		 */
//		1. 인터페이스는 객체화 할수 없다. 구현되지 않는 메소드가 있기 때문에
//		A a = new A();
//		B b = new b();
		
//		2.타입지정은 가능하다 <= (중요함, 많이 사용)
		A a1 = new AA();	//A : 인터페이스 , Aa : 인터페이스를 구현한 클래스
		a1.abc();			//오버라이딩된 메소드 호출
		B b1 = new Bb();	
		b1.abc();			//오버라이딩된 메소드 호출
		
		System.out.println("================");
//		3. 인터페이스 필드는 public static final 생략됨
//			static 객체생성 없이 호출리 가능 : A.a
//			 final 값을 수정 불가
		System.out.println(A.a); //인터페이스명.필드명
		System.out.println(B.a); //인터페이스명.필드명
		
//		4.필드의 값을 수정할수 없다.
//		A.a = 10; //final이 있으므로 값 수정이 불가
//		B.a = 20; //final이 있으므로 값 수정이 불가
		
		System.out.println("=======추상클래스========");
		
//		1. 추상클래스 : 객체 생성 불가
//		C c1 = new C(); //C : 추상클래스
//		추상클래스 : 구현한 클래스를 객체화 해서 타입 지정을 가능
		C c2 = new Cc();
		System.out.println(c2.m); // 인스턴스 필드 : 객체 생성 호출 가능
//		System.out.println(C.m); //인스턴스 필드
		
		c2.m = 44;
		System.out.println(c2.m); // 44 // 값수정이 가능하다.(final이 없어서)
		
		c2.bcd();	//C클래스의 일반 메소드 (인스턴스 메소드)
		c2.abc();	//오버라이딩된 메소드 출력, C 타입의 abc()를 호출 Cc타입의 abc()
		
		
		

	
	}

}
