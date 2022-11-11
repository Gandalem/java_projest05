package chapter04.ex02;

public class Switch_control_statment {

	public static void main(String[] args) {
//		switch문
//		1. if 문은 참일 경우 실행 블락을 실행루 break 가 자동으로 작동
//		2. switch 문은 실행후 해당블럭을 빠져나오지 않는다. 강제로 빠져나오도록 break를 넣어야 한다

//		1.switch 문에서 break를 사용하지 않는경우
		int value1 = 2;
		switch (value1) {
		case 1:
			System.out.println("a");
		case 2:
			System.out.println("b");
		case 3:
			System.out.println("c");
		case 4:
			System.out.println("d");
		default :
			System.out.println("f");
			
		}
		
		System.out.println("===shitch 문===");
//		2. switch문에서 break를 포함해서 출력 <== 기본적으로 사용
		int value2 = 4;
		switch (value2) {
		case 1:
			System.out.println("a");
			break;
		case 2:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		case 4:
			System.out.println("d");
			break;
		default :					// if문의 else 와 같다  <case 에 존재하지 않는 모든것>
			System.out.println("f");
			break;
			
		}
		
//		3. switch 문은 if...else if .. else if ..else if 문으로 변환
		System.out.println("=== if 문으로 변환===");
		if(value2 == 1) {
			System.out.println("a");
		} else if(value2 ==2) {
			System.out.println("b");
		} else if(value2 ==3) {
			System.out.println("c");
		} else if(value2 ==4) {
			System.out.println("d");
		} else {
			System.out.println("f");
		}
		
	}

}
