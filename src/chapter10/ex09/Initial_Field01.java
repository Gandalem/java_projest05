package chapter10.ex09;

class Student{
//	필드
	String name;
	int stuID;
	int age;
	String stuAdd;
	String stuPhone;
	double weight;
	int mounth;
	
	Student() {}
	
	Student(String name,int stuID,int age,String stuAdd,String stuPhone,double weight,int mounth){
		this.name=name;
		this.stuID=stuID;
		this.age=age;
		this.stuAdd=stuAdd;
		this.stuPhone=stuPhone;
		this.weight=weight;
		
	}
	
//	getter(필드의 값을 리턴으로 돌려줌),setter(입력값을 받아서 받은값을 필드에 적용)생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStuAdd() {
		return stuAdd;
	}

	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}

	public String getStuPhone() {
		return stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	

	//	toString() 재정의 : 객제의 Heap메모리의 주소값 출력, hashcode 로 출력(16진수)
//	객체 자체를 출력했을때 tostring() 가 작동.
	@Override
	public String toString() { //Object 클래스 의 메소드 , 모든 자바의 클래스는 Object상속
		return "Student [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight +"]";
	}
	
	
	
}

public class Initial_Field01 {

	public static void main(String[] args) {
//		1.객체를 생성한후 직접 필드의 값을 할당
//		2.객체를 생성할때 생성자를 사용해서 필드의 값을 할당
//		3.DTO(Data Transper Object) , VO(Value Object) : 
//		: 클라이언드 에게 값을 받아서 DAO에 값을 전송
//		DAO(Data Acess Object) : DataBase 에 Insert,update,Delete
//		getter(필드의 값을 읽을때), setter(필드의 값을 할당할때)를 사용해서 값을 초기화
		
//		1. 객체를 생성후 직접 필드의 값을 할당.
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.stuAdd = "서울 종로구";
		s1.stuID = 1111;
		s1.stuPhone = "010-0000-0000";
		s1.weight = 81.8;
		s1.mounth = 50;
		
		System.out.println(s1); //객체를 출력할때 toString()메소드가 호출 toString으로 정의 해줘야지 출력됨
		System.out.println(s1.toString());
		System.out.println("===================");
		
//		2.객체를 생성시 생성자를 통해서 필드의 값을 할당
		Student s2 = new Student("이순신",30,1111,"서울 강남","010-1234-1234",70.1, 11);
		System.out.println(s2);
		System.out.println(s2.toString());
		
		System.out.println("========");
		
//		3.setter를 사용해서 필드의 값을 할당 getter를 통해서 값을 꺼내기 (추천 X)
		Student s3 = new Student();
		s3.setName("감감찬");
		s3.setAge(60);
		s3.setStuAdd("서울 마포구");
		s3.setStuID(3333);
		s3.setStuPhone("123-9876-5432");
		s3.setWeight(90.9);
		
		System.out.println(s3);
		System.out.println(s3.toString());
		System.out.println("==========");
		
//		getter출력 : 필드의 값을 리턴으로 호출하는곳으로 돌여줌
		s3.getName();
		s3.getAge();
		s3.getStuAdd();
		s3.getStuID();
		s3.getStuPhone();
		s3.getWeight();
		
		
	}

}
