package chapter17.ex04;

import java.util.ArrayList;

//car객체를 3개정도 생성해서 ArrayList에 저장후 객체를 출력시 필드의 값을 출력 하도록함.
//for,Enhanced For,컬랙션 객체자체를 출력시

class Car{
	private String company;
	private String carModel;
	private String color;
	private int maxSpeed;
	
	
	
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getCarModel() {
		return carModel;
	}



	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]\n";
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCompany("A사");
		car1.setCarModel("A모델");
		car1.setColor("빨강색");
		car1.setMaxSpeed(100);
		
		Car car2 = new Car();
		car2.setCompany("B사");
		car2.setCarModel("B모델");
		car2.setColor("주황색");
		car2.setMaxSpeed(200);
		
		Car car3 = new Car();
		car3.setCompany("C사");
		car3.setCarModel("C모델");
		car3.setColor("노랑색");
		car3.setMaxSpeed(300);
		
		ArrayList<Car> c1 = new ArrayList<>();
		c1.add(car1);
		c1.add(car2);
		c1.add(car3);
		
		for(int i =0;i<c1.size();i++) {
			System.out.println(c1.get(i));
		}
		for(Car i:c1) {
			System.out.println("자동차 제조사: "+i.getCompany()+"\n자동차 모델: "+i.getCarModel()+"\n자동차 색깔: "+i.getColor()+"\n자동차 속력: "+i.getMaxSpeed());
		}
		System.out.println(c1);

	}

}
