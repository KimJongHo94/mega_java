package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int ranNum = ran.nextInt(101) + 150; // [150 ~ 250]
		
		System.out.println("가운데 숫자 맞추기 게임");
		System.out.println("문제 : " + ranNum);
		
		System.out.print("정답을 입력하세요 : ");
		int me = scan.nextInt();
		
		int answer = 0;
		
		answer = (ranNum % 100) / 10;
		
		if (answer == me) {
			System.out.println("정답!");
		} else {
			System.out.println("오답");
		}
		
		scan.close();
		
	}

}
