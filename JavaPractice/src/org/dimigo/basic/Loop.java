/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_ Loop.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 17.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}

}
