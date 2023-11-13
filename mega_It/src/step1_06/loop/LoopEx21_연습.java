package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran   = new Random();
		
		int score = 0;
		int passCnt = 0;
		int result = 0;
		
		for (int i = 1; i <= 5; i++) {
			int rNum1 = ran.nextInt(8) + 2;
			int rNum2 = ran.nextInt(9) + 1;
			
			result = rNum1 * rNum2;
			
			System.out.print(rNum1 + " X " + rNum2 + " = ?");
			int myAnswer = scan.nextInt();
			
			if (myAnswer == result) {
				passCnt += 1;
			}
			
		}
		
		score = passCnt * 20;
		System.out.println("게임이 종료되었습니다.");
		System.out.println("총 점수는 " + score + "점 입니다.");
		
		scan.close();
		
	}

}
