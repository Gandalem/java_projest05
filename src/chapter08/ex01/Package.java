package chapter08.ex01;

//다른 패키지 안에존재하는 클래스는 import
import chapter08.ex02.Student;
import chapter07.*;
import chapter07.ex01.*;

public class Package {

	public static void main(String[] args) {
//		클래스 내부 구성요소 :
//			1.필드,2. 생성자, 3.메소드, 4.이너 클래스
//		클래스 외부 구성요소
//			1.패키지, 2.임포트, 3. 외부 클래스
//		1.패키지(Package)클래스를 조직화해서 관리하는폴더
//			한패키지내에 동일한 이름의 클래스는 올수 없다.
//			외부에서 클래스를 가지고 오는 경우 기존의 클래스 이름과 동일한 경우
//		2.임포트(import) : 다른 패키지의 있는 클래스를 가져올구있다
		
//		Student 클래스의 객체 생성 : 다른 패키지의 존재하는 클래스
//		Chapter08.ex02.Student
		
		Student st = new Student();
		st.print();
		
		
//		매게변수 4개인 생성자 호출
		Student s2 = new Student("홍길동","1111",3,"서울종로구");
		s2.print();
		
		System.out.println("======");
		
		Car car = new Car();
		car.print();
		
		
		
	}

}
