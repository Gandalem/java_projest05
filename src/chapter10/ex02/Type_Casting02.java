package chapter10.ex02;

class A{}
class B extends A{}
class C extends B{}
class D extends B{} 

public class Type_Casting02 {

	public static void main(String[] args) {
//		1. 업케스팅 (자동으로 변환 ) : 생략시 검파일어 자동으로 추가, 자식클래스 객체 생성 -> 타입을 부모 
//		ac : A,B,C를 모두 내포하고있고 A타입으로 정의 <A접근>
		A ac = (A)new C();
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D);
		
		System.out.println("=========");
		
//		bc : A,B,C 를 모두 내포하고있는 B타입으로 정의 <A,B접근>
		B bc =new C();
		System.out.println(bc instanceof A);
		System.out.println(bc instanceof B);
		System.out.println(bc instanceof C);
		System.out.println(bc instanceof D);
		
//		bc는 B 타입으로 정의 A타입으로 업케스팅
		A a = bc;
		System.out.println("===========");
//		2. 다운 캐스팅 (수동으로 명시) : 캐스팅이 불가능 해도 컴파일러가 체크 하지 않는다 . 실행시 예외가 발생
		A aa = new A();
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(aa instanceof C);
		System.out.println(aa instanceof D);
		
		B ba=null;
		if (aa instanceof B) {
			ba = (B) aa; //다운캐스팅은 실행행전까지 오류가 안뜬다
		} else {
			System.out.println("aa는 B를 내포하고있지않아서 다운캐스팅 불가합니다.");
		}
		
		C ca=null;
		if (ca instanceof C) {
			ca = (C) aa; //다운캐스팅은 실행행전까지 오류가 안뜬다
		} else {
			System.out.println("aa는 C를 내포하고있지않아서 다운캐스팅 불가합니다.");
		}
		
		System.out.println("=============");
//		bd : 
//		
		B bd = new D();
		System.out.println(bd instanceof A);
		System.out.println(bd instanceof B);
		System.out.println(bd instanceof C);
		System.out.println(bd instanceof D);
		
		
	}

}
