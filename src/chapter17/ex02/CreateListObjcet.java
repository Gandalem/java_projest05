package chapter17.ex02;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//java.lang 패키지 하위의 클래스는 생략 가능(Object,String,Integer,....)

public class CreateListObjcet {
	
	public static void main(String[] args) {
		
		
//		참고로 알아둠 ,몰라도 상관없음
//		1.
		List<Integer> aList1 = new ArrayList<>(); //기본적으로 내부 메모리 공간 10개를 확보
		List<Integer> aList2 = new ArrayList<>(30); //내부적으로 초기메모리 공간 방 30개로 설정
		
//		2. Vector
		List<Integer> aList3 = new Vector<>();	 //capacity 10 방 10개
		List<Integer> aList4 = new Vector<>(50); //capacity 50 방 50개
		
//		3.LinkedList
		List<Integer> aList5 = new LinkedList<>();//capacity 10 방 10개
//		List<Integer> aList6 = new LinkedList<>(60); //오류발생 //초기설정시 오류 발생
		
//		컬랙션은 자동으로 방크기가 늘어나고 줄어든다. (무한정)
//		Array.asList()를 사용해서 값을 넣을 경우 방크기가 고정되어서 늘어나거나 줄어들지 않는다. (수정은 가능!)
//		고정된 값만 들어가야 할경우 : 12당, 요일 
		List<Integer> aList7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<String> aList8 = Arrays.asList("월","화","수","목","금","토","일");
		
//		aList7.add(13); //오류 발생 //값을 더추가할수 없다.
//		aList7.remove(0); //오류발생 //값을 제거 할수없다.
		
//		수정은 가능하다.set() (배열의 크기만 변경할수 없다)
		aList7.set(1, 7); //1번 방의 값을 7로 수정
		try {
			aList8.add("오늘");			
		}catch (UnsupportedOperationException e) {
			System.out.println("해당 배열의 값을 추가 할수 없습니다.");
		}
		try {
			aList8.remove(0);			
		}catch (UnsupportedOperationException e) {
			System.out.println("해당 배열의 값을 제거 할수 없습니다.");
		}
		System.out.println(aList7);
		
		aList8.set(0, "오늘");
		System.out.println(aList8);
	}

}
