package chapter10.ex06;

class A{
	int a;
//	상속 관계에서 부모 클래스의 생성자가 존재할 경우 기본 생성자를 반드시 명시!!!!
	A(){}
	
//	부모클래스의 생성자가 존새함
	A(int a){
		this.a = a;
	}
}
class B extends A{ //자식 클래스의 생성자에서는 기본적으로 super() 생략되어있다
//	자식 클래스의 생성자에는 기본적으로 super()가 기본적으로 생략되어 있고,
//	자식 클래스는 생성자 첫라인에 , super(); 생략됨, this(),
	
//	B(){super()} 생략됨
	B(){
		super();
	}
}


public class Super_Ketword01 {

	public static void main(String[] args) {
		/*
		this 키워드.		: 자신 객제의 필드와 메소드 호출
		this 메소드()		: 생성자 내부의 첫라인에 위치 자신의 객세에서 다은생성자를 호출할때 사용
		
		super 키워드.		: 부모객체의 필드와 메소드 호출
		super 메소드()	: 생성자 내부의 첫라인에 부모 객체의 생성자를 호출
			모든 자식의 클래스의 생성자는 반드시 첫라인에 this() super()가 와야한다.
			자식 클래스의 생성자는 기본적으로 super()가 생략되어있다.
			자식 클래스는 기본적으로 부모의 기본생성자를 호출
		 
		 */

	}

}
