/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ SmartPhoneTest.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone i = new IPhone("iPhone 6", "애플", 700000);
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(i.toString());
		i.turnOn();
		i.pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		System.out.println();
		System.out.println(g.toString());
		g.turnOn();
		g.pay();
		g.useSpecialFunction(g);
		g.turnOff();
	}

}
