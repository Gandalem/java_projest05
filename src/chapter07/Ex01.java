package chapter07;

class Cals{
	
//	사칙연산 처리하는 메소드
//	두정수의 값을 받아서 더해서 값을 던져줌
	int add(int a,int b) {
		return a+b;
	}
//	빼기 (diff)
	int diff(int a,int b) {
		return a-b;
	}
	
//	곱하기 (mul)
	int mul(int a,int b) {
		return a*b;
	}
//	나누기 (div) : double
	double div(double a,double b) {
		return a/b;
	}
//	면적 (Rec) (가로 : x 세로 :y)
	double Rec(double x,double y) {
		return x*y;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Cals cal = new Cals();
		System.out.print("더하기 : "+cal.add(3, 2));
		System.out.print("\n\n빼기 : "+cal.diff(3, 2));
		System.out.print("\n\n곱하기 : "+cal.mul(3, 2));
		System.out.print("\n\n나누기 : "+cal.div(3, 2));
		System.out.print("\n\n면적 : "+cal.Rec(3, 2));

	}

}
