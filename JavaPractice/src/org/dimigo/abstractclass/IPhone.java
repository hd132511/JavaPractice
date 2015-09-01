package org.dimigo.abstractclass;

public class IPhone extends SmartPhone{


	public IPhone(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}

	public void pay() {
		System.out.println("Pay with Apple Pay");
	}
	
	public void useAirDrop() {
		System.out.println("Use AirDrop Ability");
	}
	
}
