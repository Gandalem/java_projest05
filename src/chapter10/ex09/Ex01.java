package chapter10.ex09;

class Car{
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	
	Car(){}
	
	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
	
	
	
	
	
	
}





public class Ex01 {

	public static void main(String[] args) {
//		1. 기본생성자, 인풋을 받는 생성자,
//		2.getter,setter생성
//		3. toString() 재정의 : 전체 매모리 내용 출력.
//		4. 생성자를 통해서 값을 할당후 메모리의 전체 내용 출력
//		5. setter를 사용 해서 필드의 값을 할당메모리 천체 내용을 출력
//			getter를 사용해서 각내용을 출력
		
		System.out.println("생성자를 통해 입력 및 출력");
		Car car = new Car("현대","흰색",250,"SUV");
		
		System.out.println(car);
		System.out.println(car.toString());
		
		System.out.println("=====================");
		System.out.println("get,set을 통행 입력 및 출력");
		Car car1 = new Car();
		
		car1.setCarName("람보");
		car1.setCarColor("red");
		car1.setMaxSpeed(999);
		car1.setCarModel("SUV1");
		
		System.out.println(car1.getCarName()+" "+car1.getCarColor()+" "+car1.getMaxSpeed()+" "+car1.getCarModel());
		
		
		
		
		
	}

}
