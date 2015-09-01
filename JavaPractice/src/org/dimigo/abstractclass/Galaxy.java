package org.dimigo.abstractclass;

public class Galaxy extends SmartPhone{


	public Galaxy(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}

	public void pay() {
		System.out.println("Pay with SamSung Pay");
	}
	
	public void useWirelessCharging() {
		System.out.println("Use Wireless Charging.");
	}
	
}
