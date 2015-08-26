/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ IPhone.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class IPhone extends SmartPhone {
	public IPhone() {
		
	}
	
	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		super.pay();
	}
	
	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
