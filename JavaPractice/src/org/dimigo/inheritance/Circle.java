/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ Circle.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class Circle extends Figure {
	private int radius;
	
	public Circle(int radius) {
		super(0, 0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return Math.PI * radius * radius;
	}
}