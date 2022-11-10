package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		<실습문제> 	<완료시간 : 6:10분, p.jangwoo@gmail.com Ex01.java>
//		정수2개가 Scanner로 인풋 받고 두값이 같으면 true를 다르면 false를 출력
//		이름2개를 Scanner로 인풋 받고 두값이 같으면 true를 다르면 false를 풀력
//		등가 연산자 사용
//		기본자료형 : ==
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("a정수를 입력해주세요 : ");
		a = sc.nextInt();
		System.out.println("b정수를 입력해주세요 : ");
		b = sc.nextInt();
		System.out.println("두정수가 같다면 true 다르면 false : "+(a == b));
		System.out.println("두정수가 다르면 true 같다면 false : "+(a != b));
//		참조 자료형 : aname.equals(bName)
		
		String aName;
		String bName;
		
		System.out.println("aName을 입력해주세요 : ");
		aName = sc.next();
		System.out.println("bName을 입력해주세요 : ");
		bName = sc.next();
		System.out.println("두문자가 같다면 true 다르면 false : "+(aName.equals(bName)));
		sc.close();
	}

}
