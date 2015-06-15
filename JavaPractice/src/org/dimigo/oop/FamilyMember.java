/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ FamilyMember.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember() {
		
	}
	
	public FamilyMember(String memberName) {
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
