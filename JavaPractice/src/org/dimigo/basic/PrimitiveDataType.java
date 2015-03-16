package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main (String [] args) {
		
		String s1 = "아이유";
		String s2 = "여자";
		String s3 = "남자";
		int age = 23;
		float height = 161.8f;
		float weight = 44.3f;
		char bt = 'A';
		
		boolean female = true;
		boolean male = false;
		
		System.out.println("<< 아이유 프로필>>");
		System.out.printf("이름 : %s\n", s1);
		if(female)
			System.out.printf("성별 : %s\n", s2);
		else
			System.out.printf("성별 : %s\n",s3 );
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("몸무게 : %.1fkg\n", weight);
		System.out.printf("혈액형 : %c형\n", bt);
	}

}
