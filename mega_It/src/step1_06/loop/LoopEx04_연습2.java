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


public class LoopEx04_연습2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int score = 0;
		
		while (i <= 5) {
			
			int rNum1 = ran.nextInt(9) + 1;
			int rNum2 = ran.nextInt(9) + 1;
			
			int result = rNum1 * rNum2;
			
			System.out.println(rNum1 + " X " + rNum2 + " = " + " ? ");
			System.out.print("정답을 입력하세요 : ");
			int answer = scan.nextInt();
			
			if (answer == result) {
				score += 1;
			} else {
				score = 0;
			}
			
			i++;
		}
		int totalScore = score * 20;
		System.out.println("최종 점수는 : " + totalScore + "입니다.");
		scan.close();

	}

}
