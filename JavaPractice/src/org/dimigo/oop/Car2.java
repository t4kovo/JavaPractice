/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_ Car.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class Car2 {
	
	public String company = "현대자동차";
	public String model = "제네시스";
	public String color = "검정색";
	public int maxSpeed = 225;
	public int price = 50000000;
	
	public Car2() {
	}
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
}
