package chapter10.ex02;

import chapter09.ex01.A;

class Animal{
	String name;
	int age;
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal{
	String tigersound;
	void tigereat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}
class Tigerchild extends Tiger{
	String tigerchildSound;
	void tigerchildeat() {
		System.out.println("새끼호랑이는 젖을 먹습니다.");
	}
}


public class TypeCasting01 {

	public static void main(String[] args) {
//		Type Casting(형변환):
//		1. 업캐스팅 : Tiger(자식)객체 ->Animal(부모)
//		업캐스팅 : 자식객체를 생성해서 부모타입으로 정의, 자동으로 일어남
//		a1 : Tiger필드, 메소드 + Animal필드와 메소드도 포함
//		Animal 의 필드와 메소드만 사용가능
		Animal a1 = new Tiger(); //Tiger 객체를 생성해서 Animal타입으로 지정
//		a1은 Animal타입의 필드와 메소드만 사용사능
		System.out.println("===업캐스팅===");
		a1.age=21;
		a1.name="호랑이";
		System.out.println(a1.name);
		System.out.println(a1.age);
		a1.eat();
		
//		2.다운 캐스팅 : Animal (부모 타입) -->Tiger(자식타입),수동으로 명시
//			a1 : Tiger필드, 메소드 + Animal필드와 메소드도 포함
//			a1 : Animal타입 --->t2 (Tiger) 타입으로 다운
		System.out.println("===다운캐스팅===");
		Tiger t2 = (Tiger) a1;
//			t2 : Animal과 Tiger의 필드와 메소드를 모두접근가능
		t2.age = 10;
		t2.name = "호랑이2";
		
		System.out.println(t2.age);
		System.out.println(t2.name);
		
		t2.eat();
		
//		Tiger의 필드의 필드와 메소드도 접근이 가능
		t2.tigersound="어흥";
		
		System.out.println(t2.tigersound);
		
		t2.tigereat();
		System.out.println("======");
//		2. Tiger타입으로 객체생성 : Animal,Tiger의 필드와 메소드 모두 접근가능
		Tiger t3 =new Tiger();
		
//		다운 캐스팅 : 실행시 오류 발생, t3 에는 TigerChild는 내포하고 있지 않기 때문에 
//			다운캐스팅 실행시 오류발생
		System.out.println("===instenceof 출력===");
		System.out.println(t3 instanceof Animal); //true
		System.out.println(t3 instanceof Tiger); //true
		System.out.println(t3 instanceof Tigerchild); //false
//		다운캐스팅 할때에는 반드시 instance of를 반드시 사용해야한다.
		if(t3 instanceof Tigerchild) { //
			Tigerchild t4 = (Tigerchild)t3;
		}
		
		System.out.println("=====");
//		1. 업캐스팅 : a3 : Animal, tiger,tiegerChild
		Animal a3 = new Tigerchild();
		System.out.println(a3 instanceof Animal); 
		System.out.println(a3 instanceof Tiger); 
		System.out.println(a3 instanceof Tigerchild);
		
//		a3: Animal 의 필드와 메소드만 접근
		a3.name = "호랑이4";
		a3.age = 7;
		a3.eat();
		
		
		Tiger t5 = null;
//		a3를 tiger 타입으로 다운 캐스팅
		if(a3 instanceof Tiger) {
			t5 = (Tiger) a3;
		}
		
//		Animal
		t5.age = 10;
		System.out.println(t5.age);
		t5.name = "호랑이5";
		System.out.println(t5.name);
		
//		tiger
		t5.tigersound = "어흥";
		
//		3. a3를 tigerChild로 다운 캐스팅
		Tigerchild t6 = null;
		if(t3 instanceof Tigerchild) {
			t6 = (Tigerchild) t3; 
		}
//		t6 : tigerChild 타입(Animal,Tiger,TigerChild의 필드와 메소드를 모두 접근가능)
		t6.age =10;
		t6.tigersound = "어흥어흥";
		t6.tigerchildSound = "어흠";
		
//		t6(tigerChild) -->Animal
		
		Animal t7 =t6; //t7:Animal,Tiger,TigerChild 내포하고있는 Animal
		Tiger t8 = t6; //t8:Tiger,TigerChild 내포하고있는 Tiger타입
		
		
		
	}

}
