package chapter10.ex10;

import java.util.Objects;

class C{
	String stuID;
	String name;
	int age;
	
	//생성자, 기본생성자1, 생성자2
	C (){}
	
	
	public C(String stuID) {
		this.stuID = stuID;
	}

	public C(int age) {
		
		this.age = age;
	}

	public C(String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, stuID);
	}

//	C1.equals(c2) //stuID필드를 재정의 해서, stuID가같은면 true, 아니면 false

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		C other = (C) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(stuID, other.stuID);
	}

//	toString 메소드 재정의: 필드의 값을 출력, 객체
	
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		C c = new C("1111","홍길동",22);
		C c1 = new C("1111");
		C c2 = new C("1111");
		System.out.println(c1.equals(c2));
		System.out.println(c);
		
	}

}
