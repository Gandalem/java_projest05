package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록하고 ,
		//  어머님이름 아버님 이름 , 형제이름 , 자신이름
		//	어머님 나이, 아버님아니, 형제나이, 자신나이
		
		//콘솔에서 입력받은 변수 모두 출력
		// 나이의 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		String[] name_list = new String[4];
		int[] avg_list = new int[4];
		int sum=0;
		for(int i =0;i<4;i++) {
			System.out.println("이름을 입력해주세요 : ");
			name_list[i] = sc.next();
			System.out.println(name_list[i]+"님의 나이를 입력해주세요 : ");
			avg_list[i] = sc.nextInt();
			sum += avg_list[i];
		}
		sc.close();
		for(int i=0;i<4;i++) {
			System.out.println(name_list[i]+"님의 나이는 : "+avg_list[i]);
		}
		System.out.println("나이의 합계 : "+sum);
		System.out.println("나이의 평균 : "+sum/5.0);
	}

}
