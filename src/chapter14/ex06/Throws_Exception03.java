package chapter14.ex06;

class Aaaa{
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
//		해당 클래스의 클래스가 존재하지 않는다. 일반 예외
	Class cls = Class.forName("java.lang.Object2");
	}
}


public class Throws_Exception03 {
	public static void main(String[] args){
		
		Aaaa a1 = new Aaaa();
		try {
			a1.abc();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
		
		
	}
	
	
}
