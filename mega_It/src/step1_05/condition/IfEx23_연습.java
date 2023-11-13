package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺄셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_연습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum1 = ran.nextInt(10) + 1;
		int rNum2 = ran.nextInt(10) + 1;
		int rNum3 = ran.nextInt(4) + 1;
		
		int choice = 0;
		int result = 0;
		int result2 = 0;
		
		choice = ran.nextInt(4) + 1;
		
		if (choice == 1) { // 덧셈
			result = rNum1 + rNum2;
			result2 = 1;
		} 
		if (choice == 2) { // 빼기
			result = rNum1 - rNum2;
			result2 = 2;
		}
		if (choice == 3) { // 곱셈
			result = rNum1 * rNum2;
			result2 = 3;
		}
		if (choice == 4) { // 나머지
			result = rNum1 % rNum2;
			result2 = 4;
		}
		System.out.println(rNum1 + " ? " + rNum2 + " = " + result);
		System.out.print("1) 덧셈	  2)  뺄셈     3) 곱셈	 4) 나머지 중 하나를 고르세요 : ");
		int answer = scan.nextInt();
		
		if (answer == result2) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
	}

}
