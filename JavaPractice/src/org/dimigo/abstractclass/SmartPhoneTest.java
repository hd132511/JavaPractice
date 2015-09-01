package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SmartPhone i1 = new IPhone("iPhone6", "Apple", 700000);
		
		SmartPhone g1 = new Galaxy("Galaxy S6", "Samsung", 650000);
		
		IPhone i = (IPhone)i1;
		Galaxy g = (Galaxy)g1;
		
		System.out.println(i1.toString());
		i1.turnOn();
		i1.pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		System.out.println(g1.toString());
		g1.turnOn();
		g1.pay();
		g1.useSpecialFunction(g);
		g1.turnOff();
	}

}
