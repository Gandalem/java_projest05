package chapter10.ex07;

class Aa{
	Aa(){
		System.out.println("Aa 클래스 의 생성자");
	}
}
class Bb extends Aa{
	Bb(){
//		super();
		System.out.println("Bb 클래스 의 생성자");
	}
}
class Cc extends Bb{
	Cc(){
//		super();
		System.out.println("Cc 클래스 의 생성자");
	}
}
class Dd extends Cc{
	Dd(){
//		super();
		System.out.println("Dd 클래스 의 생성자");
	}
}


public class Super_Method02 {

	public static void main(String[] args) {
		
//		객체 생성후 생성자 작동 확인
		
		Cc cc = new Cc();
		
	}

}
