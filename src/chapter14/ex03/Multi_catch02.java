package chapter14.ex03;

public class Multi_catch02 {

	public static void main(String[] args) {
//		여러개의 Exception을 한꺼번에 처리
		try {
			System.out.println(3/1);
			
			int[] arr = new int[] {1,2,3};
			
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
			
		}catch (Exception e) {
			System.out.println("모든 예외가 처리");
//			try 블럭에서 어떤예외가 발생 되었는지 알수있도록 출력
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}
