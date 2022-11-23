package chapter10.ex02;


class Human{
	String name;
	int age;
	void eat() {
		System.out.println("모든 사람은 밥을 먹습니다");
	}
}
class Student extends Human{
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student{
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2는 음식을 맛나게 먹습니다");
	}
}






public class Ex01 {

	public static void main(String[] args) {
//		업게스팅 실습
//		1. student 클래스를 생산하면서 Human 타입으로 지정 : h1
		Student h1 = (Student) new Human();
//		2. Student 클래스생산하면서 Student 타입으로 지정 : s1
		Student s1 = h1;
		
		
//		3. sudent2 클래스생산하면서 Human 타입으로 지정 : h2
		Student2 h2 =  (Student2)h1;
//		4. sudent2 클래스생산하면서 Student 타입으로 지정 : s2
		Student2 s2 = (Student2) h1;
//		5. sudent2 클래스생산하면서 Student2 타입으로 지정 : s3
		Student2 s3= s2; 
		
		
		

	}

}
