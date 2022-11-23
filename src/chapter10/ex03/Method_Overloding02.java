package chapter10.ex03;

import java.util.Arrays;

class Animal{
	
	void animalSound(){
		System.out.println("모든 동물은 소리내어 웁니다.");
	}
}
class Tiger extends Animal{
	@Override
	void animalSound() {
		System.out.println("호랑이는 어흥하고 웁니다.");
	}
}
class Eagle extends Animal{
	@Override
	void animalSound() {
		System.out.println("독수리는 끼오옥하고 웁니다.");
	}
}
class Lion extends Animal{
	@Override
	void animalSound() {
		System.out.println("사자는 어흥어흥하고 웁니다.");
	}
}

public class Method_Overloding02 {

	public static void main(String[] args) {
//		객체 생성
		Animal t1 = new Tiger();
		Animal t2 = new Lion();
		Animal t3 = new Eagle();
//		메소드 오버라이딩,오버라이딩된메소드 출력.....
//		Animal의 메소드 호출시 오버 라이딩 된 자식의 메소드가 출력
		t1.animalSound();
		t2.animalSound();
		t3.animalSound();
		System.out.println("============");
//		배열에 객체를 저장
//		arr1 에 Animal 객첼르 저장함.
		Animal[] arr1 = new Animal[3];
		
//		arr1 배열의 각방에 Animal 객체 저장
		arr1[0] = t1;
		arr1[1] = t2;
		arr1[2] = t3;
		
//		2. arr1배열에 Animal타입의 객체가 저장되어있음.
//		배열 각 방에있는 값을 가져오는법
		
//		3.Animal 타입의 객체를 출력
		Animal a1 = arr1[0];
		a1.animalSound();
		
		Animal a2 = arr1[1];
		a2.animalSound();
		
		Animal a3 = arr1[2];
		a3.animalSound();
		
		
		
		
		
	}

}
