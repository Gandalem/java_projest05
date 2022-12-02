package chapter16.ex10;

//제너릭 클래스의 상속, 자식클래스는 부모 클래스의 타입 변수의 갯수가 같거나 많아야 한다.

class parent<T> {
	T t;
//	setter, getter 생략
}

class child1<T> extends parent<T> {
	
}

class child2<T,V> extends parent<T>{
	
}

public class InheritahceGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
