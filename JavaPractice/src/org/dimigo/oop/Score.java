package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("국어 점수 입력 = >");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 = >");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		StringBuffer sb1 = new StringBuffer();
		
		int total = (kor + math + eng);
		
		sb1.append("<<점수 출력>>\n")
		.append("국어 점수 : " + kor + "\n")
		.append("수학 점수 : " + math + "\n")
		.append("영어 점수 : " + eng + "\n")
		.append("총점 : " + total + "\n")
		.append("평균 : " + String.format("%.1f", (kor+eng+math)/3.0) + "\n").toString();
		
		System.out.println(sb1);
		
		scanner.close();

	}

}
