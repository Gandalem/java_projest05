package chapter05.ex08;

public class Ex01 {

	public static void main(String[] args) {
//		<문제>
//			args : 합계 40 77 99 100 200
//		합계 : <정수를 더한 값을 출력>
		int num = 0;
		for(int i = 1; i<args.length;i++) {
			num += Integer.parseInt(args[i]);
		}
		
		System.out.println(args[0]+" : "+num);
		
		System.out.println("======");
		System.out.println("합계" + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "합계");
		
		
		
		
	

	}

}
