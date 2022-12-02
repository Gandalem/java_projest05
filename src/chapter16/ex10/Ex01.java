package chapter16.ex10;

//제너릭 클래스 / 제너릭 메소드 를 사용해서 두점의 좌표값으로 넓이를 구하는 프로그램 작성

//점의 좌표를 처리 하는 클래스 생성.<제너릭 클래스>
class Point<X,Y>{
	X x;
	Y y;
	
//	생성자를 사용해서 x,y의값을입력,
	
	Point(){} //기본생성자
	
	Point(X x,Y y) { //x : x좌표 , y : y좌표
		this.x = x;
		this.y = y;
	}

//	getter 만 생성
	
	public X getX() {
		return x;
	}

	public Y getY() {
		return y;
	}
}
class GenericMethod{
//	 makeRectangle() 메소드 호출시 객체없이 클래스 선언
	public static<T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
//		두점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌.
		
		
		double num1 = (double)p1.getX()-(double)p1.getY();
		double num2 = (double)p2.getX()-(double)p2.getY();
		
		double num =num1*num2;
		
		return num;//넓이를 리턴 해주면 됨.
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		두점의 좌표를 저장하는 p1객체 p2객체
		Point<Double,Double> p1 = new Point<>(10.0,30.0);
		
		Point<Double,Double> p2 = new Point<>(20.0,40.0);
		
//		makeRectangle(p1,p2) < =두점의 좌표를 받아서 넓이를 계산후 리턴
		System.out.println(GenericMethod.makeRectangle(p1, p2));
		
		
	}

}
