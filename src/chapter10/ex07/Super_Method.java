package chapter10.ex07;

class A{
	A(){System.out.println("A생성자");}
	
}
class B extends A{
	B(){
		super();
	}
	
}
class C{
	C(int a){
	System.out.println("C생성자");
	}
	
}

class D extends C{
	D(){
		super(3);
		System.out.println("D생성자");
	}
}

public class Super_Method {

	public static void main(String[] args) {
//		super Method 부모클래스의 생성자 호출
//		 - 자식 클래스 생성지는 기본적으로 super, 부모 클래스 의 기본 생성자 호출
//		1.A객체 생성
		A aa = new A();
		System.out.println("=========");
		
//		2. B객체 생성
		B bb = new B();
		System.out.println("========");
//		3.C 객체 생성
		C cc = new C(1);
		
		
		
	}

}
