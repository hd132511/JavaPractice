package org.dimigo.abstractclass;

public abstract class SmartPhone {

	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + " is turning on now.");
	}
	
	public void turnOff() {
		System.out.println(model + " is turning off now.");
		
	}
	
	public void pay(){
		
	}
	
	public void useSpecialFunction(SmartPhone phone) {
		if(this instanceof IPhone) {
			((IPhone) this).useAirDrop();
		} else if (this instanceof Galaxy) {
			((Galaxy) this).useWirelessCharging();
		}
	}

	@Override
	public String toString() {
		return "SmartPhone [모델명 = " + model + ", 제조사 = " + company
				+ ", 가격 =" + String.format("%,d", price) + " Won]";
	}
	
	
	
	
	
	
}
