package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
//		12: 45분가지 완료
//		try catch - finally 구문을 사용해서 예외 처리
		
		int[] arr = new int[] {1,2,3,4};
		
//		실행시 예외 발생:
		try {
			System.out.println(arr[3]);
			System.out.println("try 블럭의 코드");
		}catch (ArrayIndexOutOfBoundsException e) {
//			try 블럭에서 ArrayIndexOutOfBoundsException 발생이되면 작동
			System.out.println("배열값밖으로 출력났습니다.");
		}finally {
//			무조건 작동되는 블럭
			System.out.println("프로그램 종료");			
		}

	}

}
