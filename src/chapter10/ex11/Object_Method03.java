package chapter10.ex11;

import java.util.HashMap;

class A{ //	equals() 만 재정의 된상테 , hashCode() 재정의 되지 않는상테
//			
//	필드
	String name;
//	생성자
	A(){}
	A(String name){
		this.name = name;
	}
//	equals()재정의
	@Override
	public boolean equals(Object obj) { // 공용 Boolean 으로 리턴시키는 메소드 값은 Object를 받는다.
		if(this.name == ((A)obj).name) { //Object를 A로다운 캐스팅
			return true; //true 를 리턴
		} else {
			return false; // false를 리턴
		}
	}
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
}

class B{ //equals() ,hashCode() 메소드 2개만 재정의 된상테
//	필드
	String name;
//	생성자
	B(){}
	B(String name){
		this.name = name;
	}
	
//	equals()재정의
	@Override
	public boolean equals(Object obj) { // 공용 Boolean 으로 리턴시키는 메소드 값은 Object를 받는다.
		if(this.name == ((B)obj).name) { //Object를 B로다운 캐스팅
			return true; //true 를 리턴
		} else {
			return false; // false를 리턴
		}
	}
	@Override //hashCode
	public int hashCode() {
		return name.hashCode();
	}
	
	
	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
	
}



public class Object_Method03 {

	public static void main(String[] args) {
//		HashMap : key, value
		HashMap<Integer,String> hm1 = new HashMap<>();
//		key 는 중복된 데이터를 넣을수없도록 하는자료 구조
//		equals,hashCode
		hm1.put(1, "데이터1");
		hm1.put(2, "데이터2");
		hm1.put(3, "데이터3");
		
		System.out.println(hm1);
		
//		Integer : equals(),hashCode() 메소드가 재정의 되어있기 때문에 
//		Map자료 구조의 Key로 사용할수있다.
		
//		자신이 만든 객체를 Map에 Key로 사용할수있다.
//		equals(), hashCode() 를 재정의 해야 Map에 Key 로 사용할수있다.
		System.out.println("=============");
//		A 클래스는 equals() 재정의 , hashCode() 재정의 안됨 <= Map 의 Key로 사용할수있다.
		HashMap<A, String> hm2 = new HashMap<>();
		
		hm2.put(new A("첫번째"), "데이타 1");
		hm2.put(new A("첫번째"), "데이타 2");
		hm2.put(new A("두번째"), "데이타 3");
		
		System.out.println(hm2);
		
		System.out.println("===================");
//		B클래스 : equals(), HashCode() 재정의 <- Map 자료구조의 Key로 사용가능하다.
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이타 1");
		hm3.put(new B("첫번째"), "데이타 2");
		hm3.put(new B("두번째"), "데이타 3");
		
		System.out.println(hm3);
	}
}
