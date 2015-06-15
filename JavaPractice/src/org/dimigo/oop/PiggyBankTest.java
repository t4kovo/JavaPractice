/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ PiggyBankTest.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember famber1 = new FamilyMember("아빠");
		FamilyMember famber2 = new FamilyMember("엄마");
		FamilyMember famber3 = new FamilyMember("나");
		FamilyMember famber4 = new FamilyMember("남동생");
		
		famber4.printMemberCnt();
		
		PiggyBank pb = new PiggyBank();
		
		pb.putMoney(famber1, 10000);
		pb.putMoney(famber2, 5000);
		pb.putMoney(famber3, 2000);
		pb.putMoney(famber4, 1000);
		
		pb.printBalance();
		
		pb.putMoney(famber3, 1000);
		
		pb.printBalance();
	}

}
