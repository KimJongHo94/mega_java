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


public class LoopEx04_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int cnt = 1;
		int result = 0;
		int score = 0;
		
		while (cnt <= 5) {
			
			int rNum1 = ran.nextInt(9) + 1;
			int rNum2 = ran.nextInt(9) + 1;
			
			result = rNum1 * rNum2;
			
			System.out.print(rNum1 + " X " + rNum2 + " = " + " ? ");
			int answer = scan.nextInt();
			
			if (answer == result) {
				score += 20;
				
			} else {
				score += 0;
			}
			cnt++;
		}
		System.out.println("총 획득 점수는 " + score + "점 입니다.");
	}

}
