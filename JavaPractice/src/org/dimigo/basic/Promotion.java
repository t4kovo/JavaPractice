package org.dimigo.basic;

/** 자바도큐먼트
 * << 디미베네 연간 인건비 >>
 * 
 * 작성일자 : 2015.3.17
 * @author 최은선
 * @version 1.0
 */

public class Promotion {

		public static void main(String[] args) {
			int money = 1700000;
			int num = 3;
			int store = 1500;
			
			System.out.println("<< 디미베네 연간 인건비 >>");
			
			System.out.println("월 평균 급여 : " + String.format("%,d원", money));
			
			System.out.println("점포 내 직원 수 : " + num + "명");
			
			System.out.println("점포 수 : " + String.format("%,d개", store));
			
			System.out.println("");
			
			long cost = (long) money * num * store * 12;
			System.out.println("연간 인건비 : " + String.format("%,d원", cost));
		}
}
