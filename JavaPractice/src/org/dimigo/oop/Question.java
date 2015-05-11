package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 문제");
		System.out.println("학번을 입력하세요.");
		String Question1 = "2511";
		String Answer1 = scanner.nextLine();
		if((Answer1).equals(Question1))
			System.out.println("정답!"); 
		else
			System.out.println("오답!");
		
		System.out.println("두 번째 문제");
		System.out.println("오늘 점심이 맛있을지 아닐지를 예측하세요.(Yes/No)");
		String Question2 = "Yes";
		String Answer2 = scanner.nextLine();
		if((Answer2).equals(Question2))
			System.out.println("정답!");
		else
			System.out.println("오답!");
		
		System.out.println("세 번째 문제");
		System.out.println("무당벌레의 학명을 입력하세요.");
		String Question3 = "Harmonia axyridis";
		String Answer3 = scanner.nextLine();
		if((Answer3).equals(Question3))
			System.out.println("정답!");
		else
			System.out.println("오답!");
		
		scanner.close();
		
		
		}
}