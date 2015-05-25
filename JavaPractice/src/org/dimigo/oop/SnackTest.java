package org.dimigo.oop;

public class SnackTest {
	
	public static void main(String[] args) {

	
	Snack[] Snack1 = new Snack[]{new Snack("새우깡", "농심" ,1100, 2)};
	Snack[] Snack2 = new Snack[]{new Snack("콘칲", "크라운", 1200, 1)};
	Snack[] Snack3 = new Snack[]{new Snack("허니버터칩", "해태", 1500, 4)};
	
	int total = 0;
	
	for(Snack snack : Snack1){
		snack.printSnack();
		total = total + snack.calcPrice();
		System.out.println();
	}
	
	for(Snack snack : Snack2){
		snack.printSnack();
		total = total + snack.calcPrice();
		System.out.println();
	}
	
	for(Snack snack : Snack3){
		snack.printSnack();
		total = total + snack.calcPrice();
		System.out.println();
	}
	
	System.out.println("총 구매 금액 : " + String.format("%,d", total) + "원");
	
	}
	
}