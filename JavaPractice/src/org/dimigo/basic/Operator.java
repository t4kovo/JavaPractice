package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		double h = 5.8;
		
		int pa = 9;
		double ph = 5.4;
		
		System.out.println("<< 도형 넓이 비교 >>");
		
		double sadari = (double) (a + b) * h / 2;
		System.out.printf("사다리꼴 넓이 : %.1f\n", sadari);
		
		double pyeong = pa * ph;
		System.out.printf("평행사변형 넓이 : %.1f\n", pyeong);
		
		if (sadari >= pyeong) {
			System.out.printf("사다리꼴이 평행사변형 보다 %.1f 더 크다.", (sadari - pyeong));
		}
		else if(sadari == pyeong) {
			System.out.printf("사다리꼴과 평행사변형의 넓이가 각각 %.1f, %.1f로 같습니다.", sadari, pyeong);
		}
		else {
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f 더 크다.", (pyeong - sadari));
		}
	}

}
