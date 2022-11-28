/*
package chapter12.ex04;

interface Animal {}

interface Animal1 extends Animal{
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}

//cat,tiger <=  cry,run 메소드만 구현

class Cat implements Animal1,Animal2{
	@Override
	public void cry() {
		System.out.println("야옹");	
	}
	@Override
	public void run() {
		System.out.println("고양이 달리다");
	}
}

class Tiger implements Animal1,Animal2{
	@Override
	public void cry() {
		System.out.println("어흥");	
	}
	@Override
	public void run() {
		System.out.println("호랑이 달리다");
	}
}


//Dog,Lion  <=  run,eat 메소드만 구현
class Dog implements Animal2,Animal3{
	
	@Override
	public void eat() {
		System.out.println("개는 먹다");
	}
	@Override
	public void run() {
		System.out.println("개 달리다");
	}
}

class Lion implements Animal2,Animal3{
	
	@Override
	public void eat() {
		System.out.println("사자는 먹다");
	}
	@Override
	public void run() {
		System.out.println("사자는 달리다");
	}
}
//Eagle  <= cry,run,eat 메소드만 구현
class Eagle implements Animal1,Animal2,Animal3{
	@Override
	public void cry() {
		System.out.println("끼옷");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 먹다");
	}
	@Override
	public void run() {
		System.out.println("독수리는 날다");
	}
}
//배열의 넣어서 오버라이딩된 메소드 출력

//Instance Of 를 사용해서 객체 내부에 Cat,Tiger 타입이 존재하면 cry, run메소드 호출
//Instance Of 를 사용해서 객체 내부에 Dog,Lion 타입이 존재하면 eat, run메소드 호출
//Instance Of 를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry, run, eat메소드 호출

public class Ex01 {

	public static void main(String[] args) {
		Animal c1 = new Cat();
		Animal t1 = new Tiger();
		Animal d1 = new Dog();
		Animal l1 = new Lion();
		Animal e1 = new Eagle();
		Animal[] arr = new Animal[] {e1,c1,t1,d1,l1};
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] instanceof Cat||arr[i] instanceof Tiger) {
				System.out.println();
				(Animal1)arr[i].cry();
				(Animal2)arr[i].run();
				
			}
			if(arr[i] instanceof Dog||arr[i] instanceof Lion) {
				System.out.println();
				(Animal3)arr[i].eat();
				(Animal2)arr[i].run();
			}
			if(arr[i] instanceof Eagle){
				System.out.println();
				(Animal1)arr[i].cry();
				(Animal2)arr[i].eat();
				(Animal3)arr[i].run();
			}
		}
	}
}
*/
