package chapter12.ex01;

abstract class Animal{
	String name;
	int age;
	
	Animal(){}
	
public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	추상메소드 : 실행블럭이 없고 선언만 되어있는 메소드
//		하위클래스에서 추상메소드를 반드시 구현해야 한다.
	abstract void cry();	//인풋만 선언되고, {} 실행부
	abstract void run();
	
//	toStirng메소드 재정의 : //상위클래스에서 정의 해 놓으면 자식 클래스에서 상속되어 내려감.
//	Object 클래스 의 메소드 : 객체를 출력했을때 객체의 Heap 감조주소를 출력하지 않고 필드의 값을 출력
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	} 
	
}

class Cat extends Animal{ //콘크리트 클래스, 추상 클래스
//	생성자 사용해서 필드의 값을 입력
	
	Cat(){}
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
	
	
	@Override
	void cry() {
	System.out.println("야옹");
	}
	@Override
	void run() {
		System.out.println("고양이는 껑충하고 뜁니다.");
	}
	
}

class Dog extends Animal{
	
	Dog(){}
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("멍멍");
	}
	@Override
	void run() {
		System.out.println("개는 달립니다.");
	}
}

public class Abstract_Class {

	public static void main(String[] args) {
//		객체 생성후 값입력
		
		Animal a1 = new Cat("고양이",10);
		Animal a2 = new Dog("개",20);
//		객체를 배열에 저장
		Animal[] arr = new Animal[] {a1,a2};
//		for문을 사용해서 객체의 정보를 출력
		for(int i =0;i<arr.length;i++) {
//			객체 자체를 출력 : toString() : 객체의 메모리의 정보를 출력
			System.out.println(arr[i]);
			arr[i].cry();
			arr[i].run();
		}
		for(Animal i :arr) {
//			객체 자체를 출력 : toString() : 객체의 메모리의 정보를 출력
			System.out.println(i);
			i.cry();
			i.run();
		}
		
	}

}
