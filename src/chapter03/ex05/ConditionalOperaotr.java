package chapter03.ex05;

public class ConditionalOperaotr {

	public static void main(String[] args) {
//		3항연산자 : if~ else 구문을 축약해서 사용
//			조건 ? 참:거짓 (조건) 참이면 참:거짓중 참을 실행 (조건) 거짓이면 참:거짓중 거짓 실행
		System.out.println(3<6?1:2);
		
		int value1 = (3>5) ? 6:9; //(조건) 거짓 이기에 6:9중 9가 실행
		System.out.println(value1);
		
		int value2 = (3<5) ? 6:9; //(조건) 참 이기에 6:9중 6이 실행
		System.out.println(value2);
		

	}

}
