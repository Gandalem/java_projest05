package chapter10.ex03;

class Fruit{ //fruit 의 메소드를 오버라이딩 해서 출력. Apple,Banana, Orange
	void eat() {
		System.out.println("모든 과일은 맛이있습니다.");
	}
}
//과일 부모를 상속받아 사과에 오버라이딩 
class Apple extends Fruit{
	@Override
	void eat() {
		System.out.println("사과의 맛이 있습니다.");
	}
}
//과일 부모를 상속받아 바나나에 오버라이딩 
class Banana extends Fruit{
	@Override
	void eat() {
		System.out.println("바나나의 맛이 있습니다.");
	}
}
//과일 부모를 상속받아 오렌지에 오버라이딩 
class Orange extends Fruit{
	@Override
	void eat() {
		System.out.println("오렌지의 맛이 있습니다.");
	}
}




public class Ex01 {

	public static void main(String[] args) {
//		업캐스팅 객체생성
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		Fruit f3 = new Orange();
//		배열의 객체 저장
		Fruit[] arr1 = new Fruit[3];
		arr1[0] = f1; 
		arr1[1] = f2;
		arr1[2] = f3;
//		배열의 있는 객체 꺼내기
		Fruit a1 = arr1[0];
		Fruit b2 = arr1[1];
		Fruit o3 = arr1[2];
//		객체명령어 호출
		a1.eat();
		b2.eat();
		o3.eat();
		
		
		
		
	}

}
