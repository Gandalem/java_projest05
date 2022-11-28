package chapter12.ex04;


interface Animal1{
	void cry();
}
interface Animal2{
	void run();
}
interface Animal3{
	void eat();
}

interface Animal extends Animal1,Animal2,Animal3{ //eagle
	
}

//cat,tiger <=  cry,run 메소드만 구현

class Cat implements Animal{
	@Override
	public void eat() {
		System.out.println("고양이는 밥먹다");
	}
	@Override
	public void cry() {
		System.out.println("야옹");	
	}
	@Override
	public void run() {
		System.out.println("고양이 달리다");
	}
}

class Tiger implements Animal{
	@Override
	public void eat() {
		System.out.println("호랑이는 밥먹다");
	}
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
class Dog implements Animal{
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	@Override
	public void eat() {
		System.out.println("개는 먹다");
	}
	@Override
	public void run() {
		System.out.println("개 달리다");
	}
}

class Lion implements Animal{
	@Override
	public void cry() {
		System.out.println("어흥");
	}
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
class Eagle implements Animal{
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

public class Ex01_1 {

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
				arr[i].cry();
				arr[i].run();
				
			} else if(arr[i] instanceof Dog||arr[i] instanceof Lion) {
				System.out.println();
				arr[i].eat();
				arr[i].run();
			}else {
				System.out.println();
				arr[i].cry();
				arr[i].eat();
				arr[i].run();
			}
		}
	}
}
