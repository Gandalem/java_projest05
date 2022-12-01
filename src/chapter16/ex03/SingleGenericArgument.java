package chapter16.ex03;

//제너릭 클래스 : 다양한 타입의 저장할수있는 클래스

class Apple{String apple ="애플";}
class Pencil{String pencil ="연필";}
class Banana{String banana ="바나나";}


//제너릭 클래스 : 다양한 타입이 저장 할수 있는 클래스
//	클래스 이름뒤에 <T>
//	객체를 생성할때 <T>들어오는 타입을 지정해서 객체를 생성함.
//	<T>들어로는타입은 객체형 타입만 드어와야 한다.
//	wrapper class : 기본 자료형을 객체형 자료형으로 만들것
//		boolean : Boolean, char : charter
//		byte:Byte, short : Short, int : Integer, long : Long
//		float : Float, double : Double
class MyClass<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
//		1. 제너릭 타입의 겍체 생성하기
		MyClass<Apple> app1 = new MyClass<Apple>();
//		Apple 객체를 setter를 사용해서 주입
		app1.set(new Apple());
		System.out.println(app1.get().apple);
		
//		pencil 객체를 setter를 사용해서 주입하고 값 가져오기
		MyClass<Pencil> pen1 = new MyClass<Pencil>();
		pen1.set(new Pencil());					//setter를 사용해서 pencil객체를 주입
		System.out.println(pen1.get().pencil);	//getter를 사용해서 pencil객체를 가져옴
		
//		Banana 객체를 setter를 사용해서 주입하고 값 가져오기
		MyClass<Banana> ba1 = new MyClass<Banana>();
		ba1.set(new Banana());					//setter를 사용해서 pencil객체를 주입
		System.out.println(ba1.get().banana);	//getter를 사용해서 pencil객체를 가져옴
		
//		String 값넣고 출력하기
		MyClass<String> str1 = new MyClass<String>();
		str1.set(new String());
		System.out.println(str1.get());
//		int 값을 널고 출력하기:Integer객체
		MyClass<Integer> int1 = new MyClass<Integer>();
		int1.set(10);
		System.out.println(int1.get());
//		double 값을 넣고 출력하기 : Double 객체
		MyClass<Double> double1 = new MyClass<Double>();
		double1.set(8.8);
		System.out.println(double1.get());
	}

}
