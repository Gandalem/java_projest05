package chapter09.ex03;

class Student{
	String stuName;		//학생이름
	static int stuNo;	//학생수 : 모든객체에서 공유되는 필드, 객체가 생성될때 마다 학생수가 늘어난다
						//객체를 생성시 하나씩능어나도록 함.
	String stuAddr;		//주소
	
	
//	static 필드의 초기값 할당
	static {
		stuNo = 0;
	}
	
	
	Student(String stuName, String stuAddr){
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		stuNo += 1; 			//학생수 모든 객체에서 공유
	}
	void print() {
		System.out.println("학생이름 : "+stuName);
		System.out.println("학생주소 : "+stuAddr);
		System.out.println("학생수 : "+stuNo);
	}
}

public class Student_Test {

	public static void main(String[] args) {
		
		for(int i =0;i<10;i++) {
			System.out.println("=========");
			Student st1 = new Student(String.valueOf(i),String.valueOf(i));
			st1.print();
			
		}
		System.out.println("========");
		Student st2 = new Student("홍길동","서울 강남");
		st2.print();
		System.out.println(st2.stuNo);
		System.out.println("========");
		Student st3 = new Student("미란다","서울 곡성");
		st3.print();
		System.out.println(st3.stuNo);

	}

}
