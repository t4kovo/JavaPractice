/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	|_ Race.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class Race2 {
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread r1 = new Thread(new Runner2("정욱재"));
		Thread r2 = new Thread(new Runner2("박승진"));
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
	}
}
