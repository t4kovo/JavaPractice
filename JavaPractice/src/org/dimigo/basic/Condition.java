package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int high = 850;	// 고속버스 요금
		int light = 300;	// 경차 요금
		int els = 600;	// 그 외 요금
		
		int highadd = 300;	// 고속버스 추가요금
		int elsadd = 200;	// 경차, 그 외 추가요금
		
		String carkind = "그 외";	// 고속버스, 경차, 그 외
		int s = 25;	// 이동거리
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		System.out.printf("거리 : %dkm\n", s);
		switch(carkind){
		case "고속버스" :
			System.out.printf("차종 : %s\n", carkind);
			if(s <= 10) {
				System.out.printf("통행료 : %d원\n", high);
			}
			else {
				int highaddm = highadd * (s / 10);	// highaddm : 10km 초과 시마다 고속버스의 추가비용
				System.out.printf("통행료 : %d원\n", (high + highaddm));
			}
			return;
			
		case "경차" :
			System.out.printf("차종 : %s\n", carkind);
			if(s <= 10) {
				System.out.printf("통행료 : %d원\n", light);
			}
			else {
				int lightaddm = elsadd * (s / 10);	// lightaddm : 10km 초과 시마다 경차의 추가비용
				System.out.printf("통행료 : %d원\n", (light + lightaddm));
			}
			return;
		case "그 외" :
			System.out.printf("차종 : %s\n", carkind);
			if(s <= 10) {
				System.out.printf("통행료 : %d원\n", els);
			}
			else {
				int elsaddm = elsadd * (s / 10);	// elsaddm : 10km 초과 시마다 그 외의 추가비용
				System.out.printf("통행료 : %d원\n", (els + elsaddm));
			}
			return;
		}
		
	}

}
