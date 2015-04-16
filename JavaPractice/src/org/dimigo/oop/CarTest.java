package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("<< 자동차 목록 >>");
		
		car1.setCompany("현대자동차");
		car1.setModel("제네시스");
		car1.setColor("검정색");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		
		String Who_Made = "제조사명 : ";
		String Which_Model = "모델명 : ";
		String Which_Color = "색상 : ";
		String How_Fast = "최대속도 : ";
		String How_Much = "가격 : ";
		
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		
		System.out.println(Who_Made + car1.getCompany());
		System.out.println(Which_Model + car1.getModel());
		System.out.println(Which_Color + car1.getColor());
		System.out.println(How_Fast + car1.getMaxSpeed() + "km");
		System.out.println(How_Much + String.format("%,d",car1.getPrice()) + "원");
		
		System.out.println("");
		
		System.out.println(Who_Made + car2.getCompany());
		System.out.println(Which_Model + car2.getModel());
		System.out.println(Which_Color + car2.getColor());
		System.out.println(How_Fast + car2.getMaxSpeed() + "km");
		System.out.println(How_Much + String.format("%,d",car2.getPrice()) + "원");
		
		System.out.println("");
		
		System.out.println(Who_Made + car3.getCompany());
		System.out.println(Which_Model + car3.getModel());
		System.out.println(Which_Color + car3.getColor());
		System.out.println(How_Fast + car3.getMaxSpeed() + "km");
		System.out.println(How_Much + String.format("%,d",car3.getPrice()) + "원");
			
			}
	}