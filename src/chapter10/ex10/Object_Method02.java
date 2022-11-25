package chapter10.ex10;

import java.util.Objects;

class Aa{ //equals()가 정의 되어있진 않는 메소드
//	Object클래스의 equals() 메소드는 stack의 참조 주소를 비교해서 출력
//	필드 1개
	String name;
//	기본생성자
	Aa(){}
//	생성자 : 
	Aa(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	
}

class Bb{ //Object 의 equals()를 재정의 해서 Heap의 값비교 하도록 설정
//	필드1
	String name;
	Bb(){}
	Bb(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) { //Object 타입으로 업 캐스팅 해서 들어옴.
		if(this.name == ((Bb)obj).name) {
			return true;
		} else {
			return false;
		}
	}
}

public class Object_Method02 {

	public static void main(String[] args) {
//		Object 클래스의 equals()메소드 : 기본적으로 == 참조 주소를 비교함.
//			객체의 Heap의 값을 비교하는것이 아니라 Stack메모리의 참조 주소값을 비교.
//		String 클래스는 equals() 가 재정의 되어있다 Heap값을 비교하도록 설정이 되어있다.

		
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		
//		== : 참조 자료형에서는 stack영역의 참조주소를 비교.
//		equals() : ==
//		String클래스는 equals()가 재정의 : Heap의 값을 비교하도록 설정
		System.out.println(s1 == s2); // stack의 참조 주소를 비교
		System.out.println(s1.equals(s2)); //Heap의 값을 비교
//		String클래스는 Object의 equals() 재정의 되어있다.
		System.out.println("============");
		
		Aa a1 = new Aa("안녕");
		Aa a2 = new Aa("안녕");
		System.out.println(a1 == a2); //stack의 참조 주소 값 비교
		System.out.println(a1.equals(a2)); //stack의 참조 주소 값 비교
		
		Bb b1 =new Bb("안녕");
		Bb b2 =new Bb("안녕");
		System.out.println(b1 == b2);
//		 equals() 메소드를 재정의 해서 Heap 값을 비교 하도록 설정
		System.out.println(b1.equals(b2)); //Heap,name필드의 값을 비교하도록 재정의
		
		
		
		
		
	}

}
