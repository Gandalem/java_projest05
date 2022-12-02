package chapter17.ex04;

import java.util.ArrayList;
import java.util.Arrays;

class Student{
	String name;
	int stuID;
	
	Student(){}
//	생성자를 사용해서 값ㅇ르 인풋받아 메모리에 할당
	Student(String name, int stuID){
		this.name = name;
		this.stuID = stuID;
	}
	
//	toString() 오버라이딩 재정의 : 객체 자체를 출력할때 객체 주소가 출력되지 않고 메모리의 값출력
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
	
}


public class UserArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<>();
		
//		Student객체를 생성
		Student s1 = new Student("홍길동",1111);
		Student s2 = new Student("이순신",1111);
		Student s3 = new Student("강감찬",3333);
//		student 객체는 ArrayList 컬랙션에 저장
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
//		컬랙션의 내용물 순환하면서 출력
		for(int i =0;i<a1.size();i++) {
			System.out.println(a1.get(i)); 
			
		}
		
		System.out.println("=================================");
		for(Student i : a1) {
			System.out.println("학생이름 : "+i.name+" 학생아이디 : "+i.stuID);
			
		}
		System.out.println("=================================");
//		모든 컬랙션은 컬랙션 객체를 출력시 컬랙션의 들어간 값을 출력한다.
		System.out.println(a1);
		
		
		
		
	}

}
