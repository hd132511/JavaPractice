package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		
		//변수명 앞에 T가 붙은건 사다리꼴의 변수
		//변수명 앞에 P가 붙은건 평행사변형의 변수
		
		int T_a = 9, T_b = 10;
		double T_h = 5.8;
		
		int P_a = 9;
		double P_h = 5.4;
		
		double trapezoid = ((T_a + T_b )* T_h) / 2;						//사다리꼴
		double parrelogram = P_a * P_h;											//평행사변형
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사다리꼴의 넓이 : %.1f\n", trapezoid);
		System.out.printf("평행사변형의 넓이 : %.1f", parrelogram);
		System.out.println("\n\n");
		if (trapezoid > parrelogram)
			System.out.printf("사다리꼴이 평행사변형보다 %.1f 더 큽니다.\n", trapezoid - parrelogram);
		else if(trapezoid == parrelogram)
			System.out.println("사다리꼴과 평행사변형의 넓이는 서로 같습니다.");
		else
			System.out.printf("평행사변형이 사다리꼴보다 %.1f 더 큽니다.\n", parrelogram - trapezoid);
	}
}
