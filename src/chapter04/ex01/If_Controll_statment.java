package chapter04.ex01;

public class If_Controll_statment {

	public static void main(String[] args) {
//		if 구문 사용하기()
//		1.type 1 : if(조건) {조건이 참일때 실행문}
//		실행문 {} 참일때 생략가능한데 실행문 1줄만 가능하다
		int value1 = 5;
//		조건이 참일때
		if(value1>3) {
			//조건이 참일때 실행 블락
			System.out.println("실행1");
		}
//		조건이 거짓일때
		if(value1<3) {
			//조건이 참일때 실행 블락
			System.out.println("실행2"); //조건의 만족하지못해 실행x
		}
		
		System.out.println("==== {조건이 참일때실행문}, {} 생략 가능 =====");
//		if실행문이 하나일때만 {} 생략가능하다.
		if(value1 < 3) 
			System.out.println("실행3"); //실행문 1개만 {} 가 생략되서 처리할수 있다
			System.out.println("실행4");
		
//		2. type : if (조건){조건이 참일때 실행;} else {조건이 거짓일때 실행;}
//			삼향연산자료 변환
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("===if를 사용해서 출력===");
		if(bool1) {
//			조건이 참일때실행
			System.out.println("참");
		} else {
//			조건이 거짓일때 실행
			System.out.println("거짓");
		}
		
		if(bool2) {
//			조건이 참일때실행
			System.out.println("참");
		} else {
//			조건이 거짓일때 실행
			System.out.println("거짓");
		}
		
		System.out.println("=====삼향 연산자를 이용해서 출력=====");
		
		System.out.println(bool1?"참":"거짓"); 
		
//		3. type 3 : 조건이 여러개인 경우 
//		if (조건1) {조건1이 참일때 실행} 
//			else if(조건2){조건2가 참일때 실행}
//		....else {조건에 존재 하지 않는 경우 실행}
		System.out.println("===if type 3===");
		int value3 = 40;
		if(value3 > 90) {
//			조건1이 참일때실행
			System.out.println("a학점");
		} else if(value3 >= 80){
//			조건1이 거짓일때 실행
			System.out.println("b학점"); //if문을 빠져나와온뒤 실행
		} else if(value3 >= 70){
//			조건2이 거짓일때 실행
			System.out.println("c학점");
		}else if(value3 >= 60){
//			조건3이 거짓일때 실행
			System.out.println("d학점");
		} else {
//			위의 조건이 해당하지 않을때 실행
			System.out.println("f학점");
		}
		System.out.println("===조건을 거꾸로 적용===");
		
		if(value3 >= 70) {				//실행후 탈출
			System.out.println("c학점");
		} else if(value3 >= 80) {
			System.out.println("b학점");
		} else if(value3 >= 90) {
			System.out.println("a학점");
		} else {
			System.out.println("f학점");
		}
		
		System.out.println("===조건을 디테일하게 적용===");
		
		if(value3 >= 60 && value3 <70) {
			System.out.println("d학점");
		}else if(value3 >= 70 && value3 <80) {
			System.out.println("c학점");
		}else if(value3 >= 80 && value3 <90) {
			System.out.println("b학점");
		}else if(value3 >= 90 && value3 <100) {
			System.out.println("a학점");
		} else if(value3 >=0 && value3 <60) {
			System.out.println("f학점");
		} else {
			System.out.println("정확한 점수가 아닙니다. 0~100까지 넣어주세요");
		}
		

	}

}
