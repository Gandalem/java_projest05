package chapter07.ex03;

public class Ex01 {

	public static void main(String[] args) {
//		가변길이 배열 문제
		
//		values[0] : 값이 정수 1~9 이 들어왔을때"파워 레벨 1[9] 입니다."
//		values[1] : 갑이 정수 1~9 이 들어왔을때 "스피드 레벨1[9]입니다."
		arrayFlexible(9,9);
		
	}
	
	public static void arrayFlexible(int...values) {
		if(values[0] <= 9&&values[0]>0) {
			System.out.println("파워레벨 "+values[0]);
		}else {
			System.out.println("index 0번에 1~9까지만 입력해주세요");
		}
		if(values[1] <= 9&&values[1]>0) {
			System.out.println("스피드레벨 "+values[1]);
		}else {
			System.out.println("index 1번에 1~9까지만 입력해주세요");
		}
	}

}
