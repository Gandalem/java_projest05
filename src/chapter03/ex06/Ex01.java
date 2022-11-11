package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		<문제> 스케너로 정수 값을 입력받고 입력받은 정수값이 홀수 이면 "홀수" 라고 출력 하고
//		입력받은 값이 짝수이면 "짝수" 라고 출력
//		<삼항 연산자를 사용>
//		11시 20분까지 완료. p.jangwoo@gmail.com
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		sc.close();
		String output = (input%2==1)? "홀수":"짝수";
		
		System.out.println(output);

	}

}
