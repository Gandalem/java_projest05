package chapter10.ex01;

class Animal { 	//Animal 클래스를 상속해서 Tiger, Eagle, Lion 클래스를 생성해서 상속
				// 자식 클래스에서 필드 1개 메소드 1개씩 각각 정의
				//LionChild클래스는 Lion클래스를 상속해서 필드 1개 메소드 1개씩 각각상속하기
	String name;
	int age;
	String color;
	
	
	void eat(){
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal{
	int money1;
	void print1() {
		System.out.println("호랑이");
	}
}
class Eagle extends Animal{
	int money2;
	void print2() {
		System.out.println("독수리");
	}
}
class Lion extends Animal{
	int money3;
	void print3() {
		System.out.println("사자");
	}
}
class LionChild extends Lion{
	int money4;
	void print4() {
		System.out.println("어린사자");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		System.out.println("===Animal의 필드와 메소드===");
		Animal a = new Animal();
		
		System.out.println(a.age);
		System.out.println(a.color);
		System.out.println(a.name);
		
		System.out.println("===Tiger의 필드와 메소드===");
		Tiger t = new Tiger();
//		부모의 필드와 메소드
		t.age = 21;
		t.color = "red";
		t.name = "tiger";
		System.out.println(t.age);
		System.out.println(t.color);
		System.out.println(t.name);
		t.eat();
//		자식의 필드와 메소드
		t.money1 = 20000;
		System.out.println(t.money1);
		t.print1();
		
		System.out.println("===Eagel의 필드와 메소드===");
		Eagle e = new Eagle();
//		부모의 필드와 메소드
		e.age = 22;
		e.color = "orange";
		e.name = "eagle";
		System.out.println(e.age);
		System.out.println(e.color);
		System.out.println(e.name);
		e.eat();
//		자식의 필드와 메소드
		e.money2 = 30000;
		System.out.println(e.money2);
		e.print2();
		System.out.println("===Lion의 필드와 메소드===");
		Lion l = new Lion();
//		부모의 필드와 메소드
		l.age = 23;
		l.color = "yello";
		l.name = "Lion";
		System.out.println(l.age);
		System.out.println(l.color);
		System.out.println(l.name);
		l.eat();
//		자식의 필드와 메소드
		l.money3 = 40000;
		System.out.println(l.money3);
		l.print3();
		System.out.println("===LionChild의 필드와 메소드===");
		LionChild lc = new LionChild();
//		부모의 필드와 메소드
//		Animal 상속
		lc.age = 25;
		lc.color = "green";
		lc.name = "lionchild";
		System.out.println(lc.age);
		System.out.println(lc.color);
		System.out.println(lc.name);
		lc.eat();
//		Lion 상속
		lc.money3 =40000;
		System.out.println(lc.money3);
		lc.print3();
//		자식의 필드와 메소드
		lc.money4 = 50000;
		System.out.println(lc.money4);
		lc.print4();

	}

}
