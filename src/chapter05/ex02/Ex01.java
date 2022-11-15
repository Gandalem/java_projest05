package chapter05.ex02;

public class Ex01 {

	public static void main(String[] args) {
//		<문제> arr1 배열변수에 정수 1000개의 방을 생성
// 		for 문을 사용해서 각방에 3배의 배수의 값을 저장
//		for 문을 사용새서 각방의 내용을 출력
		int[] arr1 = new int[1000];
		int a = 3;
		for(int i :arr1) {
			arr1[i] = a +=3;
			System.out.print(arr1[i]+" ");
		}
	}

}
