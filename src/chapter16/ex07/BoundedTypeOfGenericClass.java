package chapter16.ex07;

//제너릭 클래스로 들어오는 타입을 제한을 할수 있다. extends 키를 사용해서 제한
//extends 키를 사용해서 제너릭 타입에 들어오는 타입을 제한을 둘수 있다.

class A{}
class B extends A{}
class C extends B{}

class D <T extends B>{ //T 타입으로 들어오는 타입을 제한을 둘수있다. T : B,C 타입만 올수 있다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}




public class BoundedTypeOfGenericClass {

	public static void main(String[] args) {
		
//		D <A> d1 = new D<>(); //오류발생 A타입은 T로 올수 없다
		D <B> d2 = new D<>(); //T : B 타입은 들어간다.
		D <C> d3 = new D<>(); //T : C 타입은 들어간다.
		
		D d4 = new D(); // == D <B> d4 = new D<>(); 제너릭 타입을 생략해서 호출하면 제한된 타입이 기본적으로 들어감
		
		
//		setter 를사용래서 타입에 값 입력
		d2.setT(new B()); //d2는 B타입을 정의 해서 객체를 생성 , setter주입시 B타입의 객체를 주입
		d3.setT(new C()); //d3는 C타입을 정의 해서 객체를 생성 , setter주입시 C타입의 객체를 주입
		
		//
// (오류)	d3.setT(new B());//	d3는 C타입으로 정의되있어서, B타입을 setter로 주입받을수 없다.
//							B타입을 객체화 하면 , A,B를 내포 하고있고 C객체가 내포 되어 있지 않다.
		d3.setT(new C());//	
		d2.setT(new C());//	C객체가 B타입으로 업캐스팅됨
		
		
	}

}
