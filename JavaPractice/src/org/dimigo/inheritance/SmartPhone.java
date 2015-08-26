/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ SmartPhone.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay() {
		System.out.println(company + " 페이로 결제합니다.");
	}
	
	public void useSpecialFunction(SmartPhone phone) {
		if(phone == null) return;
		
		
		if(phone instanceof IPhone) {
			IPhone i = (IPhone)phone;
			i.useAirDrop();
			
			//((IPhone)i).useAirDrop();
		}
		else if(phone instanceof Galaxy) {
			Galaxy g = (Galaxy)phone;
			g.useWirelessCharging();
			
			//((Galaxy)g).useWirelessCharging();
		}
	}
	
	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price) + "원";
	}
}
