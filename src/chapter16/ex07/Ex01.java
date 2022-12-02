package chapter16.ex07;

abstract class Fluit{
	abstract void print(); //추상 메소드 , 객체의 필드 정보를 출력
}

class Apple extends Fluit{
	private String name;
	private int price;
	
//	getter, setter를 통해서 인풋
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	print(메소드 오버라이딩해서 필즈의 정보를 출력)
	@Override
	void print() {
		System.out.println("이름 : "+this.name+"\n가격 : "+this.price+"원\n");
		
	}
	
}
class Banana extends Fluit{
	private String name;
	private int price;
	
//	getter, setter를 통해서 인풋
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	void print() {
		System.out.println("이름 : "+this.name+"\n가격 : "+this.price+"원\n");
		
	}
}
// 제너릭 클래스에 저장 불가
class pencil {
	private String name;
	private int price;
	
//	getter, setter를 통해서 인풋
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void print() {
		System.out.println("이름 : "+this.name+"\n가격 : "+this.price+"원\n");
		
	}
}

//제너릭 클래스 : Fluit을 상속하는 클래스만 저장할수 있는 제너릭 클래스
class GenericClass<T extends Fluit>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}




public class Ex01 {

	public static void main(String[] args) {
		Apple app = new Apple();
		app.setName("사과");
		app.setPrice(1000);
		app.print();
		
		Banana ba = new Banana();
		ba.setName("바나나");
		ba.setPrice(3000);
		ba.print();
		
		pencil pen = new pencil();
		pen.setName("연필");
		pen.setPrice(500);
		pen.print();
		
		
		System.out.println("============");
		GenericClass<Fluit> f1 = new GenericClass<>();
		f1.setT(app);
		f1.getT().print();
		
		f1.setT(ba);
		f1.getT().print();
		
// (오류)	f1.setT(pen);		//pencil타입은 fluit의 포함하고있지 않아 사용이 불가능하다.
//		f1.getT().print();	

	}

}
