package chapter02.ex08;

//3. Scanner 객체를 import (ctrl + shift + o)
import java.util.Scanner;

public class Scanner_Using {

	public static void main(String[] args) {
//		Scanner 사용법 : 이클립스 에서 콘솔값으로 인풋 받을숭 있다.
//		콘솔로 값을 받아서 변수에 저장하고 값을 출력할수 있다
		
//		1. 스케너 선언
//		객체 겍체 변수 =겍체 생성
		Scanner sc = new Scanner(System.in);
		
		String name; //이름을 저장하는 변수
		int kor; //국어
		int eng; //영어
		int math; //수학
		int music; //음악
		int sience; //과학
		System.out.println("이름을 입력하세요 :");
		name = sc.nextLine(); //문자열 입력
		System.out.println("국어점수를 입력하세요 : ");
		kor = sc.nextInt(); //정수 입력
		System.out.println("영어점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		math = sc.nextInt();
		System.out.println("음악점수를 입력하세요 : ");
		music = sc.nextInt();
		System.out.println("과학점수를 입력하세요 : ");
		sience = sc.nextInt();
		
		int sum = kor+eng+math+music+sience; //합계
		double avg = sum/5.0; //평균
		
		System.out.println("이름 : "+name);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("음악점수 : "+music);
		System.out.println("과학점수 : "+sience);
		System.out.println("5과목 합계 점수 : "+ sum);
		System.out.println("5과목 평균 점수 : "+ avg);
		

	}

}
