package step1_05.condition;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_연습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		String answer = "";
		
		int ranNum = ran.nextInt(50) + 1;
		int result1 = 0;
		int result2 = 0;
		
		result1 = ranNum / 10; // 10의 자리
		result2 = ranNum % 10; // 1의 자리
		
		if (result1 == 3 || result1 == 6 || result1 == 9) {
			answer += "짝";
		}
		if (result2 == 3 || result2 == 6 || result2 == 9) {
			answer += "짝";
		}
		
		System.out.println(ranNum);
		System.out.println(answer != null ? answer : ranNum);
	}

}
