/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Question.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String idol = "블락비";
		String band = "쏜애플";
		String food = "한식";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("은선이가 좋아하는 아이돌은?");
		String answeridol = scanner.nextLine();
		if(answeridol.equals(idol)) {
			System.out.println("정답이오");
		} else {
			System.out.println("틀렸소");
		}
		System.out.println("");
		
		System.out.println("은선이가 좋아하는 밴드는?");
		String answerband = scanner.nextLine();
		if(answerband.equals(band)) {
			System.out.println("정답이오");
		} else {
			System.out.println("틀렸소");
		}
		System.out.println("");
		
		System.out.println("은선이가 좋아하는 음식은?");
		String answerfood = scanner.nextLine();
		if(answerfood.equals(food)) {
			System.out.println("정답이오");
		} else {
			System.out.println("틀렸소");
		}
	}

}
