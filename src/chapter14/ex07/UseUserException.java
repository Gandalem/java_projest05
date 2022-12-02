package chapter14.ex07;

//사용자 정의 예외 : 일반예외 2개 생성

//1. 점수가 음수면 예외 발생 시키는 사용자 정의 예외
class MinusException extends Exception{
	public MinusException(){
		super();
	}
	public MinusException(String message){
		super(message);
	}
	
}
//2. 점수가 100점을 초과하는경우 사용자 정의 예외
class OverException extends Exception{
	public OverException(){
		super();
	}
	public OverException(String message){
		super(message);
	}
	
}
//사용자 정의 예외를 처리할 클래스
class Aa{
	void checkScore(int score) throws MinusException,OverException {
		if(score < 0) { //MinusException 강제로 발생 시킴
			throw new MinusException("예외가 발생됨 : 음수값입력 불가함");
		}else if(score > 100){//OverException 강제로 발생 시킴
			throw new OverException("예외가 발생됨 : 정수값 100초과 입력 불가함");
		}else {
			System.out.println("정상값입니다.");
		}
	}
}


public class UseUserException {

	public static void main(String[] args) {
		
		Aa a1 = new Aa();
		
		try {
			a1.checkScore(50);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}

	}

}
