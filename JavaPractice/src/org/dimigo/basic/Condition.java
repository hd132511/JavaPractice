package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Type = "고속버스";			//경차, 고속버스, 그 외
		int d = 0; //주행거리
		int B_Money = 850;	//버스 기본요금
		int Car_Money = 300;	//경차 기본요금
		int Another_Money = 600;	//그 외 기본요금
		
		//주행거리가 0혹은, 0보다 작으면 메세지와 함께 돈은 0원으로 나옵니다.
		
		if(d <= 0)
			System.out.println("주행거리를 0이상인 수로 해주세요.");
		
		switch(Type) {
		case "고속버스" : 
			System.out.printf("거리 : %dkm\n", d);
			System.out.printf("차종 : %s\n", Type);
			if(d <= 0)
				System.out.println("통행료 : 0원\n");
			else if(d <= 10)
				System.out.printf("통행료 : %d원\n", B_Money);
			else if(d > 10)
				System.out.printf("통행료 : %d원\n", B_Money + (d/10) * 300);
			break;
		
		case "경차" :
			System.out.printf("거리 : %dkm\n", d);
			System.out.printf("차종 : %s\n", Type);
			if(d <= 0)
				System.out.println("통행료 : 0원\n");
			else if(d <= 10)
				System.out.printf("통행료 : %d원\n", Car_Money);
			else if(d > 10)
				System.out.printf("통행료 : %d원\n", Car_Money + (d/10) * 200);
			break;
	
		case "그 외" :
			System.out.printf("거리 : %dkm\n", d);
			System.out.printf("차종 : %s\n", Type);
			if(d <= 0)
				System.out.println("통행료 : 0원\n");
			else if(d <= 10)
				System.out.printf("통행료 : %d원\n", Another_Money);
			else if(d > 10)
				System.out.printf("통행료 : %d원\n", Another_Money + (d/10) * 200);
			break;
		}
	}
}