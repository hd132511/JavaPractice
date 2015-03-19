package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int m_s = 1700000;
		int clerk = 3;
		int store = 1500;
		long total = (long)m_s * clerk * store * 12;
		
		// TODO Auto-generated method stub
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d원", m_s));
		System.out.println("점포 내 직원 수 : " + String.format("%,d명", clerk));
		System.out.println("점포 수 :"  + String.format("%,d개\n", store));
		System.out.println("연간 인건비 : " + String.format("%,d원", total ));
		
	}

}
