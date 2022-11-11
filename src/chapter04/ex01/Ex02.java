package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		스캐너에서 번호를 입력받아서 아래 내용을 작동시키는 프로그램을 작성해주세요.
//		if 
		
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		int kor;
		int eng;
		int math;
		
		int a ;
		
		String aName;
		String bName;
		
		System.out.println("==========================================");
		System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름식별");
		System.out.println("==========================================");
		System.out.println("위에 번호를 선택하세요. : ");
		select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("국어점수를 입력해주세요 :");
			kor = sc.nextInt();
			
			System.out.println("영어점수를 입력해주세요 :");
			eng = sc.nextInt();
			
			System.out.println("수학점수를 입력해주세요 :");
			math = sc.nextInt();
			sc.close();
			int sum = kor+eng+math;
			System.out.println("점수의 총합은 : "+sum);
			
			double avg = sum/3.0;
			System.out.println("점수의 평균은 : "+avg);
			
		}else if(select == 2) {
			System.out.println("홀짝을 구분할 정수를 입력해주세요 :");
			a = sc.nextInt();
			sc.close();
			int b = a%2;
			if(b == 1) {
				System.out.println("입력받은 값은 홀수입니다.");
			} else {
				System.out.println("입력받은 값은 짝수입니다.");
			}
			
		}else if(select == 3) {
			System.out.println("첫번째 이름을 입력해주세요 :");
			aName = sc.next();
			System.out.println("두번째 이름을 입력해주세요 :");
			bName = sc.next();
			sc.close();
			if(aName.equals(bName)) {
				System.out.println("입력하신 두 이름은 일치합니다.");
			}else {
				System.out.println("입력하신 두 이름은 일치하지 않습니다.");
			}
			
		}
		

	}

}
