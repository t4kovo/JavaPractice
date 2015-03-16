package org.dimigo.basic;

/** 자바도큐먼트
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015.3.13
 * @author 최은선
 * @version 1.0
 */

public class PrimitiveDataType {

	public static void main(String[] args) {
			String name = "아이유";
			boolean ismale = false;
			int age = 23;
			double height = 161.8;
			float weight = 44.3f;
			char bloodtype = 'A';
			
			System.out.println("<< 아이유 프로필 >>");
			System.out.printf("이름 : %s\n", name);
			System.out.printf("성별 : ");
			if (ismale == true){
				System.out.println("남자");
			}else{
				System.out.println("여자");
			}
			System.out.printf("나이 : %d\n", age);
			System.out.printf("키 : %.1f\n", height);
			System.out.printf("몸무게 : %.1f\n", weight);
			System.out.printf("혈액형 : %c\n", bloodtype);
	}

}
