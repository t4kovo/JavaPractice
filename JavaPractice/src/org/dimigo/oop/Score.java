/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Score.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		int tot = kor + math + eng;
		int ave = tot / 3;
		
		System.out.println("");
		System.out.println("<< 점수 출력 >>");
		StringBuilder sb = new StringBuilder("국어 점수 : ")
			.append(kor + " 점\n")
			.append("수학 점수 : ")
			.append(kor + " 점\n")
			.append("영어 점수 : ")
			.append(kor + " 점\n");
		System.out.println(sb);
	}

}
