/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ PiggyBank.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class PiggyBank {
	private int balance;
	
	public void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
	}
	
	public void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance);
	}
}
