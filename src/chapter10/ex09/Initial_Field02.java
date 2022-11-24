package chapter10.ex09;

class Student2{
//	필드 : 접근제어자가 private 일때 외부에서 필드를 접근 불가,
//	getter,setter를 통해서만 간접적인 접근이 가능하다.
	
	private String name;
	private int stuID;
	private int age;
	private String stuAdd;
	private String stuPhone;
	private double weight;
	private int mounth;
	
//	생성자 선언
	Student2() {}
	
	public Student2(String name, int stuID, int age, String stuAdd, String stuPhone, double weight, int mounth) {
		super(); //object 클래스 상속
		this.name = name;
		this.stuID = stuID;
		this.age = age;
		this.stuAdd = stuAdd;
		this.stuPhone = stuPhone;
		this.weight = weight;
		this.mounth = mounth;
	}

//	getter, setter
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

	public int getMounth() {
		return mounth;
	}

	public void setMounth(int mounth) {
		this.mounth = mounth;
	}

//	객체 자체를 프린트 할때 필드의 값 전체를 출력 할수있도록 toString() : object 의 메소드
	@Override
	public String toString() {
		return "Student2 name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + ", mounth=" + mounth;
	}

	
	
	
	
	
	
}



public class Initial_Field02 {

	public static void main(String[] args) {
//		1. 모든필드의 접근제어가자 private 이므로 직접 접근이 불자!X
//		setter를 사용해서 , 생성자를 사용해서 값을 할당 가능함.
		Student2 s1 = new Student2();
		
		s1.setName("세종대왕");
		s1.setAge(50);
		
		System.out.println(s1);
		
		
		
		
	}

}
