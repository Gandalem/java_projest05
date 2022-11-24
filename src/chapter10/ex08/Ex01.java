package chapter10.ex08;

class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다");
	}
}
class Man extends Animal{
	void run() {
		System.out.println("남자는 달립니다");
	}
}
class Woman  extends Animal{
	void run() {
		System.out.println("여자는 달립니다");
	}
}
class Lion extends Animal{
	void run() {
		System.out.println("사자는 달립니다");
	}
}
class Tiger extends Animal{
	void run() {
		System.out.println("호랑이는 달립니다");
	}
}
class Cat extends Animal{
	void run() {
		System.out.println("고양이는 달립니다");
	}
}
class Dog extends Animal{
	void run() {
		System.out.println("개는 달립니다");
	}
}
class DogChild extends Dog{
	void run() {
		System.out.println("어린개는 달립니다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Animal : 부모 클래스, run()정의
//		자식 클래스 : man, woman, lion, tiger, cat, dog, dogChild <= 다향성
//			- 부모의 run 메소드를 재정의
//		arr 배열에 저장후
//		for문으로 출력 향상된 for문으로 출력 , run 메소드 출력
		Animal m1 = new Man();
		Animal w1 = new Woman();
		Animal l1 = new Lion();
		Animal t1 = new Tiger();
		Animal c1 = new Cat();
		Animal d1 = new Dog();
		Animal dc1 = new DogChild();
		
		Animal[] arr = new Animal[] {m1,w1,l1,t1,c1,d1,dc1}; 
		System.out.println("for문으로 출력");
		for(int i=0;i<arr.length;i++) {
			arr[i].run();
		}
		System.out.println("향상된 for문으로 출력");
		for(Animal i:arr) {
			Animal aa = i;
			aa.run();
		}
		System.out.println("향상된 for문으로 출력 2");
		for(Animal i:arr) {
			i.run();
		}
		
		
		
		
	}

}
