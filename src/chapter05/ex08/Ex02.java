package chapter05.ex08;

public class Ex02 {

	public static void main(double[] args) {
//		main method 의 배열 변수 args로 살수 값 넣어서 계산하기
//		args : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
//		for 문을 사용해서 처리
//		합계 : 실수를 더한 합계
		double num=0;
		for(int i=1;i<args.length;i++) {
			num += args[i];
		}
		String a = String.valueOf(args[0]);
		System.out.println(a+" : "+num);
	}

}
