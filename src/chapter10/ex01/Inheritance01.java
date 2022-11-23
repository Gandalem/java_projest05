package chapter10.ex01;

class Human{ //부모클래스(Super class) : 자식 클래스의 공통된 특징 을 저장(필드 메소드)
	
//	필드(속성)
	String name; //사람이름
	int age; //사람의 나이
	
	
//	메소드 : 프로그래밍의 기능을 구현해 놓은것
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 사람은 잠을 잡니다.");
	}
	
}

//자식 클래스 : 부모클새스의 모든 필드와 메소드를 물려받는다.
class Student extends Human{
	//부모 클래스 : Human
	//자식 클래스 : Student < -부모클래스의 필드와 메소드를 물려받는다.
	
//	1.부모클래스의 모든 필드와 메소드를 그대로 자식클래스 내부레 들오와있다
//	2.자식클래스에서만 적용되는 필드와 메소드를 추가적으로 등록해서 사용.
	
	int studentID;
	
	Student(){}
	
	void gotoschool() {
		System.out.println("학생은 학교에 다닙니다.");
	}
	
	
	
}

class Worker extends Human{
	int workerID;
	void gotowork() {
		System.out.println("근로자는 일하러 일터로 갑니다.");
	}
}

class Professor extends Human{
	int professorID;
	void gotoTeach() {
		System.out.println("교수님은 가르치러 갑니다");
	}
}

class Student2 extends Student{
//	Student2->Student->Human
//	Human의 모든 필드와 메소드 상속
//	Student의 모든 필드와 메소드 상속
	
	int student2ID;
	void student2() {
		System.out.println("학생2입니다.");
	}
	
}


public class Inheritance01 {

	public static void main(String[] args) {
//		상속(Inheritance) : 부모클래스의 필드(속성)와, 메소드를 자식클래스에서 물려받아서 사용함.
//		객체 지향 언어의 꽃(제일 중요함),
//		중복된 코드를 줄려 줄수있다.
//		다향성 : 부모클래스를 상속박아서 다향한 형태로 출력
//		배열이나 컬랙션에서 부모클래스 이름으로 (업캐스팅) 저장 해서 출력 
		
//		1.학생 객체 생성 : 부모의 필드와 메소드 + 자식의 필드 메소드 모두 사용 가능
		Student st1 = new Student();
		st1.name = "홍길동";
		st1.age = 30;
		System.out.println(st1.name);
		System.out.println(st1.age);
		st1.eat();
		st1.sleep();
		st1.gotoschool();
		System.out.println("======");
//		2.사람 겍체 생성 : 부모의 필드와 메소드만 사용가능
		Human h1 = new Human();
		h1.eat();
		h1.sleep();
//		h1.gotoschool(); //자식클래스에만 존재하는 메소드
		
//		자식의 필드와 메소드 출력
		System.out.println("==자식의 필드와 메소드 출력==");
		st1.studentID = 222;
		System.out.println(st1.studentID);
		st1.gotoschool();
		System.out.println("=Worker 필드와 메소드 출력=");
		Worker wk1 = new Worker();
//		자식의 메소드와 필드 출력
		wk1.workerID = 111;
		System.out.println(wk1.workerID);
		wk1.gotowork();
//		wk1.gotoschol(); student 와 동일한 부모클래스는 상속했지만 전혀 다른 클래스이다
		
//		부모의 메소드와 필드 출력
		wk1.age = 40;
		wk1.name = "이순신";
		System.out.println(wk1.age);
		System.out.println(wk1.name);
		wk1.eat();
		wk1.sleep();
		System.out.println("============");
		System.out.println("Student2->Student->Human");
		
		Student2 s2 = new Student2();
//		Human의 메소드와 필드
		s2.age=27;
		s2.name="신사임둥";
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		s2.eat();
		s2.sleep();
		System.out.println("============");
//		student 필드와 메소드
		s2.studentID = 1234;
		System.out.println(s2.studentID);
		s2.gotoschool();
		System.out.println("===========");
//		student2 필드와 메소드
		s2.student2ID =5678;
		System.out.println(s2.student2ID);
		s2.student2();

	}

}
