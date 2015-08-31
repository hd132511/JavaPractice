package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SmartPhone i1 = new IPhone("iPhone6", "애플", 700000);
		
		SmartPhone g1 = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		IPhone i = (IPhone)i1;
		Galaxy g = (Galaxy)g1;
		
		System.out.println(i1.toString());
		i1.turnOn();
		i1.pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		g1.toString();
		g1.turnOn();
		g1.pay();
		g1.useSpecialFunction(g);
		g1.turnOff();
	}

}
